package collections.queue.deque;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> planets = new LinkedList<>();

        System.out.println("// Додавання елементів //////////////////////////////////////////////////////////////////");
        // Додавання елементів до "planets" (кожен наступний елемент додається в кінець)
        planets.add("Earth");
        planets.addLast("Mercury");
        planets.offer("Mars");
        planets.offerLast("Venus");
        System.out.println("\"planets\" після додавання елементів:           " + planets);

        // Додавання елементів до "planets" (кожен наступний елемент додається на початок)
        planets.addFirst("Saturn");
        planets.offerFirst("Jupiter");
        planets.push("Neptune");
        System.out.println("\n\"planets\" після додавання елементів:           " + planets);

        // Додавання декількох елементів (кожен наступний елемент додається в кінець)
        planets.addAll(Arrays.asList("Venus", "Planet_A", "Planet_B", "Venus", "Planet_C", "Planet_MY", "Saturn"));
        System.out.println("\n\"planets\" після додавання декількох елементів: " + planets);


        System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        System.out.println("\"planets\":                  " + planets);
        String planet;

        // Повернути перший елемент
        planet = planets.element();
        System.out.println("\"planets\" перший елемент:   " + planet);

        // Повернути перший елемент
        planet = planets.peek();
        System.out.println("\"planets\" перший елемент:   " + planet);

        // Повернути перший елемент
        planet = planets.getFirst();
        System.out.println("\"planets\" перший елемент:   " + planet);

        // Повернути останній елемент
        planet = planets.getLast();
        System.out.println("\"planets\" останній елемент: " + planet);


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
        System.out.println("\"planets\":                       " + planets);

        // Повернення та видалення першого елемента
        planet = planets.remove();
        System.out.println("\n\"planets\" перший елемент:        " + planet);
        System.out.println("\"planets\" після .remove():       " + planets);

        // Повернення та видалення першого елемента
        planet = planets.removeFirst();
        System.out.println("\n\"planets\" перший елемент:        " + planet);
        System.out.println("\"planets\" після .removeFirst():  " + planets);

        // Повернення та видалення першого елемента
        planet = planets.removeLast();
        System.out.println("\n\"planets\" останній елемент:      " + planet);
        System.out.println("\"planets\" після .removeLast():   " + planets);

        // Повернення та видалення першого елемента
        planet = planets.pop();
        System.out.println("\n\"planets\" перший елемент:        " + planet);
        System.out.println("\"planets\" після .pop():          " + planets);

        // Повернення та видалення першого елемента
        planet = planets.poll();
        System.out.println("\n\"planets\" перший елемент:        " + planet);
        System.out.println("\"planets\" після .poll():         " + planets);

        // Повернення та видалення першого елемента
        planet = planets.pollFirst();
        System.out.println("\n\"planets\" перший елемент:        " + planet);
        System.out.println("\"planets\" після .pollFirst():    " + planets);

        // Повернення та видалення першого елемента
        planet = planets.pollLast();
        System.out.println("\n\"planets\" останній елемент:      " + planet);
        System.out.println("\"planets\" після .pollLast():     " + planets);


        System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        System.out.println("\"planets\":                                               " + planets);
        boolean isRemoved;

        // Видалення першого елемента зі вказаним значенням
        isRemoved = planets.remove("Venus");
        System.out.println("\nелемент зі значенням Venus видалений з \"planets\":        " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням Venus:   " + planets);

        // TODO: planets.removeIf();

        isRemoved = planets.removeFirstOccurrence("Venus");
        System.out.println("\nелемент зі значенням Venus видалений з \"planets\":        " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням Venus:   " + planets);

        isRemoved = planets.removeLastOccurrence("Venus");
        System.out.println("\nелемент зі значенням Venus видалений з \"planets\":        " + isRemoved);
        System.out.println("\"planets\" після видалення елемента зі значенням Venus:   " + planets);

        // Залишити в списку тільки ті елементи, які є в іншому списку
        Deque<String> favorite2 = new LinkedList<>();
        favorite2.add("Planet_A");
        favorite2.add("Planet_MY");
        favorite2.add("Saturn");
        favorite2.add("Mars");
        planets.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                             " + favorite2);
        System.out.println("\"planets\" після залишення елементів які є в \"favorite2\": " + planets);

        // Видалити всі елементи списка, які є в іншому списку
        Deque<String> favorite3 = new LinkedList<>();
        favorite3.add("Planet_A");
        favorite3.add("Saturn");
        planets.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                             " + favorite3);
        System.out.println("\"planets\" після видалення елементів які є в \"favorite3\": " + planets);

        // Видалити всі елементи списка
        planets.clear();
        System.out.println("\n\"planets\" після видалення всіх елементів:                " + planets);


        System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        Deque<String> forAdd = new LinkedList<>();
        forAdd.add("Earth");
        forAdd.add("PlanetP");
        forAdd.add("PlanetZ");
        forAdd.add("Mars");
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