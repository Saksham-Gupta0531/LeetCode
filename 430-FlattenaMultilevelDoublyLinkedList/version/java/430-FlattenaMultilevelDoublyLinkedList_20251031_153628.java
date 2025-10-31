// Last updated: 10/31/2025, 3:36:28 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp =head ;
        Stack<Node> st = new Stack<>();
        while(temp!=null && (temp.next !=null || temp.child != null) ){
            if ( temp.child != null ){
                if (temp.next!=null)
                    st.push(temp.next);
                temp.next= temp.child;
                temp.next.prev = temp; 
                temp.child = null ;
            }
            temp = temp.next;
        }   
        while(!st.isEmpty()){
            temp.next = st.pop();
            temp.next.prev = temp;
            temp.child = null ;
            while(temp.next!=null){
                
                temp= temp.next;
            }
        }
        return head;
    }
}