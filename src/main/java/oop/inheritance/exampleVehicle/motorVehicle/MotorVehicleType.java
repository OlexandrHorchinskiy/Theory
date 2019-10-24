package oop.inheritance.exampleVehicle.motorVehicle;

public enum MotorVehicleType {
    NOT_SPECIFIED("не вказано"),
    MOTORCYCLE("мотоцикл"),
    CAR("автомобіль легковий"),
    TRUCK("автомобіль вантажний"),
    BUS("автобус");

    private String translation;

    MotorVehicleType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}