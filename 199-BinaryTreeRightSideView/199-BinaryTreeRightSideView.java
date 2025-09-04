// Last updated: 9/4/2025, 6:14:23 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ar = new LinkedList<>();
        fun(root, 0 ,ar);
        return ar;

    }
    public void fun(TreeNode root, int level, List<Integer> ar){
        if (root == null ) {
            return;
        }
        if(ar.size() == level){
            ar.add(root.val);
        }
        fun(root.right, level+1, ar);
        fun(root.left, level+1, ar);
    }
}