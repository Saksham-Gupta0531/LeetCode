// Last updated: 2/3/2026, 12:44:32 PM
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
12    public ListNode doubleIt(ListNode head) {
13        ListNode curr = head;
14        ListNode nn = new ListNode(0, null);
15        if (curr.val > 4) {
16            nn.val = 1;
17            nn.next = curr;
18        }
19        while (curr.next != null) {
20            if (curr.next.val > 4)
21                curr.val = (curr.val * 2 + 1) % 10;
22            else
23                curr.val = (curr.val * 2)%10;
24            curr = curr.next;
25        }
26
27        curr.val = (curr.val * 2) % 10;
28        if (nn.val == 1)
29            return nn;
30        return head;
31    }
32}