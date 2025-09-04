// Last updated: 9/4/2025, 6:14:48 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        link(root);
        return root;
    }
    public void link(Node root){
        if(root == null || root.left == null){
            return;
        }
        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }
        link(root.left);
        link(root.right);
    }
}