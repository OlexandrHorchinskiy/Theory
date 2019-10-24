package collections.queue.queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> planets = new LinkedList<>();

System.out.println("// Додавання елементів //////////////////////////////////////////////////////////////////");
        // Додавання елементів до "planets" (кожен наступний елемент додається в кінець)
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Saturn");
        System.out.println("\"planets\" після додавання елементів:                " + planets);

        // Додавання елементів до "planets" (кожен наступний елемент додається в кінець), (в випадку проблеми - повернути false)
        planets.offer("Venus");
        planets.offer("Mars");
        planets.offer("Planet_MY");
        System.out.println("\"planets\" після додавання елементів:                " + planets);

        // Додавання декількох елементів (кожен наступний елемент додається в кінець)
        planets.addAll(Arrays.asList("PlanetA", "PlanetB", "PlanetC"));
        System.out.println("\"myLinkedList\" після додавання декількох елементів: " + planets);


System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        String planet;

        // Повернути перший елемент
        planet = planets.element();
        System.out.println("\"planets\" елемент:          " + planet);
        System.out.println("\"planets\" після .element(): " + planets);

        // Повернути перший елемент
        planet = planets.peek();
        System.out.println("\n\"planets\" елемент:          " + planet);
        System.out.println("\"planets\" після .peek():    " + planets);


System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        boolean isEmpty;
        boolean isExist;

        // Перевірка чи пустий список
        isEmpty = planets.isEmpty();
        System.out.println("чи \"planets\" пустий:                                " + isEmpty);

        // Перевірка наявності значення в списку
        isExist = planets.contains("Neptune");
        System.out.println("в \"planets\" наявний елемент зі значенням Neptune:   " + isExist);

        // Перевірка наявності в списку всіх значеннь з іншого списка
        LinkedList<String> favorite1 = new LinkedList<>();
        favorite1.add("Neptune");
        favorite1.add("Saturn");
        boolean isContains = planets.containsAll(favorite1);
        System.out.println("\"favorite1\":                                        " + favorite1);
        System.out.println("в \"planets\" наявні всі елементи з \"favorite1\":      " + isContains);


System.out.println("\n// Повернення та видалення елементів //////////////////////////////////////////////////");
        // Повернення та видалення першого елемента
        planet = planets.poll();
        System.out.println("\"planets\" елемент:          " + planet);
        System.out.println("\"planets\" після .poll():    " + planets);

        // Повернення та видалення першого елемента
        planet = planets.remove();
        System.out.println("\n\"planets\" елемент:          " + planet);
        System.out.println("\"planets\" після .remove():  " + planets);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        boolean isRemoved;

        // Видалення першого елемента зі вказаним значенням
        isRemoved = planets.remove("Venus");
        System.out.println("елемент зі значенням Venus видалений з \"planets\":        " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням Venus:   " + planets);

        // TODO: myLinkedList.removeIf();

        // Залишити в списку тільки ті елементи, які є в іншому списку
        Queue<String> favorite2 = new LinkedList<>();
        favorite2.add("Saturn");
        favorite2.add("Planet_MY");
        favorite2.add("PlanetA");
        favorite2.add("Mars");
        planets.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                             " + favorite2);
        System.out.println("\"planets\" після залишення елементів які є в \"favorite2\": " + planets);

        // Видалити всі елементи списка, які є в іншому списку
        Queue<String> favorite3 = new LinkedList<>();
        favorite3.add("PlanetA");
        favorite3.add("Saturn");
        planets.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                             " + favorite3);
        System.out.println("\"planets\" після видалення елементів які є в \"favorite3\": " + planets);

        // Видалити всі елементи списка
        planets.clear();
        System.out.println("\n\"planets\" після видалення всіх елементів:                " + planets);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        Queue<String> forAdd = new LinkedList<>();
        forAdd.add("PlanetP");
        forAdd.add("Mars");
        forAdd.add("PlanetE");
        forAdd.add("PlanetZ");
        forAdd.add("Saturn");
        System.out.println("\"forAdd\":                                       " + forAdd);
        planets.addAll(forAdd);
        System.out.println("\"planets\" після об'єднання зі списком \"forAdd\": " + planets);


System.out.println("\n// Інше ///////////////////////////////////////////////////////////////////////////////");
        // Повернути розмір списка
        System.out.println("\"planets\" має розмір:                     " + planets.size());

        // Повернути елемент з найменшим значенням
        String min = Collections.min(planets);
        System.out.println("\"planets\" елемент з найменшим значенням:  " + min);

        // Повернути елемент з найбільшим значенням
        String max = Collections.max(planets);
        System.out.println("\"planets\" елемент з найбільшим значенням: " + max);

        // Перебір елементів списку
        System.out.println("в \"planets\" наявні наступні елементи: ");
        for (String elementOfList : planets) {
            System.out.println("\t" + elementOfList);
        }

        // Конвертація Queue в ArrayList
        ArrayList<String> planetsArrayList = new ArrayList<>(planets);
        System.out.println("елементи \"planetsArrayList\" конвертованого з \"planets\": " + planetsArrayList);
    }
}