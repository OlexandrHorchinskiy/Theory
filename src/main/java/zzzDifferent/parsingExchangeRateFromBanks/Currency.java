package zzzDifferent.parsingExchangeRateFromBanks;

public class Currency {
    private String name;
    private Double purchaseRate;
    private Double sellingRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "\nCurrency{" +
                "name='" + name + '\'' +
                ", purchaseRate=" + purchaseRate +
                ", sellingRate=" + sellingRate +
                '}';
    }
}