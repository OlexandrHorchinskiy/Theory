package oop.inheritance.exampleVehicle.railedVehicle;

public enum RailedVehicleType {
    NOT_SPECIFIED("не вказано"),
    TRAIN("потяг"),
    TRAM("трамвай");

    private String translation;

    RailedVehicleType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}