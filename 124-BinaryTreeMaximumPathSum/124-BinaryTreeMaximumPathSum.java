// Last updated: 9/4/2025, 6:14:44 AM
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
   static int max;

    public static int maxSum(TreeNode root){
        if(root == null)  return 0;
        int left = Math.max(0, maxSum(root.left));
        int right = Math.max(0, maxSum(root.right));
        max = Math.max(max,left + right + root.val);

        return root.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
       maxSum(root);
       return max;

    }
}