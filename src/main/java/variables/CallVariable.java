package variables;

import java.util.Scanner;

public class CallVariable {
    private static int widthInClass;

    public static void main(String[] args) {
        // input data
        Scanner inputData = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width = inputData.nextInt();
        System.out.println("Введите высоту прямоугольника");
        int height = inputData.nextInt();

        // function call
        changeValue(width);
        drawRectangleVertical(height);
    }

    //  add function
    private static void changeValue(int width) {
        widthInClass = width;
    }

    //  add function
    private static void drawRectangleVertical(int height) {
        if (height >= 2)
            drawRectangleVertical(height - 1);
        drawRectangleHorisontal(widthInClass);
        System.out.print("\n");
    }

    //  add function
    private static void drawRectangleHorisontal(int width) {
        if (width >= 2)
            drawRectangleHorisontal(width - 1);
        System.out.print("+");
    }
}