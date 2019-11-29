package zzzDifferent.parsingExchangeRateFromBanks.pravex;

import zzzDifferent.parsingExchangeRateFromBanks.Currency;
import zzzDifferent.parsingExchangeRateFromBanks.CurrencyLiteralCode;

public class ExtractingCurrency {
    public static void main(String[] args) {
        String inputData = "Долар США 23.9 24.15";
        String bankName = "Pravex";
        String currencyName = null;
        Currency currency = new Currency();

        String[] parts = inputData.split(" ");
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

        System.out.println(currency);
    }


    private static String chooseCurrencyCode(String text) {
        String currencyLiteralCode = "";

        try {
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
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        return currencyLiteralCode;
    }
}