package DSA.LinkedLists;

public class SpiltCircularLLInTwoHalves {
    ListNode start;
    ListNode tail;

    void splitCircular() {
        ListNode fast = start;
        ListNode slow = start;

        if (start == null) {
            System.out.println("Linkedlist is empty");
            return;
        }

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next.next == start) {
            fast = fast.next;
        }

        ListNode start1 = start;
        ListNode start2 = null;

        if (start.next != start)
            start2 = slow.next;

        fast.next = slow.next;
        slow.next = start;
    }
}
