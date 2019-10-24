/*
Метод hashCode позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту или его хэш-код.
По данному числу, например, можно сравнивать объекты.
Но мы можем задать (переопределить) свой алгоритм определения хэш-кода объекта.
*/
package objectClassMethods;

public class MethodHashCode {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Renault");
        System.out.println(car.hashCode());
        // Результат зі стандактним hashCode() - "716157500"
        // Результат зі перевизначеним hashCode() - "-1537972297"
    }
}