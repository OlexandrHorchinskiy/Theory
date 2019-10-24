/*
https://www.youtube.com/watch?v=IQo3xR0spLg
Методи зі змінною кількістю параметрів (змінних)
*/
package methods;

public class VariableParameterMethod {
    public static void main(String[] args) {
        System.out.println("Середнє арифметичне = " + calculateAverage(1, 2, 3, 4, 5));
    }

    public static double calculateAverage(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}