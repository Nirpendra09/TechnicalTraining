package DSA.LinkedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = getSize(headA);
        int m = getSize(headB);
        int d;
        if (n > m) {
            d = n - m;
            return getIntersection(d,headA, headB);
        } else {
            d = m - n;
            return getIntersection(d,headB, headA);
        }
    }

    ListNode getIntersection(int d, ListNode head1, ListNode head2) {
        int i = 0;
        ListNode cur1 = head1;
        ListNode cur2 = head2;

        for (i = 0; i < d; i++) {
            if (cur1 == null)
                return null;
            cur1 = cur1.next;
        }

        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }

    int getSize(ListNode node) {
        int count = 0;
        ListNode cur = node;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    // most efficient
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null)
//            return null;
//
//        ListNode a = headA;
//        ListNode b = headB;
//
//        while (a != b) {
//            a = a == null ? headB : a.next;
//            b = b == null ? headA : b.next;
//        }
//        return a;
//    }
}
