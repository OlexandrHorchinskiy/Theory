package oop.inheritance.exampleVehicle;

public class Vehicle {
    public String brand;
    public String model;
    public int productionYear;

    public void move() {
        System.out.println("Транспортний засіб рехається");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}