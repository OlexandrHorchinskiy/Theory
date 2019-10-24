package oop.encapsulation;

public class Office {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Андрій");
        person.setSurname("Шевченко");
        person.setProfession("бухгалтер");
        person.setAge(32);
        person.setHeight(175);

        System.out.println(person.getFullName());
        System.out.println(person.getFullInfo());
    }
}