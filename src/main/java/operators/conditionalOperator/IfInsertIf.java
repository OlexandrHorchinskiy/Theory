package operators.conditionalOperator;

public class IfInsertIf {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {                                // перевіряється умова
            System.out.println("Ви неповнолітній(я)"); // якщо умова true, то виконується код в фігурних дужках {}
            if (age < 10) {                            // перевіряється умова (оператор "if" в даному випадку якляється вкладеним)
                System.out.println("Ви дуже юний(а)"); // якщо умова true, то виконується код в фігурних дужках {}

            } else {
                System.out.println("Вам залишилось " + ( 18 - age ) + " років до повноліття"); // якщо попередня умова false, то виконується код в фігурних дужках {}
                switch (age) { // (оператор "switch" в даному випадку якляється вкладеним)
                    case 17:
                        System.out.println("Повноліття скоро");
                        break;
                    default:
                        System.out.println("Повноліття не скоро");
                        break;
                }
            }
        } else {
            System.out.println("Ви повнолітній(я)");   // якщо попередня умова false, то виконується код в фігурних дужках {}
        }
    }
}