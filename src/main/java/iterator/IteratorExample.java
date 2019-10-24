package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(15);
        listInt.add(5);
        listInt.add(-46);

        Iterator<Integer> iteratorInt = listInt.iterator();

        while (iteratorInt.hasNext()) {
            System.out.println(iteratorInt.next());
        }
    }
}
