package LinkedLists;
// Leetcode Question 2 Add 2 numbers
class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode c = res;
        ListNode c1 = l1, c2 = l2;
        ListNode prevc = null;
        int sum = 0, carry = 0, remainder = 0;
        while(c1 != null && c2 != null) {
            sum = c1.val + c2.val + carry;
            carry = sum / 10;
            remainder = sum % 10;
            c.val = remainder;
            c.next = new ListNode(0);
            prevc = c;
            c = c.next;
            c1 = c1.next; c2 = c2.next;
        }
        while(c1 != null) {
            sum = c1.val + carry;
            carry = sum / 10;
            remainder = sum % 10;
            c.val = remainder;
            c.next = new ListNode(0);
            prevc = c;
            c = c.next; c1 = c1.next;
        }
        while(c2 != null) {
            sum = c2.val + carry;
            carry = sum / 10;
            remainder = sum % 10;
            c.val = remainder;
            c.next = new ListNode(0);
            prevc = c;
            c = c.next; c2 = c2.next;
        }
        if(carry == 0) {
            prevc.next = null;
        } else {
            c.val = 1;
        }
        return res;
    }
}
