package loops;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // оголошення масиву
        String[] arrayStr = {"aaa", "bbb", "ccc", "www"};

        // 1-й блок "String value" вказується змінна або об'єкт
        // 2-й блок "arrayStr" вказується масив обо оклекція звідки береться "value",
        // 3-й блок (весь код що знаходиться між {}) виконується доки є елементи масиву
        for (String value : arrayStr) {
            System.out.println(value);
        }

        // оголошення колекції
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(3);

        for (Integer integerValue : list) {
            System.out.println(integerValue);
        }
    }
}