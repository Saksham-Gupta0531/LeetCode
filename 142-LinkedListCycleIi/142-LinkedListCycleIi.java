// Last updated: 9/4/2025, 6:14:38 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Hashtable<ListNode ,Integer> dic=new Hashtable<>();
        ListNode temp = head ;
        if (head==null)
            return null;
        while (temp.next!= null){
            if (!dic.containsKey(temp)){
                dic.put(temp,1);
            }
            else{
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}