package Add_Two_Numbers;

public class Solution {

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0, x, y, sum;
        ListNode result, cur;

        result = new ListNode();
        cur = result;

        for (;;) {
            x = (l1 != null) ? l1.val : 0;
            y = (l2 != null) ? l2.val : 0;
            sum = x + y + c;
            
            c = sum/10;
            cur.val = sum % 10;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(l1 == null && l2 == null) break;
            cur.next = new ListNode();
            cur = cur.next;
        }
        if (c != 0) {
            cur.next = new ListNode(c);
        }

        return result;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(3, new ListNode(2, new ListNode(1)));
        ListNode l2 = new ListNode(5, new ListNode(4, new ListNode(3)));
        addTwoNumbers(l1, l2);
    }
}