// Last updated: 7/31/2025, 12:30:12 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    
        node.val = node.next.val;
        node.next = node.next.next;}
}