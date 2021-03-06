package DSA.Stacks;

public class KStack {
    int arr[];
    int top[];
    int next[];
    int capacity;
    int n;
    int free;

    KStack(int capacity, int n) {
        this.capacity = capacity;
        this.n = n;
        arr = new int[capacity];
        next = new int[capacity];
        top = new int[n];

        for (int i = 0; i < capacity - 1; i++) {
            next[i] = i + 1;
        }
        next[capacity - 1] = -1;

        for (int i = 0; i < n; i++) {
            top[i] = -1;
        }
    }

    void push(int stackNumber, int element) {
        if (free == -1) {
            System.out.println("Stack is full...");
            return;
        }
        int index = free;
        free = next[index];
        next[index] = top[stackNumber];
        top[stackNumber] = index;
        arr[index] = element;
    }

    void pop(int stackNumber) {
        if(top[stackNumber] == -1) {
            System.out.println("Stack is Empty...");
            return;
        }

        int index = top[stackNumber];
        int element = arr[index];
        System.out.println("Pop: " + element);
        top[stackNumber] = next[index];
        next[index] = free;
        free = index;
    }

    public static void main(String[] args) {
        KStack kstack = new KStack(10, 3);
        kstack.push(0, 20);
        kstack.push(0, 30);
        kstack.push(1, 11);
        kstack.push(1, 22);
        kstack.push(1, 33);
        kstack.push(2, 40);
        kstack.push(2, 50);

    }
}
