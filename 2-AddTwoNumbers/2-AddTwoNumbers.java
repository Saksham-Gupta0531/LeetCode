// Last updated: 9/4/2025, 6:16:13 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode prev = null;
        int carry = 0;
        
        while (head1 != null || head2 != null) {
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            if (head1 != null) {
                head1.val = sum % 10;
                prev = head1;
                head1 = head1.next;
            } else {
                prev.next = new ListNode(sum % 10);
                prev = prev.next;
            }

            if (head2 != null) head2 = head2.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return l1;
    }
}