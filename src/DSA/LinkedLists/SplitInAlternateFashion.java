package DSA.LinkedLists;

public class SplitInAlternateFashion {
    public static void main(String[] args) {
        SplitInAlternateFashion split = new SplitInAlternateFashion();
        split.add(10);;
        split.add(20);;
        split.add(30);;
        split.add(40);;
        split.add(50);;
        split.add(60);;

        split.approcah();
    }

    ListNode first = null, second = null, current;
    ListNode firstTail = null, secondTail = null;
    static ListNode start, tail;

    void approcah() {
        current = start;

        ListNode odd =start, even = start.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        print(start);
        print(evenHead);

//        boolean alternate = true;
//        while (current != null) {
//            move(current, alternate);
//            current = current.next;
//            alternate = !alternate;
//        }
//        System.out.println("First Linked List");
//        print(first);
//        System.out.println("Second Linked List");
//        print(second);
    }

    void add(int data) {
        if (start == null) {
            tail = start = new ListNode(data);
        }
        ListNode current = start;
        while (current.next != null) {
            current = current.next;
        }
        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;
    }

//    void move(ListNode current, boolean alternate) {
//        if (alternate) {
//            if (first == null) {
//                first = firstTail = current;
//                return;
//            }
//            firstTail.next = current;
//            firstTail = current;
//        } else {
//            if (second == null) {
//                second = secondTail = current;
//                return;
//            }
//            secondTail.next = current;
//            secondTail = current;
//        }
//    }

    static void print(ListNode node) {
        ListNode cur = node;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
