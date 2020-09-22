/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
       Map<Node,Node> map = new HashMap<>();
       while(head != null){
           Node copy = new Node(head.val);
           map.put(head,copy);
           head = head.next;
       }
        head = curr;

        while(head !=null){

            Node node = map.get(head);
            node.next = map.get(head.next);
            node.random = map.get(head.random);

            head = head.next;
        }
        return map.get(curr);
        
    }
    
}