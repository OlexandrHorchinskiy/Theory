package collections.map.hashMap.example;
/*

*/
import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        Dog dog;
        HashMap<String, Dog> dogs = new HashMap<>();

        // додавання елементів
        dogs.put("dog1", new Dog("Барбос", 2));
        dogs.put("dog2", new Dog("Тузик", 1));
        dogs.put("dog3", new Dog("Рекс", 3));
        dogs.put("dog4", new Dog("Люсі", 2));

        // отримання елемента по ключу
        dog = dogs.get("dog3");
        System.out.println("ім'я собаки: " + dog.getName() + "  |  вік собаки: " + dog.getAge() + " років");

        // видалення елемента по ключу
        dogs.remove("dog3");

        // _________________
        System.out.println("список пустий: " + dogs.isEmpty());


        // _________________


//        // очистка списка
//        dogs.clear();

        // кількість елементів списка
        System.out.println("кількість елементів: " + dogs.size());
    }
}