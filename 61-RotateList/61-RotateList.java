// Last updated: 9/4/2025, 6:15:18 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int l=1;
        if (head==null )return null;
        if (k==0) return head;
        while (temp.next!=null){
            temp =temp.next;
            l++;
        }
        temp.next = head;
        
        k=k%l;
        int p= l-k;
        while (p-->0){
            temp=temp.next;
        }
        ListNode ad=temp.next;
        temp.next=null;
        return ad;

    }
    
}