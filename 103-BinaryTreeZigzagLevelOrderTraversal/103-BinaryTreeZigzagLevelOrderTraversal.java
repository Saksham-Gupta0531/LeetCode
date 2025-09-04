// Last updated: 9/4/2025, 6:14:53 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> ans = new LinkedList<>();
        if (root == null  ) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        
        qu.offer(root);
        int t=0;
        while(!qu.isEmpty()){
            
            int s = qu.size();
            List<Integer> ls = new LinkedList<>();
            for(int i =0 ; i< s; i++){

                
                if (qu.peek().left!=null) 
                    qu.offer(qu.peek().left);
                if (qu.peek().right!= null) 
                    qu.offer(qu.peek().right);
                ls.add(qu.poll().val);

            }
            if (t%2==0){
                ans.add(ls);
            }
            
            else{
                Collections.reverse(ls);
                ans.add(ls);
            }
            t++;
        }
        return ans;
    }
}