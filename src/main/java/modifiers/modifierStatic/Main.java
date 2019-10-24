package modifiers.modifierStatic;

import static modifiers.modifierStatic.Actions.sumResult;

/*
 * Static
 * https://www.youtube.com/watch?v=sAI36xinP-Y&list=PLSvsv8dMp1keO63CxKfwCTQ6Z8M6MVnym&index=13&t=0s
 */
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // static
        sumResult = 1;  // завдяки модифікатору static можна викликати та змінити поле без створення екземпляра класа.
                        // Увага! Поле з модифікатором static зміниться для всіх екземплярів класу.
        sumResult = Actions.sum(a, b); // завдяки модифікатору static можна викликати метод без створення екземпляра класа.
        System.out.println("result \"sum\" = " + sumResult);

        // no static
        Actions action = new Actions(); // створення екземпляра класа.
        action.doubleSumResult = action.doubleSum(a, b); // без модифікатора static щоб викликати метод необхідно створити екземпляр класа.
        System.out.println("result \"doubleSum\" = " + action.doubleSumResult);
    }
}