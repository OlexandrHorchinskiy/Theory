package zzzDifferent.parsingExchangeRateFromBanks.pravex;

import zzzDifferent.parsingExchangeRateFromBanks.Currency;

public class ExtractingCurrency {
    public static void main(String[] args) {
        String inputData = "Долар США 23.9 24.15";
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

        System.out.println(currency);
    }
}