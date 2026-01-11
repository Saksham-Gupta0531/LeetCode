// Last updated: 1/11/2026, 3:26:00 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *                                      
11 *     }
12 * }
13 */
14class Solution {
15    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
16        Queue<TreeNode> q = new LinkedList<>();
17        HashSet<Integer> del = new HashSet<>();
18        List<TreeNode> ans = new ArrayList<>();
19        for (int x : to_delete)
20            del.add(x);
21
22
23        q.add(root);
24        if (!del.contains(root.val))
25            ans.add(root);
26
27        
28        while (!q.isEmpty()) {
29            TreeNode rv = q.poll();
30            if(del.contains(rv.val)){
31                if (rv.left!=null && !del.contains(rv.left.val) ) ans.add(rv.left);
32                if (rv.right!=null && !del.contains(rv.right.val) ) ans.add(rv.right);
33            }
34            if (rv.left!=null){
35                q.add(rv.left);
36                if (del.contains(rv.left.val)) rv.left=null;
37            }
38            if (rv.right!=null){
39                q.add(rv.right);
40                if (del.contains(rv.right.val)) rv.right=null;
41            }
42        }
43        return ans;
44    }
45}