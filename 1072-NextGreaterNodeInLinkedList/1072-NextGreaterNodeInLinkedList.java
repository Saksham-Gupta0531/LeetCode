// Last updated: 2/4/2026, 12:30:10 PM
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
    class Pair{
        int idx ;
        int el;
        Pair(int idx ,int el){
        this.idx = idx;
        this.el = el;
    }

    }
    public int[] nextLargerNodes(ListNode head) {

        Stack<Pair> st = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        int i =0 ;
        
        while (head!=null){
            lst.add(0);
            while( !st.isEmpty() && st.peek().el< head.val){
                Pair p = st.pop();
                lst.set(p.idx,head.val);
                
            }
        
            st.push(new Pair ( i,head.val ));
            head=head.next;
            i++;
        }
        
    return lst.stream().mapToInt(x -> x).toArray();
    }
}