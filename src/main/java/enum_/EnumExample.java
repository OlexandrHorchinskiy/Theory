package enum_;

public class EnumExample {
    public static void main(String[] args) {

        DogType dogType = DogType.Dalmatian;

        if (dogType == DogType.Dalmatian) {
            System.out.println("It is Dalmatian!");
        }

        System.out.println();

// ---------------------------------------------------------------------------------------------------------------------
        SeasonType season = SeasonType.WINTER;

        switch (season) {
            case SUMMER:
                System.out.println("It is warm outside!");
            case WINTER:
                System.out.println("It is cold outside!");
        }

        System.out.println();

// ---------------------------------------------------------------------------------------------------------------------
        SeasonType_2 seasonType_2 = SeasonType_2.SPRING;

        System.out.println("Індекс в переліку:\t" + seasonType_2.ordinal());
        System.out.println("Назва в переліку:\t" + seasonType_2.name());
        System.out.println("Назва з перекладом:\t" + seasonType_2.getTranslation());
    }
}