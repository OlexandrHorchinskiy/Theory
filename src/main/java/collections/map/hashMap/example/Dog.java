package collections.map.hashMap.example;

public class Dog {
    String name;
    private  int age;

    // Конструктор пустий
    public Dog() {
    }

    // Конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}