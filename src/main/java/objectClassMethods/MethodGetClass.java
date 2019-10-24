/*
Метод getClass позволяет получить тип данного объекта.
*/
package objectClassMethods;

public class MethodGetClass {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Renault");
        System.out.println(car.getClass());
        // Результат - "class objectClassMethods.Vehicle"
    }
}