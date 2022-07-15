package DSA.Queues;

public class CircularQueue {
    // Circular Array Queue
    int[] arr;
    int front;
    int rear;
    final int DEFAULT_CAPACITY = 10;

    public CircularQueue() {
        arr = new int[DEFAULT_CAPACITY];
        rear = front = 0;
    }

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        rear = front = 0;
    }

    int getSize() {
        return rear;
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int data) {
        if (rear == arr.length) {
            throw new RuntimeException("Queue is Full...");
        }
        int availableIndex = (front + rear) % arr.length;
        arr[availableIndex] = data;
        rear++;
    }

    void print() {
        for (int i = 0; i < rear; i++) {
            int availableIndex = (front + i) % arr.length;
            System.out.print(arr[availableIndex] + " ");
        }
        System.out.println();
    }

    int dequeue() {
        if (rear == 0) {
            throw new RuntimeException("Queue is Empty..");
        }
        int value = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        rear--;
        return value;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.print();

        cq.dequeue();
        cq.print();

        cq.enqueue(50);
    }
}
