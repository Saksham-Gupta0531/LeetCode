// Last updated: 9/4/2025, 6:15:56 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length =1;
        while(head.next!=null){
            length++;
            head = head.next;
        }
        head = temp;
        int p=0;
        if (n == length) {
            return head.next;
        }
        while (temp.next!=null){
            if (p==length -n-1){
                temp.next=temp.next.next;
                break;
            }
            p++;
            temp= temp.next;
        }
    return head;
    }
}