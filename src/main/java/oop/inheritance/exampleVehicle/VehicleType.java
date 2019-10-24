package oop.inheritance.exampleVehicle;

public enum VehicleType {
    NOT_SPECIFIED("не вказано"),
    BICYCLES("велосипеди"),
    MOTOR_VEHICLES("моторні ТЗ"),
    RAILED_VEHICLES("рейкові ТЗ"),
    WATERCRAFT("водні ТЗ"),
    AMPHIBIOUS_VEHICLES("амфібії"),
    AIRCRAFT("повітряні ТЗ"),
    SPACECRAFT("космічні ТЗ");

    private String translation;

    VehicleType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}