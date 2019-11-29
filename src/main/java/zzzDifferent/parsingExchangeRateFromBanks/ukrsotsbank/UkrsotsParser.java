package zzzDifferent.parsingExchangeRateFromBanks.ukrsotsbank;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import zzzDifferent.parsingExchangeRateFromBanks.Currency;

import java.io.IOException;
import java.util.ArrayList;


public class UkrsotsParser {
    public static void main(String[] args) throws UnirestException {
        String url = "https://www.ukrsotsbank.com/";
        Document page = null;
        Currency currency;
        ArrayList<Currency> currencies = new ArrayList<>();

        // Get a page.
        try {
            page = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (page != null) {
            // Get elements form page.
            String text = page.getElementsByClass("c currency")
                    .get(0).getElementsByClass("rate")
                    .get(0).getAllElements()
                    .get(0).text();

            // Dividing text.
            String[] parts = text.split(" ");
            for (int i = 3; i < parts.length - 2; i = i + 3) {
                currency = new Currency();
                currency.setName(parts[i]);
                currency.setPurchaseRate(Double.valueOf(parts[i + 1]));
                currency.setSellingRate(Double.valueOf(parts[i + 2]));
                currencies.add(currency);
            }
        }

        System.out.println(currencies);
    }
}