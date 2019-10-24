/*
Метод toString служит для получения представления данного объекта в виде строки.
При попытке вывести строковое представления какого-нибудь объекта, как правило, будет выводиться полное имя класса.
Полученное значение вряд ли может служить хорошим строковым описанием объекта.
Поэтому метод toString() нередко переопределяют.
*/
package objectClassMethods;

public class MethodToString {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Renault");
        System.out.println(car.toString());
        // Результат зі стандактним toString() - "objectClassMethods.Vehicle@2aafb23c"
        // Результат зі перевизначеним toString() - "Vehicle Renault"
    }
}