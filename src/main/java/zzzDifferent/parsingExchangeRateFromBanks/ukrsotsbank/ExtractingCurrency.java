package zzzDifferent.parsingExchangeRateFromBanks.ukrsotsbank;

import zzzDifferent.parsingExchangeRateFromBanks.Currency;
import zzzDifferent.parsingExchangeRateFromBanks.CurrencyLiteralCode;

public class ExtractingCurrency {
    public static void main(String[] args) {
        String inputData = "28.11.2019 Купівля Продаж " +
                "UAH/USD 23.9300 24.1500 " +
                "UAH/EUR 26.3000 26.6000 " +
                "UAH/RUB 0.3500 0.3810 " +
                "Архiв курсiв";
        String bankName = "Ukrsots";
        Currency currency = new Currency();

        String[] parts = inputData.split(" ");
        for (int i = 3; i < parts.length - 2; i = i + 3) {
            System.out.println(" - - - - - - - - - - - - - - - - ");
            System.out.println("i: " + i);
            currency.setCurrencyLiteralCode(chooseCurrencyCode(parts[i]));
            currency.setPurchaseRate(Double.valueOf(parts[i + 1]));
            currency.setSellingRate(Double.valueOf(parts[i + 2]));
            currency.setBankName(bankName);
            System.out.println(currency);
        }

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