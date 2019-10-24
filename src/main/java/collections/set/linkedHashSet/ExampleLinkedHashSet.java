package collections.set.linkedHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> planets = new LinkedHashSet<>();

        System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до списку
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        planets.add("Venus");
        System.out.println("\"planets\" після додавання елементів:                  " + planets + " * при LinkedHashSet зберігається порядок в якому елементи були долдані.");

        // Додавання декількох елементів
        planets.addAll(Arrays.asList("Jupiter", "Mars", "Neptune", "PlanetA", "Planet_MY"));
        System.out.println("\"planets\" після додавання декількох елементів:        " + planets);

        // Додавання дублюючого елементу
        planets.add("Jupiter"); // якщо спробувати додати елемент, значення якого вже є в колекції, то така дія ігнорується.
        System.out.println("\"planets\" після спроби додавання дублюючого елементу: " + planets.toString());


        System.out.println("\n// Отримання елементів ////////////////////////////////////////////////////////////////");
        System.out.println("Відсутнє!");


        System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        System.out.println("Відсутнє!");


        System.out.println("\n// Сортування елементів ///////////////////////////////////////////////////////////////");
        System.out.println("Відсутнє!");


        System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        // Перевірка чи пустий список
        boolean isEmpty = planets.isEmpty();
        System.out.println("чи \"planets\" пустий:                              " + isEmpty);

        // Перевірка наявності значення в списку
        boolean isExist = planets.contains("Neptune");
        System.out.println("в \"planets\" наявний елемент зі значенням Neptune: " + isExist);

        // Перевірка наявності в списку всіх значеннь з іншого списка
        LinkedHashSet<String> favorite1 = new LinkedHashSet<>();
        favorite1.add("Neptune");
        favorite1.add("Saturn");
        boolean isContains = planets.containsAll(favorite1);
        System.out.println("\"favorite1\":                                      " + favorite1);
        System.out.println("в \"planets\" наявні всі елементи з \"favorite1\":    " + isContains);


        System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        boolean isRemoved;
        // Видалення елемента зі вказаним значенням
        isRemoved = planets.remove("PlanetX");
        System.out.println("елемент зі значенням PlanetX видалений з \"planets\":      " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням PlanetX: " + planets);

        // Залишити в списку тільки ті елементи, які є в іншому списку
        LinkedHashSet<String> favorite2 = new LinkedHashSet<>();
        favorite2.add("Jupiter");
        favorite2.add("Planet_MY");
        favorite2.add("Neptune");
        favorite2.add("PlanetY");
        planets.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                             " + favorite2);
        System.out.println("\"planets\" після залишення елементів які є в \"favorite2\": " + planets);

        // Видалити всі елементи списка, які є в іншому списку
        LinkedHashSet<String> favorite3 = new LinkedHashSet<>();
        favorite3.add("PlanetA");
        favorite3.add("Neptune");
        planets.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                             " + favorite3);
        System.out.println("\"planets\" після видалення елементів які є в \"favorite3\": " + planets);

// TODO
//        planets.removeIf();

        // Видалити всі елементи списка
        planets.clear();
        System.out.println("\"planets\" після видалення всіх елементів:                " + planets);


        System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        LinkedHashSet<String> forAdd = new LinkedHashSet<>();
        forAdd.add("Jupiter");
        forAdd.add("PlanetP");
        forAdd.add("Saturn");
        forAdd.add("PlanetA");
        System.out.println("\"forAdd\":                                       " + forAdd);
        planets.addAll(forAdd);
        System.out.println("\"planets\" після об'єднання зі списком \"forAdd\": " + planets);


        System.out.println("\n// Інше ///////////////////////////////////////////////////////////////////////////////");
        // Отримання розміра списка
        System.out.println("\"planets\" має розмір:                     " + planets.size());

        // Повертає елемент з найменшим значенням
        String min = Collections.min(planets);
        System.out.println("\"planets\" елемент з найменшим значенням:  " + min);

        // Повертає елемент з найбільшим значенням
        String max = Collections.max(planets);
        System.out.println("\"planets\" елемент з найбільшим значенням: " + max);

        // Перебір елементів списку
        System.out.println("в \"planets\" наявні наступні елементи: ");
        for (String elementOfList : planets) {
            System.out.println("\t" + elementOfList);
        }

        // Конвертація LinkedHashSet в ArrayList
        ArrayList<String> planetsArrayList = new ArrayList<>(planets);
        System.out.println("елементи \"planetsArrayList\" конвертованого з \"planets\": " + planetsArrayList);
    }
}