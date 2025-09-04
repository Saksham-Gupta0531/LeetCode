// Last updated: 9/4/2025, 6:15:49 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null) return null;
        ListNode tail=head;
        for(int i=0;i<k;i++){
            if (tail==null) return head;
            tail=tail.next;
        }
        ListNode newhead=reverse(head,tail);
        head.next=reverseKGroup(tail,k);
        return newhead;
    }
    public ListNode reverse(ListNode cur, ListNode end) {
        ListNode prev = null;
        while (cur != end) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}