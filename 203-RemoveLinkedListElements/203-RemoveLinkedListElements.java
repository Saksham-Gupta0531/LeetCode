// Last updated: 9/4/2025, 6:14:20 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev= new ListNode(0);
        if (head==null) return head;
        if (head.val==val){
            while (head!=null && head.val==val){
                head=head.next;
            }
        }

        prev.next=head;
        ListNode curr=head;
        while (curr!=null ){
            if (curr.val==val)
                prev.next=curr.next;
            else
                prev=prev.next;
            curr=curr.next;
        }
       //if (curr.val==val) prev.next =null;
        return head;

    }
}