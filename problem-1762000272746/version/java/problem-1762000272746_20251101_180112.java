// Last updated: 11/1/2025, 6:01:12 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int  i: nums){
            map.put(i,1);
        }
        while(map.containsKey(head.val))
            head = head.next ; 
        ListNode temp = head ;


        while(temp.next!= null && temp!=null ){
            
            if (!map.containsKey(temp.next.val)){
                temp = temp.next;
            }
            else{
                temp.next= temp.next.next;
            }
        }
        return head;
    }
}