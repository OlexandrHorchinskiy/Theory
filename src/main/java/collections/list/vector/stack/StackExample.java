package collections.list.vector.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // .push(X) - додає елемент X на початок списку
        stack.push(2); // .push(X) - додає елемент X на початок списку
        stack.push(3); // .push(X) - додає елемент X на початок списку

        System.out.println(stack.peek());   // .peek() - зчитує останній доданий елемент в списку

        System.out.println();

        stack.remove(0);

        System.out.println(stack.pop());    // .pop() - зчитує та видаляє останній доданий елемент в списку
        System.out.println(stack.pop());    // .pop() - зчитує та видаляє останній доданий елемент в списку
//        System.out.println(stack.pop());    // .pop() - зчитує та видаляє останній доданий елемент в списку
    }
}