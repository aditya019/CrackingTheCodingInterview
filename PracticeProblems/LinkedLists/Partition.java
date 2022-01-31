package LinkedLists;

public class Partition extends OwnLinkedList{
    static void partitionList(OwnLinkedList list , int x) {
        Node ss = null, se = null, bs = null, be = null;
        Node cnode = list.head;
        while(cnode != null) {
            if(cnode.val < x) {
                if(ss == null) {
                    ss = cnode;
                    se = ss;
                } else {
                    se.next = cnode;
                    se = se.next;
                }
            } else {
                if(bs == null) {
                    bs = cnode;
                    be = cnode;
                } else {
                    be.next = cnode;
                    be = be.next;
                }
            }
            cnode = cnode.next;
        }
        se.next = bs;
        list.head = ss;
    }

    public static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.add(10);
        list.add(2);
        list.add(11);
        list.add(0);
        list.add(4);
        list.add(5);
        list.printList();
        partitionList(list,5);
        list.printList();
    }
}
