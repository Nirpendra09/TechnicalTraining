package DSA.Queues;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class QueueUsingLinkedLists {
    Node front, rear;
    int size;

    QueueUsingLinkedLists() {
        front = rear = null;
        size = 0;
    }

    void enqueue(int x) {
        Node cur = new Node(x);

        if (front == null && rear == null) {
            front = rear = cur;
            return;
        }

        rear.next = cur;
        rear = cur;

        size++;
    }

    void dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is Empty...");
        }
        Node cur = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
    }
}
