package zzzDifferent.parsingExchangeRateFromBanks.pravex;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import zzzDifferent.parsingExchangeRateFromBanks.Currency;
import zzzDifferent.parsingExchangeRateFromBanks.CurrencyLiteralCode;

import java.io.IOException;
import java.util.ArrayList;

public class PravexParser {
    public static void main(String[] args) throws UnirestException {
        String url = "https://www.pravex.com.ua/kursy-valyut";
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
            elements = page.getElementsByAttributeValue("data-list", "base_pravex")
                    .get(0).getElementsByClass("currency clearfix");

            currencies = getCurrencies(elements, currencies);
        }

        return currencies;
    }


    private static ArrayList<Currency> getCurrencies(Elements elements, ArrayList<Currency> currencies) {
        String bankName = "Pravex";
        String currencyName = null;
        Currency currency;

        for (int e = 0; e < elements.size(); e++) {
            currency = new Currency();
            String[] parts = elements.get(e).text().split(" ");

            for (int i = ( parts.length - 1 ); i >= 0; i--) {
                if (( parts.length - 1 ) == i) {
                    currency.setSellingRate(Double.valueOf(parts[i]));
                } else if (( parts.length - 2 ) == i) {
                    currency.setPurchaseRate(Double.valueOf(parts[i]));
                } else {
                    if (currencyName == null) {
                        currencyName = parts[i];
                    } else {
                        currencyName = parts[i].concat(" ").concat(currencyName).trim();
                    }
                }
            }

            currency.setCurrencyLiteralCode(chooseCurrencyCode(currencyName));
            currencyName = null;
            currency.setBankName(bankName);

            currencies.add(currency);
        }

        return currencies;
    }


    private static String chooseCurrencyCode(String text) {
        String currencyLiteralCode = "";

        switch (text) {
            case "Долар США":
                currencyLiteralCode = CurrencyLiteralCode.USD.name();
                break;
            case "Євро":
                currencyLiteralCode = CurrencyLiteralCode.EUR.name();
                break;
            case "Російський рубль":
                currencyLiteralCode = CurrencyLiteralCode.RUB.name();
                break;
            case "Фунт стерлінгів":
                currencyLiteralCode = CurrencyLiteralCode.GBP.name();
                break;
            case "Австралійський долар":
                currencyLiteralCode = CurrencyLiteralCode.AUD.name();
                break;
            case "Форінт":
                currencyLiteralCode = CurrencyLiteralCode.HUF.name();
                break;
            case "Данська крона":
                currencyLiteralCode = CurrencyLiteralCode.RUB.name();
                break;
            case "Канадський долар":
                currencyLiteralCode = CurrencyLiteralCode.CAD.name();
                break;
            case "Норвезька крона":
                currencyLiteralCode = CurrencyLiteralCode.NOK.name();
                break;
            case "Шведська крона":
                currencyLiteralCode = CurrencyLiteralCode.SEK.name();
                break;
            case "Швейцарський франк":
                currencyLiteralCode = CurrencyLiteralCode.CHF.name();
                break;
            case "Японська єна":
                currencyLiteralCode = CurrencyLiteralCode.JPY.name();
                break;
        }

        return currencyLiteralCode;
    }
}