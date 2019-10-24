package collections.set.treeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {
        TreeSet<String> planets = new TreeSet<>();

System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до списку
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Saturn");
        System.out.println("\"planets\" після додавання елементів:                  " + planets);

        // Додавання декількох елементів
        planets.addAll(Arrays.asList("Jupiter", "Mars", "Neptune", "PlanetA", "Planet_MY"));
        System.out.println("\"planets\" після додавання декількох елементів:        " + planets);

        // Додавання дублюючого елементу
        planets.add("Jupiter"); // якщо спробувати додати елемент, значення якого вже є в колекції, то така дія ігнорується.
        System.out.println("\"planets\" після спроби додавання дублюючого елементу: " + planets.toString());


System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        String planet;

        // Повернення першого елемента
        planet = planets.first();
        System.out.println("\"planets\" перший елемент:                                           " + planet);

        // Повернення останнього елемента
        planet = planets.last();
        System.out.println("\"planets\" останній елемент:                                         " + planet);

        // Повернути всі елементи перед вказаним
        TreeSet<String> planetsBefore = new TreeSet<>(planets.headSet("Neptune"));
        System.out.println("\"planets\" всі елементи перед Neptune:                               " + planetsBefore);

        // Повернути всі елементи після вказаного (включно з вказаним)
        TreeSet<String> planetsAfter = new TreeSet<>(planets.tailSet("Neptune"));
        System.out.println("\"planets\" всі елементи від Neptune (включно):                     " + planetsAfter);

        // Повернути всі елементи між двума вказаними
        TreeSet<String> planetsSub = new TreeSet<>(planets.subSet("Mercury", "Venus"));
        System.out.println("\"planets\" всі елементи від Mercury (включно) до Venus (не включно): " + planetsSub);


System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        System.out.println("Відсутнє!");


System.out.println("\n// Сортування елементів ///////////////////////////////////////////////////////////////");
        System.out.println("Відсутнє!");


System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        boolean isEmpty;
        boolean isContains;

        // Перевірка чи пустий список
        isEmpty = planets.isEmpty();
        System.out.println("чи \"planets\" пустий:                              " + isEmpty);

        // Перевірка наявності значення в списку
        isContains = planets.contains("Neptune");
        System.out.println("в \"planets\" наявний елемент зі значенням Neptune: " + isContains);

        // Перевірка наявності в списку всіх значеннь з іншого списка
        TreeSet<String> favorite1 = new TreeSet<>();
        favorite1.add("Neptune");
        favorite1.add("Saturn");
        isContains = planets.containsAll(favorite1);
        System.out.println("\"favorite1\":                                      " + favorite1);
        System.out.println("в \"planets\" наявні всі елементи з \"favorite1\":    " + isContains);


System.out.println("\n// Повернення та видалення елементів //////////////////////////////////////////////////");
        String removedPlanet;

        // Повернення та видалення першого елемента
        removedPlanet = planets.pollFirst();
        System.out.println("\"planets\" перший елемент:                                    " + removedPlanet);
        System.out.println("\"planets\" після повернення та видалення першого елемента:    " + planets);

        // Повернення та видалення останнього елемента
        removedPlanet = planets.pollLast();
        System.out.println("\n\"planets\" останній елемент:                                  " + removedPlanet);
        System.out.println("\"planets\" після повернення та видалення останнього елемента: " + planets);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        boolean isRemoved;

        // Видалення елемента зі вказаним значенням
        isRemoved = planets.remove("PlanetX");
        System.out.println("елемент зі значенням PlanetX видалений з \"planets\":      " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням PlanetX: " + planets);

        // Залишити в списку тільки ті елементи, які є в іншому списку
        TreeSet<String> favorite2 = new TreeSet<>();
        favorite2.add("Jupiter");
        favorite2.add("Planet_MY");
        favorite2.add("Neptune");
        favorite2.add("PlanetY");
        planets.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                             " + favorite2);
        System.out.println("\"planets\" після залишення елементів які є в \"favorite2\": " + planets);

        // Видалити всі елементи списка, які є в іншому списку
        TreeSet<String> favorite3 = new TreeSet<>();
        favorite3.add("PlanetA");
        favorite3.add("Neptune");
        planets.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                             " + favorite3);
        System.out.println("\"planets\" після видалення елементів які є в \"favorite3\": " + planets);

// TODO: planets.removeIf();

        // Видалити всі елементи списка
        planets.clear();
        System.out.println("\n\"planets\" після видалення всіх елементів:                " + planets);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        TreeSet<String> forAdd = new TreeSet<>();
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

        // Конвертація TreeSet в ArrayList
        ArrayList<String> planetsArrayList = new ArrayList<>(planets);
        System.out.println("елементи \"planetsArrayList\" конвертованого з \"planets\": " + planetsArrayList);


System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////");
System.out.println("// Комбінації методів /////////////////////////////////////////////////////////////////");
        System.out.println("\"planets\": " + planets);

        TreeSet<String> planets2 = new TreeSet<>();
        int placeInList;
        // Повертає місце елемента в списку по його значенню (пошук з початку списка)
//       planets2.headSet("PlanetA").size();
        planets2.addAll(planets.headSet("PlanetA"));
        placeInList = planets2.size() + 1;
        System.out.println("в \"planets\" елемент зі значенням PlanetA знаходиться на місці (не індекс): " + placeInList);


//        // Повернути всі елементи перед вказаним
//        planetsBefore = new TreeSet<>(planets.headSet("Neptune"));
//        System.out.println("\"planets\" всі елементи перед Neptune:        " + planetsBefore);

    }
}

/*
// определим произволный Comparator для TreeSet
Set planets2 = new TreeSet<>(new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        // define comparing logic here
        return Integer.compare(o1.length() , o2.length());
    }
});

planets2.add("Earth");
planets2.add("Saturn");
planets2.add("Neptune");

System.out.println(planets2);
*/