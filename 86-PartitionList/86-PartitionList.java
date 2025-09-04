// Last updated: 9/4/2025, 6:15:03 AM
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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode rLess= less;
        ListNode rgreater =greater;
        while (head!=null){
            if (head.val >= x){
                greater.next=head;
                greater=greater.next;
            }
            else{
                less.next = head;
                less = less.next;
            } 
            head=head.next;
        }
        less.next = rgreater.next;
        greater.next=null;
        return rLess.next;
    }
}