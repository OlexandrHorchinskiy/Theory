package collections.list.linkedList.entity;

public class Dog {
    String name;
    private int age;

    // Конструктор пустий
    public Dog() {
    }

    // Конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}