package modifiers.modifierStatic;

public class Actions {
    static int sumResult; // Увага! Поле з модифікатором static зміниться для всіх екземплярів класу.
    int doubleSumResult;

    public static int sum(int a, int b) {
        return a + b;
    }

    public int doubleSum(int a, int b) {
        return ( a + b ) * 2;
    }
}