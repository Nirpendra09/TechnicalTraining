package DSA.Stacks;

public class StackImplementation {
    int[] arr;
    int capacity;
    int top;

    public StackImplementation(int capacity) {
        top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    int getSize() {
        return top + 1;
    }

    public void push(int element) {
        if (getSize() == capacity - 1) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = element;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty...");
        }
        int element = arr[top];
        arr[top] = 0;
        top--;
        return element;
    }

    void print() {
        for (int e : arr) {
            System.out.print(e + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.print();
        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);
    }
}
