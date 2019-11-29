package zzzDifferent.parsingExchangeRateFromBanks;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

public class GoogleSearchExample {
    public static void main(String[] args) throws UnirestException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите запрос");
        String query = sc.nextLine();

        String result = search(query);
        System.out.println(result);
    }


    static String search(String query) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://www.google.com.ua/{type}") // {type} - змінна параметру
                .routeParam("type", "search") // "type" - назва параметру, "search" - значення параметру
                .queryString("q", query) // запит де "q" - назва змінної, query - змінна зі значенням
                .asString();

        return response.getBody();
    }
}