// Last updated: 2/4/2026, 12:27:31 PM
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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode nn = new ListNode(0, null);
        if (curr.val > 4) {
            nn.val = 1;
            nn.next = curr;
        }
        while (curr.next != null) {
            if (curr.next.val > 4)
                curr.val = (curr.val * 2 + 1) % 10;
            else
                curr.val = (curr.val * 2)%10;
            curr = curr.next;
        }

        curr.val = (curr.val * 2) % 10;
        //System.gc();
        if (nn.val == 1)
            return nn;
        return head;
    }
}