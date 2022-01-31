package LinkedLists;

public class KthToLastRemove extends OwnLinkedList {
    static void removeKth(OwnLinkedList list, int k) {
        Node head = list.head;
        Node cnode = head;
        Node anode = head;
        int c = 0;
        while(c < k) {
            anode = anode.next;
            c++;
        }
        Node prevNode = null;
        while(anode != null) {
            prevNode = cnode;
            cnode = cnode.next;
            anode = anode.next;
        }
        prevNode.next = cnode.next;
    }

    public static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();
        removeKth(list, 3);
        list.printList();
    }
}
