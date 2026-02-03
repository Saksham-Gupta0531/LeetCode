// Last updated: 2/3/2026, 12:06:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    class Pair{
13        int idx ;
14        int el;
15        Pair(int idx ,int el){
16        this.idx = idx;
17        this.el = el;
18    }
19
20    }
21    public int[] nextLargerNodes(ListNode head) {
22
23        Stack<Pair> st = new Stack<>();
24        List<Integer> lst = new ArrayList<>();
25        int i =0 ;
26        
27        while (head!=null){
28            lst.add(0);
29            while( !st.isEmpty() && st.peek().el< head.val){
30                Pair p = st.pop();
31                lst.set(p.idx,head.val);
32                
33            }
34        
35            st.push(new Pair ( i,head.val ));
36            head=head.next;
37            i++;
38        }
39        
40    return lst.stream().mapToInt(x -> x).toArray();
41    }
42}