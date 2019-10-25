package collections.map.hashMap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Double> planets = new HashMap<>();

System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до (кожен наступний елемент додається в кінець)
        planets.put("Mercury", 2439.7);
        planets.put("Earth", 6371d);
        planets.put("Saturn", 58232d);
        planets.put("Neptune", 24622d);
        planets.put("Venus", 6051.8);
        System.out.println("\"planets\" після додавання елементів через: " + planets);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        HashMap<String, Double> forAdd = new HashMap<>();
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
        String planetName3 = "Planet_A";
        value = planets.remove(planetName3);
        System.out.println("\nпо ключу " + planetName3 + " видалено значення: " + value);
        System.out.println("\"planets\": " + planets);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        // Видалення елемента по ключу та значенню.
        boolean isRemoved;
        String planetName4 = "Planet_C";
        double planetRadius4 = 20000.2;
        isRemoved = planets.remove(planetName4, planetRadius4);
        System.out.println("по ключу " + planetName4 + " та значенню " + planetRadius4 + " елемент видалено з \"planets\": " + isRemoved);
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

/*
// множество элементов ввиде объектов интерфейса Map.Entry
        Set entries = planets.entrySet();

// перебор элементов Entry отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
        }

// перебор элементов отображения с помощью while
        entries = planets.entrySet();
        Iterator i = entries.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

// конвертирование Map в ArrayList: список ключей
        List keyList = new ArrayList(planets.keySet());

// конвертирование Map в ArrayList: список значений
        List valueList = new ArrayList(planets.valueSet());

// конвертирование Map в ArrayList: список ключ-значения
        List entryList = new ArrayList(planets.entrySet());

// упорядочивание Map по значениям
        List list = new ArrayList(planets.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Entry e1, Entry e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });
*/
    }
}