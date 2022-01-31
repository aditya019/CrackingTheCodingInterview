package LinkedLists;

import java.util.HashSet;

public class RemoveDuplicates extends OwnLinkedList{
    public static void removeDuplicates(OwnLinkedList list) {
        HashSet<Integer> set = new HashSet<>();
        Node cnode = list.head;
        while(cnode.next != null) {
            if(set.contains(cnode.next.val)) {
                cnode.next = cnode.next.next;
            } else {
                set.add(cnode.val);
                cnode = cnode.next;
            }
        }
    }

    public static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(10);
        list.printList();
        removeDuplicates(list);
        list.printList();
    }
}
