package oop.inheritance.exampleVehicle.motorVehicle;

public enum MotorType {
    NOT_SPECIFIED("не вказано"),
    GASOLINE("бензиновий"),
    DIESEL("дизельний"),
    ELECTRIC("електричний");

    private String translation;

    MotorType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}