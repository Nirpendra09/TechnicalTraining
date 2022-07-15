package DSA.LinkedLists;

public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1, cur2 = list2;
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                temp.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            } else {
                temp.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
        }

        if (cur1 != null)
            temp.next = cur1;
        if (cur2 != null)
            temp.next = cur2;

        return result.next;
    }
}
