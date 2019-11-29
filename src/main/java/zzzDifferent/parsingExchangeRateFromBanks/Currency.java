package zzzDifferent.parsingExchangeRateFromBanks;

public class Currency {
    private String currencyLiteralCode;
    private Double purchaseRate;
    private Double sellingRate;
    private String bankName;

    public String getCurrencyLiteralCode() {
        return currencyLiteralCode;
    }

    public void setCurrencyLiteralCode(String currencyLiteralCode) {
        this.currencyLiteralCode = currencyLiteralCode;
    }

    public Double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(Double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public Double getSellingRate() {
        return sellingRate;
    }

    public void setSellingRate(Double sellingRate) {
        this.sellingRate = sellingRate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "\nCurrency{" +
                "currencyLiteralCode=" + currencyLiteralCode +
                ", purchaseRate=" + purchaseRate +
                ", sellingRate=" + sellingRate +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}