// Last updated: 7/31/2025, 12:29:16 PM
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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }
    public dia_pair diameter(TreeNode root) {
			if(root == null) {
				return new dia_pair();
			}
			dia_pair ldp = diameter(root.left);
			dia_pair rdp = diameter(root.right);
			int sd = ldp.ht + rdp.ht + 2;
			dia_pair sdp = new dia_pair();
			sdp.dt = Math.max(sd, Math.max(rdp.dt, ldp.dt));
			sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
			return sdp;
		}
	}
class dia_pair{
	int dt = 0;
	int ht = -1;
}
