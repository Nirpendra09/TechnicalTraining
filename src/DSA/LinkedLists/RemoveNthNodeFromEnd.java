package DSA.LinkedLists;

public class RemoveNthNodeFromEnd {
    public void removeNthFromEnd(ListNode head, int n) {
        ListNode ahead = head;

        for (int i = 0; i < n; i++) {
            ahead = ahead.next;
        }

        if (ahead == null) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (ahead.next != null) {
            ahead = ahead.next;
            current = current.next;
        }
        current.next = current.next.next;
    }
}
