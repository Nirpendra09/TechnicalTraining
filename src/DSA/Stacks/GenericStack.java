package DSA.Stacks;

import java.util.*;

class GenStack<T> {
    int capacity;
    int top;
    ArrayList<T> arr;

    GenStack(int capacity) {
        top = -1;
        this.capacity = capacity;
        arr = new ArrayList<>();
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }

    public void push(T element) {
        if (getSize() == capacity - 1) {
            throw new RuntimeException("Stack is full...");
        }
        System.out.println("Push :: " + element);
        top++;
        arr.add(top, element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        T element = arr.remove(top);
        System.out.println("Pop :: " + element);
        top--;
        return element;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int getSize() {
        return top;
    }
}

public class GenericStack {
    public static void main(String[] args) {
        GenStack<String> strStack = new GenStack<>(5);
        strStack.push("hi");
        strStack.push("hello");
        strStack.push("how");
        strStack.push("are");
        strStack.push("you?");
    }
}
