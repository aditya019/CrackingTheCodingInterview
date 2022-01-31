package LinkedLists;

public class SumOfList extends OwnLinkedList{
    public static int sum(Node node) {
        if(node == null) return 0;
        else return node.val + sum(node.next);
    }

    public static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(sum(list.head));
    }
}
