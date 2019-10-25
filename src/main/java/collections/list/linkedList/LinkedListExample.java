package collections.list.linkedList;
/*
LinkedList зберігає дані в вигляді двунаправленого списка.
LinkedList — это связанный список ссылок на элементы. Таким образом, для доступа к элементу в центре,
приходится производить поиск с самого начала и до конца листа.

Плюси LinkedList:
1. швидке додавання елементів.
2. швидке видалення елементів.

Мінуси LinkedList:
1. повільний пошук/отримання елементів.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();

        System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до "myLinkedList" (кожен наступний елемент додається в кінець)
        myLinkedList.add("Mercury");
        System.out.println("\"myLinkedList\" після додавання елемента через .add:              " + myLinkedList);

        // Додавання елемента на початок списку
        myLinkedList.addFirst("Neptune");
        System.out.println("\"myLinkedList\" після додавання елемента через .addFirst):        " + myLinkedList);

        // Додавання елемента в кінець списку
        myLinkedList.addLast("Saturn");
        System.out.println("\"myLinkedList\" після додавання елемента через .addLast:          " + myLinkedList);

        myLinkedList.offer("Earth");
        System.out.println("\"myLinkedList\" після додавання елемента через .offer:            " + myLinkedList);

        myLinkedList.offerFirst("Mars");
        System.out.println("\"myLinkedList\" після додавання елемента через .offerFirst:       " + myLinkedList);

        myLinkedList.offerLast("Planet_3");
        System.out.println("\"myLinkedList\" після додавання елемента через .offerLast:        " + myLinkedList);

        // Додавання елемента на початок списку
        myLinkedList.push("Jupiter");
        System.out.println("\"myLinkedList\" після додавання елемента через .push:             " + myLinkedList);

        // Додавання елемента на визначений індекс, всі елементи починаючи з цього індекса зміщуються на +1 індекс
        myLinkedList.add(1, "Venus");
        System.out.println("\"myLinkedList\" після додавання елемента по індексу 1:            " + myLinkedList);

        // Додавання декількох елементів (кожен наступний елемент додається в кінець)
        myLinkedList.addAll(Arrays.asList("PlanetX", "PlanetY", "PlanetZ"));
        System.out.println("\"myLinkedList\" після додавання декількох елементів:              " + myLinkedList);

        // Додавання декількох елементів починаючи з визначеного індекса, всі елементи починаючи з цього індекса зміщуються на n+1 індекс
        myLinkedList.addAll(2, Arrays.asList("PlanetA", "PlanetB"));
        System.out.println("\"myLinkedList\" після додавання декількох елементів по індексу 2: " + myLinkedList);


        System.out.println("\n// Повернення елементів ///////////////////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\": " + myLinkedList);
        String planet;

        // Повернути елемент по індексу
        planet = myLinkedList.get(3);
        System.out.println("\"myLinkedList\" елемент з індексом 3:      " + planet);

        // Повернути перший елемент
        planet = myLinkedList.getFirst();
        System.out.println("\"myLinkedList\" перший елемент:            " + planet);

        // Повернути останній елемент
        planet = myLinkedList.getLast();
        System.out.println("\"myLinkedList\" останній елемент:          " + planet);

        // Повернути перший елемент
        planet = myLinkedList.peek();
        System.out.println("\"myLinkedList\" перший елемент:            " + planet);

        // Повернути перший елемент
        planet = myLinkedList.peekFirst();
        System.out.println("\"myLinkedList\" перший елемент:            " + planet);

        // Повернути останній елемент
        planet = myLinkedList.peekLast();
        System.out.println("\"myLinkedList\" останній елемент:          " + planet);

        // Повернути перший елемент
        planet = myLinkedList.element();
        System.out.println("\"myLinkedList\" перший елемент:            " + planet);


        // Повернути частину елементів списка
        LinkedList<String> myLinkedListPart = new LinkedList<>(myLinkedList.subList(2, 5));
        System.out.println("\"myLinkedList\" елементи з індекса 2 по 4: " + myLinkedListPart);


        System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\" до оновлення:                                   " + myLinkedList);
        // Оновлення значення елемента з індексом 3
        myLinkedList.set(3, "Planet_MY");
        System.out.println("\"myLinkedList\" після оновлення значення елемента з індексом 3: " + myLinkedList);


        System.out.println("\n// Сортування елементів ///////////////////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\" до сортування:                            " + myLinkedList);
        // Сортування елементів від меншого до більшого
        Collections.sort(myLinkedList);
        System.out.println("\"myLinkedList\" після сортування від меншого до більшого: " + myLinkedList);

        // Сортування елементів від більшого до меншого
        Collections.reverse(myLinkedList);
        System.out.println("\"myLinkedList\" після сортування від більшого до меншого: " + myLinkedList);

        // Перемішування елементів
        Collections.shuffle(myLinkedList);
        System.out.println("\"myLinkedList\" після перемішування:                      " + myLinkedList);


        System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\": " + myLinkedList);
        // Перевірка чи пустий список
        boolean isEmpty = myLinkedList.isEmpty();
        System.out.println("чи \"myLinkedList\" пустий:                                " + isEmpty);

        // Перевірка наявності значення в списку
        boolean isExist = myLinkedList.contains("Neptune");
        System.out.println("в \"myLinkedList\" наявний елемент зі значенням Neptune:   " + isExist);
        isExist = myLinkedList.contains("PlanetZoo");
        System.out.println("в \"myLinkedList\" наявний елемент зі значенням PlanetZoo: " + isExist);

        // Перевірка наявності в списку всіх значеннь з іншого списка
        LinkedList<String> favorite1 = new LinkedList<>();
        favorite1.add("Neptune");
        favorite1.add("Saturn");
        boolean isContains = myLinkedList.containsAll(favorite1);
        System.out.println("\"favorite1\":                                             " + favorite1);
        System.out.println("в \"myLinkedList\" наявні всі елементи з \"favorite1\":      " + isContains);


        System.out.println("\n// Повернення та видалення елементів //////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\" до видалення елементів:                        " + myLinkedList);
        String removedPlanet;

        // Повернення та видалення першого елемента
        removedPlanet = myLinkedList.remove();
        System.out.println("значення видаленого першого елемента:                         " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення елемента:                      " + myLinkedList);

        // Повернення та видалення елемента по індексу
        removedPlanet = myLinkedList.remove(1);
        System.out.println("\nзначення видаленого елемента по індексу 1:                    " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення елемента:                      " + myLinkedList);

        // Повернення та видалення першого елемента
        removedPlanet = myLinkedList.removeFirst();
        System.out.println("\nзначення видаленого першого елемента:                         " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення першого елемента:              " + myLinkedList);

        // Повернення та видалення останнього елемента
        removedPlanet = myLinkedList.removeLast();
        System.out.println("\nзначення видаленого останнього елемента:                      " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення останнього елемента:           " + myLinkedList);

        // Повернення та видалення першого елемента
        removedPlanet = myLinkedList.pop();
        System.out.println("\nзначення видаленого першого елемента:                         " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення першого елемента:              " + myLinkedList);

        // Повернення та видалення першого елемента
        removedPlanet = myLinkedList.poll();
        System.out.println("\nзначення видаленого першого елемента:                         " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення першого елемента:              " + myLinkedList);

        // Повернення та видалення першого елемента
        removedPlanet = myLinkedList.pollFirst();
        System.out.println("\nзначення видаленого першого елемента:                         " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення першого елемента:              " + myLinkedList);

        // Повернення та видалення останнього елемента
        removedPlanet = myLinkedList.pollLast();
        System.out.println("\nзначення видаленого останнього елемента:                      " + removedPlanet);
        System.out.println("\"myLinkedList\" після видалення останнього елемента:           " + myLinkedList);

        System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        System.out.println("\"myLinkedList\" до видалення елементів:                        " + myLinkedList);
        boolean isRemoved;

        // Видалення першого елемента зі вказаним значенням
        isRemoved = myLinkedList.remove("Mercury");
        System.out.println("елемент зі значенням Mercury видалений з \"planets\":           " + isRemoved);
        System.out.println("\"myLinkedList\" після видалення елемента зі значенням Mercury: " + myLinkedList);

// TODO: myLinkedList.removeFirstOccurrence(); // Видаляє перше виникнення зазначеного елемента в цьому списку (при переході списку від голови до хвоста). Якщо список не містить елемента, він не змінюється.
// TODO: myLinkedList.removeLastOccurrence(); // Видаляє останнє виникнення зазначеного елемента в цьому списку (при переході списку від голови до хвоста). Якщо список не містить елемента, він не змінюється.
// TODO: myLinkedList.removeIf();

        // Залишити в списку тільки ті елементи, які є в іншому списку
        LinkedList<String> favorite2 = new LinkedList<>();
        favorite2.add("Jupiter");
        favorite2.add("Planet_MY");
        favorite2.add("Neptune");
        favorite2.add("PlanetY");
        myLinkedList.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                                  " + favorite2);
        System.out.println("\"myLinkedList\" після залишення елементів які є в \"favorite2\": " + myLinkedList);

        // Видалити всі елементи списка, які є в іншому списку
        LinkedList<String> favorite3 = new LinkedList<>();
        favorite3.add("PlanetA");
        favorite3.add("Neptune");
        myLinkedList.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                                  " + favorite3);
        System.out.println("\"myLinkedList\" після видалення елементів які є в \"favorite3\": " + myLinkedList);

        // Видалити всі елементи списка
        myLinkedList.clear();
        System.out.println("\n\"myLinkedList\" після видалення всіх елементів:                " + myLinkedList);


        System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        LinkedList<String> forAdd = new LinkedList<>();
        forAdd.add("PlanetP");
        forAdd.add("Saturn");
        System.out.println("\"forAdd\":                                            " + forAdd);
        myLinkedList.addAll(forAdd);
        System.out.println("\"myLinkedList\" після об'єднання зі списком \"forAdd\": " + myLinkedList);


        System.out.println("\n// Інше ///////////////////////////////////////////////////////////////////////////////");
        // Повернути розмір списка
        System.out.println("\"myLinkedList\" має розмір:                                           " + myLinkedList.size());

        // Повернути елемент з найменшим значенням
        String min = Collections.min(myLinkedList);
        System.out.println("\"myLinkedList\" елемент з найменшим значенням:                        " + min);

        // Повернути елемент з найбільшим значенням
        String max = Collections.max(myLinkedList);
        System.out.println("\"myLinkedList\" елемент з найбільшим значенням:                       " + max);

        // Повернути індекс елемента по значенню (пошук з початку списка), якщо не знайдено то -1
        int elementIndexFirst = myLinkedList.indexOf("Saturn");
        System.out.println("в \"myLinkedList\" елемент зі значенням Saturn знаходиться по індексу: " + elementIndexFirst + " *пошук першого елемента з початку списка");

        // Повернути індекс елемента по значенню (пошук з кінця списка), якщо не знайдено то -1
        int elementIndexLast = myLinkedList.lastIndexOf("Saturn");
        System.out.println("в \"myLinkedList\" елемент зі значенням Saturn знаходиться по індексу: " + elementIndexLast + " *пошук першого елемента з кінця списка");

        // Перебір елементів списку
        System.out.println("в \"myLinkedList\" наявні наступні елементи: ");
        for (String elementOfList : myLinkedList) {
            System.out.println("\t" + elementOfList);
        }

        // Конвертація LinkedList в ArrayList
        ArrayList<String> myArrayList = new ArrayList<>(myLinkedList);
        System.out.println("елементи \"myArrayList\" конвертованого з \"myLinkedList\": " + myArrayList);
    }
}