package oop.inheritance.exampleVehicle.motorVehicle;

public enum GearboxType {
    NOT_SPECIFIED("не вказано"),
    MANUAL("механічна"),
    AUTOMATED("автоматична"),
    ROBOTIC("роботизована"),
    CVT("варіаторна");

    private String translation;

    GearboxType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}