package enum_;

public enum SeasonType_2 {
    // Кожна стрічка в enum це об'єкт класу enum.
    WINTER("зима"),
    SPRING("весна"),
    SUMMER("літо"),
    AUTUMN("осінь");

    // Поле
    private String translation;

    // Конструктор
    SeasonType_2(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}