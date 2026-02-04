// Last updated: 2/4/2026, 12:26:57 PM
import java.util.*;

class Solution {
    Node root;
    Integer[] memo; 

    public int minValidStrings(String[] words, String target) {
        root = new Node();
        memo = new Integer[target.length()]; 

        for (String word : words) {
            root.insert(word, root);
        }

        return dfs(root, target, 0);
    }

    int dfs(Node cur, String target, int index) {
        if (index == target.length()) return 1;
        
    
        if (cur == root && memo[index] != null) {
            return memo[index]; 
        }

        int ans = Integer.MAX_VALUE;
        int c = target.charAt(index) - 'a'; 

        if (cur.next[c] != null) {
        
            int v = dfs(cur.next[c], target, index + 1); 
            if (v != -1) ans = Math.min(ans, v);
         
            int val = dfs(root, target, index + 1);
            if (val != -1) ans = Math.min(ans, 1 + val);
        }

        int result = (ans == Integer.MAX_VALUE) ? -1 : ans;
        
    
        if (cur == root) memo[index] = result;
        return result;
    }
}

class Node {
    Node[] next = new Node[26]; 

    public void insert(String word, Node root) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            int val = c - 'a';
            if (cur.next[val] == null) {
                cur.next[val] = new Node();
            }
            cur = cur.next[val];
        }
    }
}