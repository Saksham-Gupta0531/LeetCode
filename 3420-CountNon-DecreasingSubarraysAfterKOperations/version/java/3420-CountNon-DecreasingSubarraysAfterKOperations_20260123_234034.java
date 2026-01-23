// Last updated: 1/23/2026, 11:40:34 PM
1class Solution {
2    public long countNonDecreasingSubarrays(int[] nums, int k) {
3        int n = nums.length;
4        Deque<Node> st = new ArrayDeque<>();
5        int l = n-1;
6        long ans = 0;
7        long cost = 0;
8        for(int i=n-1;i>=0;i--){
9            int cur = 1;
10            while(!st.isEmpty() && st.peekLast().val < nums[i]){
11                Node node = st.pollLast();
12                cur+=node.freq;
13                long cur_cost = (nums[i]-node.val)*node.freq;
14                cost+= cur_cost;
15            }
16            if(!st.isEmpty() && st.peekLast().val==nums[i]){
17                cur += st.peekLast().freq;
18                st.pollLast();
19            }
20            st.addLast(new Node(nums[i],cur));
21
22            while(!st.isEmpty() && cost>k){
23                Node node = st.pollFirst();
24                int cur_cost = (node.val-nums[l--]);
25                cost-=cur_cost;
26                if(node.freq>1) st.addFirst(new Node(node.val,node.freq-1));
27            }
28
29            if(cost<=k) ans += (l-i+1);
30        }
31
32        return ans;
33    }
34
35    private class Node{
36        int val;
37        long freq;
38        Node(int v,long f){
39            this.val = v;
40            this.freq = f;
41        }
42    }
43}