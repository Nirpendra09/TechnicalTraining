package DSA.LinkedLists;

public class DetectAndRemoveLoop {
    public void detectNRemove(ListNode head) {
        ListNode fast = head, slow = head, entry = head, prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                while (slow != entry) {
                    prev = entry;
                    entry = entry.next;
                    slow = slow.next;
                }
                prev.next = null;
                return;
            }
        }
    }
}
