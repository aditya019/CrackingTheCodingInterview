package LinkedLists;

public class OwnLinkedList {
    class Node {
        int val; Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    Node head;
    OwnLinkedList() {
        head = null;
    }
    public void add(int val) {
        if(head == null) {
            head = new Node(val);
        } else {
            Node cnode = head;
            Node newNode = new Node(val);
            while(cnode.next != null) cnode = cnode.next;
            cnode.next = newNode;
        }
    }
    public void printList() {
        Node cnode = head;
        while(cnode != null) {
            System.out.print(cnode.val + " ");
            cnode = cnode.next;
        }
        System.out.println();
    }
}
