// Last updated: 2/4/2026, 12:30:08 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *                                      
 *     }
 * }
 */
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<Integer> del = new HashSet<>();
        List<TreeNode> ans = new ArrayList<>();
        for (int x : to_delete)
            del.add(x);


        q.add(root);
        if (!del.contains(root.val))
            ans.add(root);

        
        while (!q.isEmpty()) {
            TreeNode rv = q.poll();
            if(del.contains(rv.val)){
                if (rv.left!=null && !del.contains(rv.left.val) ) ans.add(rv.left);
                if (rv.right!=null && !del.contains(rv.right.val) ) ans.add(rv.right);
            }
            if (rv.left!=null){
                q.add(rv.left);
                if (del.contains(rv.left.val)) rv.left=null;
            }
            if (rv.right!=null){
                q.add(rv.right);
                if (del.contains(rv.right.val)) rv.right=null;
            }
        }
        return ans;
    }
}