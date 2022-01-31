package LinkedLists;

public class DeleteMiddleNode extends OwnLinkedList{
    static void deleteMiddle(OwnLinkedList list) {
        if(list == null) return;
        Node fast = list.head;
        Node slow = list.head;
        Node prev = null;
        while(fast != null && fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;
    }

    public static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printList();
        deleteMiddle(list);
        list.printList();
    }
}
