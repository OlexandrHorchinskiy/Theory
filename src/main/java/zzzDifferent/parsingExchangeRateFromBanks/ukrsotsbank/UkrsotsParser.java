package zzzDifferent.parsingExchangeRateFromBanks.ukrsotsbank;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import zzzDifferent.parsingExchangeRateFromBanks.Currency;
import zzzDifferent.parsingExchangeRateFromBanks.CurrencyLiteralCode;

import java.io.IOException;
import java.util.ArrayList;

public class UkrsotsParser {
    public static void main(String[] args) throws UnirestException {
        String url = "https://www.ukrsotsbank.com/";
        ArrayList<Currency> currencies = new ArrayList<>();

        currencies = parser(url, currencies);

        System.out.println(currencies);
    }


    private static ArrayList<Currency> parser(String url, ArrayList<Currency> currencies) {
        Document page = null;
        Elements elements;

        // Get a page.
        try {
            page = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get elements form page.
        if (page != null) {
            elements = page.getElementsByClass("c currency")
                    .get(0).getElementsByClass("rate")
                    .get(0).getAllElements();

            currencies = getCurrencies(elements, currencies);
        }

        return currencies;
    }


    private static ArrayList<Currency> getCurrencies(Elements elements, ArrayList<Currency> currencies) {
        String bankName = "Ukrsots";
        Currency currency;

        String text = elements.get(0).text();
        String[] parts = text.split(" ");
        for (int i = 3; i < parts.length - 2; i = i + 3) {
            currency = new Currency();
            currency.setCurrencyLiteralCode(chooseCurrencyCode(parts[i]));
            currency.setPurchaseRate(Double.valueOf(parts[i + 1]));
            currency.setSellingRate(Double.valueOf(parts[i + 2]));
            currency.setBankName(bankName);
            currencies.add(currency);
        }

        return currencies;
    }


    private static String chooseCurrencyCode(String text) {
        String currencyLiteralCode = "";

        switch (text) {
            case "UAH/USD":
                currencyLiteralCode = CurrencyLiteralCode.USD.name();
                break;
            case "UAH/EUR":
                currencyLiteralCode = CurrencyLiteralCode.EUR.name();
                break;
            case "UAH/RUB":
                currencyLiteralCode = CurrencyLiteralCode.RUB.name();
                break;
        }

        return currencyLiteralCode;
    }
}