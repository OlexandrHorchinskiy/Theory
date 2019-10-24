package workWithString.Tests;

public class GetPartFromJson {
    public static void main(String[] args) {
        String currencyNumeralCode;
        String currencyName;
        double currencyRate;
        String currencyExchangeDate;

        // JSON
//        { "r030":348,"txt":"Форинт","rate":0.0890715,"cc":"HUF","exchangedate":"22.07.2019" }
        String line = "{ \"r030\":348,\"txt\":\"Форинт\",\"rate\":0.0890715,\"cc\":\"HUF\",\"exchangedate\":\"22.07.2019\" }";


        // Get parts
        currencyNumeralCode = line.substring(line.indexOf("r030") + 6,line.indexOf("r030") + 9);
        currencyName = line.substring(line.indexOf("txt") + 6,line.indexOf("\",\"rate\""));
        currencyRate = Double.parseDouble(line.substring(line.indexOf("rate") + 6,line.indexOf("rate") + 6 + 9));
        currencyExchangeDate = line.substring(line.indexOf("exchangedate") + 15,line.indexOf("exchangedate") + 25);


        // Print
        System.out.println("currencyNumeralCode: " + currencyNumeralCode);
        System.out.println("currencyName: " + currencyName);
        System.out.println("currencyRate: " + currencyRate);
        System.out.println("currencyExchangeDate: " + currencyExchangeDate);
    }
}
