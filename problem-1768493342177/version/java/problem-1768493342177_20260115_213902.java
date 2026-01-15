// Last updated: 1/15/2026, 9:39:02 PM
1import java.util.*;
2
3class Solution {
4    Node root;
5    Integer[] memo; 
6
7    public int minValidStrings(String[] words, String target) {
8        root = new Node();
9        memo = new Integer[target.length()]; 
10
11        for (String word : words) {
12            root.insert(word, root);
13        }
14
15        return dfs(root, target, 0);
16    }
17
18    int dfs(Node cur, String target, int index) {
19        if (index == target.length()) return 1;
20        
21    
22        if (cur == root && memo[index] != null) {
23            return memo[index]; 
24        }
25
26        int ans = Integer.MAX_VALUE;
27        int c = target.charAt(index) - 'a'; 
28
29        if (cur.next[c] != null) {
30        
31            int v = dfs(cur.next[c], target, index + 1); 
32            if (v != -1) ans = Math.min(ans, v);
33         
34            int val = dfs(root, target, index + 1);
35            if (val != -1) ans = Math.min(ans, 1 + val);
36        }
37
38        int result = (ans == Integer.MAX_VALUE) ? -1 : ans;
39        
40    
41        if (cur == root) memo[index] = result;
42        return result;
43    }
44}
45
46class Node {
47    Node[] next = new Node[26]; 
48
49    public void insert(String word, Node root) {
50        Node cur = root;
51        for (char c : word.toCharArray()) {
52            int val = c - 'a';
53            if (cur.next[val] == null) {
54                cur.next[val] = new Node();
55            }
56            cur = cur.next[val];
57        }
58    }
59}