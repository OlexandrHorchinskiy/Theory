package collections.map.treeMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
//        TreeMap<String, Double> planets = new TreeMap<>();

/*
// добавление элементов
        planets.put("Mercury", new Double(2439.7));
        planets.put("Earth", new Double(6371));
        planets.put("Saturn", new Double(58232));
        planets.put("Neptune", new Double(24622));
        planets.put("Venus", new Double(6051.8));

// отображение множества, обратите внимание на порядок вывода
        System.out.println(planets);

// получить значение по ключу
        Double radius = planets.get("Earth");

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
