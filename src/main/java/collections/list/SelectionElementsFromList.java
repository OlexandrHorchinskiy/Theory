package collections.list;
// КАК ОДНИМ ВЫЗОВОМ ИЗ LIST ПОЛУЧИТЬ LIST СО ВСЕМИ ЭЛЕМЕНТАМИ, КРОМЕ ПЕРВЫХ 3-Х И ПОСЛЕДНИХ 3-Х?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionElementsFromList {
    public static void main(String[] args) {
        List<Integer> soursList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> subList = soursList.subList(3, soursList.size() - 3); // Рішення

        for (int i = 0; i < subList.size(); i++) {
            System.out.print(subList.get(i) + ", ");
        }
    }
}