// Last updated: 7/31/2025, 12:30:13 PM
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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        String s="";
        while (curr.next!=null){
            s=s+Integer.toString(curr.val);
            curr=curr.next;
        }
        s=s+Integer.toString(curr.val);
        //System.out.print(s);

        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}