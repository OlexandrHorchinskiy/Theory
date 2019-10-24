package collections.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedListMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> planets = new LinkedHashMap<>();

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

// перебор элементов отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

// еще один вариант перебора элементов отображения с помощью for
        for (Map.Entry me : planets.entrySet()) {
            String key = (String) me.getKey();
            Double value = (Double) me.getValue();
            System.out.println("Key: " + key + " & Value: " + value);
        }
    }
}
