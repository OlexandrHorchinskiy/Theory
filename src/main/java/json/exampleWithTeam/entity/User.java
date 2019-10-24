package json.exampleWithTeam.entity;

public class User {
    public String name;
    public Gender gender;
    public int age;

    // Enum - перелік
    public enum Gender {
        male,
        female
    }

    // Конструктор
    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Перевантаження метода "toString()"
    @Override
    public String toString() {
        return "\nUser{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}