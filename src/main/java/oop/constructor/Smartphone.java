package oop.constructor;

public class Smartphone {

    private String brandName;
    private boolean isNew; // true = new, false = used
    private double price;

    // конструктор
    Smartphone() {
        this.brandName = "* НЕ ВКАЗАНО *"; // Присвоює полю (змінній) початкове значення.
    }

    // конструктор
    Smartphone(String brandName) {
        this.brandName = brandName; // Присвоює полю (змінній) початкове значення передане при створенні об'єкту класу.
    }

    // конструктор
    Smartphone(String brandName, int price) {
        this.brandName = brandName; // Присвоює полю (змінній) початкове значення передане при створенні об'єкту класу.
        this.price = price; // Присвоює полю (змінній) початкове значення передане при створенні об'єкту класу.
    }


    // Інкапсуляція
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        }
        this.price = price;
    }
}