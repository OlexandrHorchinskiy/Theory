package oop.inheritance.exampleVehicle.motorVehicle.car;

public enum CarBodyType {
    NOT_SPECIFIED("не вказано"),
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    CUV("універсал"),
    MINIVAN("мінівен"),
    SUV("позашляховик"),
    COUPE("купе"),
    PICKUP("пікап"),
    VAN("вантажівка");

    private String translation;

    CarBodyType(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}