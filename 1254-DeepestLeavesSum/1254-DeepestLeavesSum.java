// Last updated: 9/3/2025, 5:27:56 PM
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
    public int sum=0;
    public int ma = 0;
    public int deepestLeavesSum(TreeNode root) {
        preorder(root,0);
        return sum;
    } 
    
    public void preorder(TreeNode root ,int c) {
        if (root == null){
            return;
        }
        if (root.left == null || root.right == null ) 
        {
            if (c==ma)
            {
                sum+=root.val;
            }
            else if(c>ma)
            {
                sum = root.val;
                ma=c;
            }
        }
        //System.out.print(root.val + " ");
        preorder(root.left,c+1);
        preorder(root.right,c+1);
}

}