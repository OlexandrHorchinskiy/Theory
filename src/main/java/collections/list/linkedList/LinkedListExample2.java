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

import collections.list.linkedList.entity.Dog;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // Створення linkedList
        LinkedList<Dog> linkedList = new LinkedList<>();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Добавлення елемента в кінець списку
        linkedList.addLast(new Dog("Dingo", 4));
        linkedList.addLast(new Dog("Rex", 2));
        linkedList.addLast(new Dog("Bars", 1));

        // Добавлення елемента на початок списку
        linkedList.addFirst(new Dog("Sharik", 2));
        linkedList.addFirst(new Dog("Tuzik", 1));
        linkedList.addFirst(new Dog("Barbos", 1));

        // Так як в LinkedList відсутній індекс, а є node (LinkedList в класі зберігає тільки першу та останню node).
        // Ітератор - це об'єкт який зберігає вказівник на одну node.
        // У ітератора є метод .next() після виклику цього метода next node почне вказувати на наступний елемент.
        System.out.println("----- Список після додавання елементів --------------------------------------------------");
        Iterator<Dog> dogIterator = linkedList.iterator();
        while (dogIterator.hasNext()) {             // .hasNext() перевіряє чи є наступний елемент,
            Dog dog = dogIterator.next();           // якщо наступний елемент є, то розміщуємо його в dog
            System.out.println(dog.getName());      // друкуємо name
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Добавлення елемента на місце з індексом 2
        linkedList.add(2, new Dog("Alfa", 3));

        // Друк списку
        System.out.println("\n----- Список після додавання елемента на місце з індексом 2 ---------------------------");
        Iterator<Dog> dogIterator2 = linkedList.iterator();
        while (dogIterator2.hasNext()) {             // .hasNext() перевіряє чи є наступний елемент,
            Dog dog = dogIterator2.next();           // якщо наступний елемент є, то розміщуємо його в dog
            System.out.println(dog.getName());       // друкуємо name
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Видалення елемента з початку списку
        linkedList.removeFirst();

        // Видалення елемента з кінця списку
        linkedList.removeLast();

        // Друк списку
        System.out.println("\n----- Список після видалення першого та останнього елементу ---------------------------");
        Iterator<Dog> dogIterator3 = linkedList.iterator();
        while (dogIterator3.hasNext()) {             // .hasNext() перевіряє чи є наступний елемент,
            Dog dog = dogIterator3.next();           // якщо наступний елемент є, то розміщуємо його в dog
            System.out.println(dog.getName());       // друкуємо name
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Видалення елемента по індексу
        linkedList.remove(1);

        // Друк списку
        System.out.println("\n----- Список після видалення елементу по індексу 1 ------------------------------------");
        Iterator<Dog> dogIterator4 = linkedList.iterator();
        while (dogIterator4.hasNext()) {             // .hasNext() перевіряє чи є наступний елемент,
            Dog dog = dogIterator4.next();           // якщо наступний елемент є, то розміщуємо його в dog
            System.out.println(dog.getName());       // друкуємо name
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Отримання елементів зі списку
        System.out.println("\n---------------------------------------------------------------------------------------");
        Dog dog2 = linkedList.getFirst();
        System.out.println("Отримання першого елементу: \t\t" + dog2.getName());

        Dog dog3 = linkedList.get(1);
        System.out.println("Отримання елементу по індексу 1: \t" + dog3.getName());

        Dog dog4 = linkedList.getLast();
        System.out.println("Отримання останнього елементу: \t\t" + dog4.getName());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}

/*
https://metanit.com/java/tutorial/5.3.php

        // проверка на наличие элемента в списке
        if(states.contains("Germany")){
            System.out.println("List contains Germany");
        }
*/