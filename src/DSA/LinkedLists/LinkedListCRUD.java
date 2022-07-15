package DSA.LinkedLists;

class GenericNode<T> {
    T data;
    GenericNode<T> next;

    GenericNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCRUD<T> {
    private GenericNode<T> start;

    void insertAtBeg(GenericNode<T> node) {
        if (start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(GenericNode<T> node) {
        if (start == null) {
            start = node;
            return;
        }

        GenericNode<T> current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    void insertAtMid(GenericNode<T> node, int pos) {
        if (start == null) {
            start = node;
            return;
        }
        if (pos == 0) {
            node.next = start;
            start = node;
        }
        if (pos > 0) {
            int i = 1;
            GenericNode<T> temp = start;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void deleteInMid(int pos) {
        if (start == null) {
            System.out.println("List is Empty...");
            return;
        }

        GenericNode<T> temp = null;
        if (pos == 0) {
            temp = start.next;
            start = temp;
        }
        int i = 1;
        temp = start;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        GenericNode<T> fast = start;
        GenericNode<T> slow = start;
        if (start != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("mid point " + slow.data);

        }
    }

    void reverse() {
        GenericNode<T> current = start;
        GenericNode<T> previous = null;
        while (current != null) {
            GenericNode<T> nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        start = previous;
//        System.out.println("After Reversing ");
//        print();
    }

    void detectLoop() {
        GenericNode<T> slow = start;
        GenericNode<T> fast = start;

        if (start != null) {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    System.out.println("Cycle Present");
                    return;
                }
            }
            System.out.println("No cycle detected..");
        }
    }

    void print() {
        GenericNode<T> current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCRUD<Integer> operations = new LinkedListCRUD<>();
        operations.insertAtBeg(new GenericNode<Integer>(19));
        operations.insertAtBeg(new GenericNode<Integer>(29));
        operations.insertAtBeg(new GenericNode<Integer>(30));
        operations.insertAtBeg(new GenericNode<Integer>(15));


        operations.insertAtEnd(new GenericNode<Integer>(150));
        operations.insertAtMid(new GenericNode<Integer>(250), 3);

        operations.midPoint();
        operations.print();
//        operations.reverse();
        operations.detectLoop();
    }
}
