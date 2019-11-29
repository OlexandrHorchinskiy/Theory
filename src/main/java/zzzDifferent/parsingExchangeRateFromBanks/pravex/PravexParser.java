package zzzDifferent.parsingExchangeRateFromBanks.pravex;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import zzzDifferent.parsingExchangeRateFromBanks.Currency;

import java.io.IOException;
import java.util.ArrayList;


public class PravexParser {
    public static void main(String[] args) throws UnirestException {
        String url = "https://www.pravex.com.ua/kursy-valyut";
        Document page = null;
        Elements elements;
        ArrayList<Currency> currencies = new ArrayList<>();

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

            for (int i = 0; i < elements.size(); i++) {
                currencies.add(divideText(elements.get(i).text()));
            }
        }

        System.out.println(currencies);
    }


    private static Currency divideText(String inputData) {
        Currency currency = new Currency();

        String[] parts = inputData.split(" ");
        for (int i = ( parts.length - 1 ); i >= 0; i--) {
            if (( parts.length - 1 ) == i) {
                currency.setSellingRate(Double.valueOf(parts[i]));
            } else if (( parts.length - 2 ) == i) {
                currency.setPurchaseRate(Double.valueOf(parts[i]));
            } else {
                if (currency.getName() == null) {
                    currency.setName(parts[i]);
                } else {
                    currency.setName(parts[i].concat(" ").concat(currency.getName()).trim());
                }
            }
        }

        return currency;
    }

}