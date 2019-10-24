/*
Метод equals сравнивает два объекта на равенство.
*/
package objectClassMethods;

public class MethodEquals {
    public static void main(String[] args) {
        Vehicle renault = new Vehicle("Renault");
        Vehicle nissan = new Vehicle("Nissan");
        System.out.println(renault.equals(nissan));
        // Результат - "false"

        Vehicle renault2 = new Vehicle("Renault");
        System.out.println(renault.equals(renault2));
        // Результат - "true"
    }
}