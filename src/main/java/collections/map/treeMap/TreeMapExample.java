package collections.map.treeMap;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> planets = new TreeMap<>();

System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до (кожен наступний елемент додається в кінець)
        planets.put("Mercury", 2439.7);
        planets.put("Earth", 6371.0);
        planets.put("Saturn", 58232.0);
        planets.put("Neptune", 24622.0);
        planets.put("Venus", 6051.8);

        planets.putIfAbsent("Venus_1", 1111.1);
        planets.putIfAbsent("Venus_3", 3333.3);

        System.out.println("\"planets\" після додавання елементів: \n\t" + planets);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        TreeMap<String, Double> forAdd = new TreeMap<>();
        forAdd.put("Planet_A", 30000.3);
        forAdd.put("Planet_B", 10000.1);
        forAdd.put("Planet_C", 20000.2);
        System.out.println("\"forAdd\": \n\t" + forAdd);
        planets.putAll(forAdd);
        System.out.println("\n\"planets\" після об'єднання зі списком \"forAdd\": \n\t" + planets);


System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        System.out.println("\"planets\": \n\t" + planets);
        String key;
        String keyForSearch;
        Double value;
        Double defaultValue;
        Entry entry;

        // Повернення значення по ключу.
        key = "Earth";
        value = planets.get(key);
        System.out.println("по ключу " + key + " знаходиться значення:  " + value);

        // Повернення значення по ключу, якщо такого ключа не існує, повертається значення за замовчуванням (але не встановлюється).
        key = "Planet_X";
        defaultValue = 0.0;
        value = planets.getOrDefault(key, defaultValue);
        System.out.println("якщо ключ " + key + " відсутній, то значення " + defaultValue + ": " + value);

        // Повернення прешого ключа.
        key = planets.firstKey();
        System.out.println("first key:   " + key);

        // Повернення останнього ключа.
        key = planets.lastKey();
        System.out.println("last key:    " + key);

        // Повернення прешого запису.
        entry = planets.firstEntry();
        System.out.println("first entry: " + entry);

        // Повернення останнього запису.
        entry = planets.lastEntry();
        System.out.println("last entry:  " + entry);

        /* Повернення запису по ключу;
           якщо такий ключ відсутній, то повертається запис з наступним ключем;
           якщо наступний запис відсутній, то повертається "null".*/
        System.out.println("\n\"planets\": \n\t" + planets);
        keyForSearch = "Venus_2";
        entry = planets.ceilingEntry(keyForSearch);
        System.out.println("key: " + keyForSearch + " | ceilingEntry: " + entry);

        /* Повернення ключа по ключу;
           якщо такий ключ відсутній, то повертається наступний ключ;
           якщо наступний ключ відсутній, то повертається "null".*/
        key = planets.ceilingKey(keyForSearch);
        System.out.println("key: " + keyForSearch + " | ceilingKey: " + key);

        /* Повернення запису по ключу;
           якщо такий ключ відсутній, то повертається запис з попереднім ключем;
           якщо попередній запис відсутній, то повертається "null".*/
        System.out.println("\n\"planets\": \n\t" + planets);
        keyForSearch = "Venus_2";
        entry = planets.floorEntry(keyForSearch);
        System.out.println("key: " + keyForSearch + " | floorEntry: " + entry);

        /* Повернення ключа по ключу;
           якщо такий ключ відсутній, то повертається попередній ключ;
           якщо попередній ключ відсутній, то повертається "null".*/
        key = planets.floorKey(keyForSearch);
        System.out.println("key: " + keyForSearch + " | floorKey: " + key);


System.out.println("\n// Повернення частини елементів ///////////////////////////////////////////////////////");
        SortedMap<String, Double> planetsPart;
        String fromKey = "Neptune";
        String toKey = "Saturn";
        boolean fromKeyInclusive = false; // "true" = включно, "false" не включно
        boolean toKeyInclusive = false; // "true" = включно, "false" не включно

        // Повернення частини списка "від ключа до ключа" з вже налаштованим "Inclusive" (fromKey - inclusive; toKey - not inclusive).
        System.out.println("\"planets\": \n\t" + planets);
        planetsPart = planets.subMap(fromKey, toKey);
        System.out.println("\"planetsPart\" .subMap(fromKey, toKey): \n\t" + planetsPart);

        // Повернення частини списка "від ключа до ключа" з ручним налаштуванням "Inclusive".
        System.out.println("\n\"planets\": \n\t" + planets);
        planetsPart = planets.subMap(fromKey, fromKeyInclusive, toKey, toKeyInclusive);
        System.out.println("\"planetsPart\" .subMap(fromKey, fromKeyInclusive, toKey, toKeyInclusive): \n\t" + planetsPart);

        // Повернення частини списка "від початку до ключа" з вже налаштованим "Inclusive" (toKey - not inclusive).
        System.out.println("\n\"planets\": \n\t" + planets);
        planetsPart = planets.headMap(toKey);
        System.out.println("\"planetsPart\" .headMap(toKey): \n\t" + planetsPart);

        // Повернення частини списка "від початку до ключа" з ручним налаштуванням "Inclusive".
        System.out.println("\n\"planets\": \n\t" + planets);
        planetsPart = planets.headMap(toKey, toKeyInclusive);
        System.out.println("\"planetsPart\" .headMap(toKey, toKeyInclusive): \n\t" + planetsPart);

        // Повернення частини списка "від ключа до кінця" з вже налаштованим "Inclusive" (fromKey - inclusive).
        System.out.println("\n\"planets\": \n\t" + planets);
        planetsPart = planets.tailMap(fromKey);
        System.out.println("\"planetsPart\" .tailMap(fromKey): \n\t" + planetsPart);

        // Повернення частини списка "від ключа до кінця" з ручним налаштуванням "Inclusive".
        System.out.println("\n\"planets\": \n\t" + planets);
        planetsPart = planets.tailMap(fromKey,fromKeyInclusive);
        System.out.println("\"planetsPart\" .tailMap(fromKey,fromKeyInclusive): \n\t" + planetsPart);


System.out.println("\n// Повернення та видалення елементів //////////////////////////////////////////////////");
        System.out.println("\"planets\": \n\t" + planets);

        // Повернення та видалення елемента по ключу.
        key = "Planet_A";
        value = planets.remove(key);
        System.out.println("\nпо ключу " + key + " видалено значення: " + value);
        System.out.println("\"planets\" після remove: \n\t" + planets);

        // Повернення та видалення прешого запису.
        entry = planets.pollFirstEntry();
        System.out.println("\nвидалено first entry: " + entry);
        System.out.println("\"planets\" після pollFirstEntry: \n\t" + planets);

        // Повернення та видалення останнього запису.
        entry = planets.pollLastEntry();
        System.out.println("\nвидалено last entry:  " + entry);
        System.out.println("\"planets\" після pollLastEntry: \n\t" + planets);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        System.out.println("\"planets\": \n\t" + planets);
        // Видалення елемента по ключу та значенню.
        boolean isRemoved;
        key = "Planet_C";
        value = 20000.2;
        isRemoved = planets.remove(key, value);
        System.out.println("\nпо ключу " + key + " та значенню " + value + " елемент видалено з \"planets\": " + isRemoved);
        System.out.println("\"planets\": \n\t" + planets);


//        // Видалення всіх елементів списка.
//        planets.clear();
//        System.out.println("\n\"planets\" після видалення всіх елементів: \n\t" + planets);




System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        System.out.println("\"planets\": \n\t" + planets);

        // Повернення значення елемента та його оновлення.
        key = "Planet_B";
        Double oldValue;
        Double newValue = 12345.6;
        oldValue = planets.replace(key, newValue);
        System.out.println("\nдо оновлення елемента по ключу " + key + " значення: " + oldValue);
        System.out.println("\"planets\" після оновлення елемента по ключу " + key + " значення: \n\t" + planets);

        // Оновлення значення елемента.
        boolean isReplace;
        key = "Planet_B";
        oldValue = 12345.6;
        newValue = 65432.1;
        isReplace = planets.replace(key, oldValue, newValue);
        System.out.println("\nчи відбулося оновлення елемента по ключу " + key + ": " + isReplace);
        System.out.println("\"planets\" після оновлення елемента по ключу " + key + " значення: \n\t" + planets);

// TODO:        planets.replaceAll();


System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        boolean isExist;
        boolean isEmpty;

        // Перевірка чи пустий список.
        isEmpty = planets.isEmpty();
        System.out.println("чи \"planets\" пустий:                              " + isEmpty);

        // Перевірка наявності ключа в списку.
        isExist = planets.containsKey("Earth");
        System.out.println("в \"planets\" наявний елемент з ключем Earth:       " + isExist);

        // Перевірка наявності значення в списку.
        isExist = planets.containsValue(58232.0);
        System.out.println("в \"planets\" наявний елемент зі значенням 58232.0: " + isExist);


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

/*
//        planets.descendingKeySet();
//        planets.descendingMap();


// получение True если ключ есть в отображении, иначе False
        boolean isExist = planets.containsKey("Earth");

// получение True если значение есть в отображении, иначе False
        isExist = planets.containsValue("Earth");

// пустое отображение?
        boolean isEmpty = planets.isEmpty();

// удаление элемента по ключу
        planets.remove("Saturn");

// список ключей
        Set keys = planets.keySet();

// список значений
        Collection<Double> values = planets.values();
        ArrayList<Double> arr = new ArrayList<>(planets.values());

// множество элементов ввиде объектов интерфейса Map.Entry
        Set entries = planets.entrySet();

// перебор элементов отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

// перебор элементов отображения с помощью while
        Set entries = planets.entrySet();
        Iterator i = entries.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

// размер отображения
        int amount = planets.size();

// удалить все элементы
        planets.clear();

// сортировка элементов по значению
// компаратор
        public static <K, V extends Comparable<V>> Map<K, V>  sortByValues(final Map<K, V> map) {
            Comparator<K> valueComparator = new Comparator<K>() {
                public int compare(K k1, K k2) {
                    int compare =  map.get(k1).compareTo(map.get(k2));
                    if (compare == 0)
                        return 1;
                    else
                        return compare;
                }
            };

            Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
            sortedByValues.putAll(map);
            return sortedByValues;
        }

        Map sortedMap = sortByValues(planets);
        for (Map.Entry me : sortedMap.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
*/


    }
}
