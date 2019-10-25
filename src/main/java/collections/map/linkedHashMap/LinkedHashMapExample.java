package collections.map.linkedHashMap;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> planets = new LinkedHashMap<>();

System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до (кожен наступний елемент додається в кінець)
        planets.put("Mercury", 2439.7);
        planets.put("Earth", 6371.0);
        planets.put("Saturn", 58232.0);
        planets.put("Neptune", 24622.0);
        planets.put("Venus", 6051.8);

        planets.putIfAbsent("Venus_2", 6051.8);

        System.out.println("\"planets\" після додавання елементів: " + planets);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        java.util.LinkedHashMap<String, Double> forAdd = new java.util.LinkedHashMap<>();
        forAdd.put("Planet_A", 30000.3);
        forAdd.put("Planet_B", 10000.1);
        forAdd.put("Planet_C", 20000.2);
        System.out.println("\"forAdd\":                                       " + forAdd);
        planets.putAll(forAdd);
        System.out.println("\"planets\" після об'єднання зі списком \"forAdd\": " + planets);


System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        System.out.println("\"planets\": \n\t" + planets);
        String key;
        Double value;
        Double defaultValue;

        // Повернення значення по ключу.
        key = "Earth";
        value = planets.get(key);
        System.out.println("по ключу " + key + " знаходиться значення:  " + value);

        // Повернення значення по ключу, якщо такого ключа не існує, повертається значення за замовчуванням (але не встановлюється).
        key = "Planet_X";
        defaultValue = 0.0;
        value = planets.getOrDefault(key, defaultValue);
        System.out.println("якщо ключ " + key + " відсутній, то значення " + defaultValue + ": " + value);


System.out.println("\n// Повернення та видалення елементів //////////////////////////////////////////////////");
        System.out.println("\"planets\": " + planets);

        // Повернення та видалення елемента по ключу.
        String key3 = "Planet_A";
        value = planets.remove(key3);
        System.out.println("\nпо ключу " + key3 + " видалено значення: " + value);
        System.out.println("\"planets\": " + planets);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        // Видалення елемента по ключу та значенню.
        boolean isRemoved;
        String key4 = "Planet_C";
        double value4 = 20000.2;
        isRemoved = planets.remove(key4, value4);
        System.out.println("по ключу " + key4 + " та значенню " + value4 + " елемент видалено з \"planets\": " + isRemoved);
        System.out.println("\"planets\": " + planets);


//        // Видалення всіх елементів списка.
//        planets.clear();
//        System.out.println("\n\"planets\" після видалення всіх елементів: " + planets);


System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        System.out.println("\"planets\":                                                     " + planets);
        // Повернення значення елемента та його оновлення.
        key = "Planet_B";
        Double oldValue;
        Double newValue = 12345.6;
        oldValue = planets.replace(key, newValue);
        System.out.println("\nдо оновлення елемента по ключу " + key + " значення: " + oldValue);
        System.out.println("\"planets\" після оновлення елемента по ключу " + key + " значення: " + planets);

        // Оновлення значення елемента.
        boolean isReplace;
        key = "Planet_B";
        oldValue = 12345.6;
        newValue = 65432.1;
        isReplace = planets.replace(key, oldValue, newValue);
        System.out.println("\nчи відбулося оновлення елемента по ключу " + key + ": " + isReplace);
        System.out.println("\"planets\" після оновлення елемента по ключу " + key + " значення: " + planets);

// TODO:        planets.replaceAll();


System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        boolean isExist;
        boolean isEmpty;

        // Перевірка чи пустий список.
        isEmpty = planets.isEmpty();
        System.out.println("чи \"planets\" пустий:                            " + isEmpty);

        // Перевірка наявності ключа в списку.
        isExist = planets.containsKey("Earth");
        System.out.println("в \"planets\" наявний елемент з ключем Earth:     " + isExist);

        // Перевірка наявності значення в списку.
        isExist = planets.containsValue(58232d);
        System.out.println("в \"planets\" наявний елемент зі значенням 58232: " + isExist);


System.out.println("\n// Інше ///////////////////////////////////////////////////////////////////////////////");
        // Повернути розмір списка.
        System.out.println("\"planets\" має розмір:   " + planets.size());

        // Повернення списку ключів.
        Set keys = planets.keySet();
        System.out.println("\"planets\" має ключі:    " + keys);

        // Повернення списку значень.
        Collection<Double> values = planets.values();
        System.out.println("\"planets\" має значення: " + values);

        ArrayList<Double> arr = new ArrayList<>(planets.values());
        System.out.println("\"planets\" має значення: " + arr);

        // Перебір елементів списку
        System.out.println("\nПеребір елементів списку");
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " | Value: " + me.getValue());
        }

        // Перебір елементів списку
        System.out.println("\nПеребір елементів списку");
        String keyMe;
        Double valueMe;
        for (Map.Entry me : planets.entrySet()) {
            keyMe = (String) me.getKey();
            valueMe = (Double) me.getValue();
            System.out.println("Key: " + keyMe + " | Value: " + valueMe);
        }
    }
}