package objectClassMethods;

class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }


    // Перевизначений метод toString()
    @Override
    public String toString() {
        return "Vehicle " + brand;
    }


    // Перевизначений метод hashCode()
    @Override
    public int hashCode() {
        return brand.hashCode();
    }


    // Перевизначений метод equals()
    /*
    Метод equals принимает в качестве параметр объект любого типа, который мы затем приводим к текущему,
    если они являются объектами одного класса.
    Оператор instanceof позволяет выяснить, является ли переданный в качестве параметра объект объектом определенного класса,
    в данном случае класса Person. Так как если объекты принадлежат к разным классам, то их сравнение не имеет смысла,
    и возвращается значение false.
    Затем сравниваем по именам. Если они совпадают, возвращаем true, что будет говорить, что объекты равны.
    */
    @Override
    public boolean equals(Object obj) {
        if (!( obj instanceof Vehicle )) return false;

        Vehicle v = (Vehicle) obj;
        return this.brand.equals(v.brand);
    }
}