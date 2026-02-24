// Last updated: 2/24/2026, 11:35:35 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int sumRootToLeaf(TreeNode root) {
18        return fun(root,0);
19    }
20    public int fun(TreeNode root ,int val){
21        if(root == null)return val;
22        if (root.left == null && root.right == null) return val+ root.val;
23
24        int cur = val+ root.val;
25        int ans = 0;
26        if ( root.left != null) ans += fun( root.left , cur*2);
27        if ( root.right != null) ans += fun( root.right , cur*2);
28        return ans ;
29
30    }
31}