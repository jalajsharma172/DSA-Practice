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

        Node current = head;
        while(current!=null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current=copy.next;
        }

       //randomd
        current = head;
        while(current!=null) {
            if(current.random!=null)current.next.random = current.random.next;
            current = current.next.next;
        }
        current = head;
        Node dummy = new Node(0);
        Node copyHead = dummy;
        while(current!=null) {
            copyHead.next = current.next;
            current.next = current.next.next;
            copyHead = copyHead.next;
            current = current.next;
            
        }

        return dummy.next;
    }
}