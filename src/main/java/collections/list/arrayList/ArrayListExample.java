package collections.list.arrayList;
/*
ArrayList зберігає дані в вигляді масива.
ArrayList - масив зі змінною кількістю елементів.
Елементи ArrayList доступні по індексу.

Плюси ArrayList:
1. швидкий пошук/отримання елементів.
2. швидке сортування (дані списка копіюються в масив (а копіювати з масива ArrayList в масив швидше).

Мінуси ArrayList:
1. затратний при зміні розміру масива (елементи переписується в новий масив з більшим розміром);
2. повільний для додавання елемента в середину масива (елементи переписується в новий масив з більшим розміром);
3. повільний для видалення елемента з середини масива (елементи переписується в новий масив з меншим розміром).

Если при добавлении в ArrayList превышается его объем, размер массива увеличивается,
новая емкость рассчитывается по формуле oldCapacity * 3 / 2 + 1, поэтому лучше указывать размер при создании или,
если он не известен, использовать LinkedList (но это может быть существенно при слишком уж больших объемах данных).
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

System.out.println("// Додавання елементів ////////////////////////////////////////////////////////////////");
        // Додавання елементів до списку (кожен наступний елемент додається в кінець)
        myArrayList.add(9);
        myArrayList.add(2);
        System.out.println("\"myArrayList\" після додавання 2-х елементів:                 " + myArrayList);
        // Додавання елемента на індекс 1 (існуючі елементи, починаючи з індекса 1, зміщуються на +один індекс)
        myArrayList.add(1, -5);
        System.out.println("\"myArrayList\" після додавання елемента по індексу 1:         " + myArrayList);

        // Додавання декількох елементів до (кожен наступний елемент додається в кінець)
        myArrayList.addAll(Arrays.asList(1, 4, 0));
        System.out.println("\"myArrayList\" після додавання 3-х елементів:                 " + myArrayList);

        // Додавання декількох елементів починаючи з визначеного індекса, всі елементи починаючи з цього індекса зміщуються на n+1 індекс
        myArrayList.addAll(2, Arrays.asList(2, 6));
        System.out.println("\"myArrayList\" після додавання 2-х по елементів по індексу 2: " + myArrayList);


System.out.println("\n// Повернення елементів ////////////////////////////////////////////////////////////////");
        // Повернення елемента по індексу
        Integer elementByIndex = myArrayList.get(3);
        System.out.println("\"myArrayList\" елемент з індексом 3:                          " + elementByIndex);

        // Повернення частини елементів
        ArrayList<Integer> myArrayListPart = new ArrayList<>(myArrayList.subList(1, 4));
        System.out.println("\"myArrayList\" елементи з індексу 1 по 3:                     " + myArrayListPart);


System.out.println("\n// Оновлення значення елемента ////////////////////////////////////////////////////////");
        // Оновлення значення елемента з індексом 3
        myArrayList.set(3, 8);
        System.out.println("\"myArrayList\" після оновлення значення елемента з індексом 3: " + myArrayList);


System.out.println("\n// Сортування елементів ///////////////////////////////////////////////////////////////");
        // Сортування елементів від меншого до більшого
        Collections.sort(myArrayList);
        System.out.println("\"myArrayList\" після сортування від меншого до більшого:      " + myArrayList);

        // Сортування елементів від більшого до меншого
        Collections.reverse(myArrayList);
        System.out.println("\"myArrayList\" після сортування від більшого до меншого:      " + myArrayList);

        // Перемішування елементів
        Collections.shuffle(myArrayList);
        System.out.println("\"myArrayList\" після перемішування:                           " + myArrayList);


System.out.println("\n// Перевірка наявності ////////////////////////////////////////////////////////////////");
        // Перевірка чи пустий список
        boolean isEmpty = myArrayList.isEmpty();
        System.out.println("чи \"myArrayList\" пустий:                           " + isEmpty);

        // Перевірка наявності значення в списку
        boolean isExist = myArrayList.contains(9);
        System.out.println("в \"myArrayList\" наявний елемент зі значенням 9:    " + isExist);
        isExist = myArrayList.contains(5);
        System.out.println("в \"myArrayList\" наявний елемент зі значенням 5:    " + isExist);

        // Перевірка наявності в списку всіх значеннь з іншого списка
        ArrayList<Integer> favorite1 = new ArrayList<>();
        favorite1.add(6);
        favorite1.add(7);
        boolean isContains = myArrayList.containsAll(favorite1);
        System.out.println("\"favorite1\":                                       " + favorite1);
        System.out.println("в \"myArrayList\" наявні всі елементи з \"favorite1\": " + isContains);


System.out.println("\n// Видалення елементів ////////////////////////////////////////////////////////////////");
        // Видалення елемента по індексу 3
        Integer removedElement;
        removedElement = myArrayList.remove(3);
        System.out.println("значення видаленого елемента по індексу 3:                   " + removedElement);
        System.out.println("\"myArrayList\" після видалення елемента з індексом 3:         " + myArrayList);

        // Видалення елемента по значенню (об'єкту). Видаляється тільки перший співпавший елемент.
        Integer objectToRemove = 2;
        boolean isRemoved;
        isRemoved = myArrayList.remove(objectToRemove);
        System.out.println("\nелемент зі значенням 2 видалений з \"myArrayList\"             " + isRemoved + " *Видаляється тільки перший співпавший елемент!");
        System.out.println("\"myArrayList\" після видалення елемента зі значенням 2:       " + myArrayList + " *Видаляється тільки перший співпавший елемент!");

        // Залишити в списку тільки ті елементи, які є в іншому списку
        ArrayList<Integer> favorite2 = new ArrayList<>();
        favorite2.add(1);
        favorite2.add(2);
        favorite2.add(3);
        favorite2.add(8);
        myArrayList.retainAll(favorite2);
        System.out.println("\n\"favorite2\":                                                 " + favorite2);
        System.out.println("\"myArrayList\" після залишення елементів які є в \"favorite2\": " + myArrayList);

        // Видалити всі елементи списка, які є в іншому списку
        ArrayList<Integer> favorite3 = new ArrayList<>();
        favorite3.add(1);
        favorite3.add(3);
        myArrayList.removeAll(favorite3);
        System.out.println("\n\"favorite3\":                                                 " + favorite3);
        System.out.println("\"myArrayList\" після видалення елементів які є в \"favorite3\": " + myArrayList);

        // Видалити всі елементи списка
        myArrayList.clear();
        System.out.println("\n\"myArrayList\" після видалення всіх елементів:                " + myArrayList);


System.out.println("\n// Об'єднання списків /////////////////////////////////////////////////////////////////");
        // Об'єднання списків
        ArrayList<Integer> forAdd = new ArrayList<>();
        forAdd.add(1);
        forAdd.add(6);
        forAdd.add(0);
        forAdd.add(2);
        forAdd.add(6);
        System.out.println("\"forAdd\":                                                    " + forAdd);
        myArrayList.addAll(forAdd);
        System.out.println("\"myArrayList\" після об'єднання зі списком \"forAdd\":          " + myArrayList);


System.out.println("\n// Інше ///////////////////////////////////////////////////////////////////////////////");
        // Отримання розміра списка
        System.out.println("\"myArrayList\" має розмір:                                        " + myArrayList.size());

        // Отримання елемента з найменшим значенням
        int min = Collections.min(myArrayList);
        System.out.println("\"myArrayList\" елемент з найменшим значенням:                     " + min);

        // Отримання елемента з найбільшим значенням
        int max = Collections.max(myArrayList);
        System.out.println("\"myArrayList\" елемент з найбільшим значенням:                    " + max);

        // Отримання індекса елемента по значенню (пошук з початку списка), якщо не знайдено то -1
        int elementIndexFirst = myArrayList.indexOf(6);
        System.out.println("в \"myArrayList\" елемент зі значенням 6 знаходиться по індексу: " + elementIndexFirst + " *пошук першого елемента з початку списка");

        // Отримання індекса елемента по значенню (пошук з кінця списка), якщо не знайдено то -1
        int elementIndexLast = myArrayList.lastIndexOf(6);
        System.out.println("в \"myArrayList\" елемент зі значенням 6 знаходиться по індексу: " + elementIndexLast + " *пошук першого елемента з кінця списка");

        // Перебір елементів списку
        System.out.println("в \"myArrayList\" наявні наступні елементи: ");
        for (Integer elementOfList : myArrayList) {
            System.out.println("\t" + elementOfList);
        }
    }
}

/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// удалить элементы списка, которые соответсвуют условию Predicate
class SamplePredicate<T> implements Predicate<T> {
    T varc1;
    public boolean test(T varc) {
        if(varc1.equals(varc)) {
            return true;
        }
        return false;
    }
}

SamplePredicate<String> filter = new SamplePredicate<>();
filter.varc1 = "Saturn";
planets.removeIf(filter);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// заменить значение каждого элемента списка на результат оператор
// оператор
class MyOperator<T> implements UnaryOperator<T>{
    T varc1;
    public T apply(T varc){
        return varc1;
    }
}

MyOperator<String> operator = new MyOperator<>();
operator.varc1 = "Earth";
planets.replaceAll(operator);
System.out.println(planets);
// [Earth, Earth, Earth, Earth]


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// выполнить действие над каждым элементом списка
// действие
class MyConsumer<T> implements Consumer<T>{
    public void accept(T planet){
        System.out.println("We are flying to " + planet);
    }
}

MyConsumer<String> action = new MyConsumer<>();
planets.forEach(action);
*/