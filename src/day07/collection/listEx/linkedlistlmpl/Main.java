package day07.collection.listEx.linkedlistlmpl;



public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
        myLinkedList.addNode(1);
        System.out.println(myLinkedList.head.data);
        myLinkedList.addNode(2);
        System.out.println(myLinkedList.head.next.data);
        myLinkedList.addNode(3);
        System.out.println(myLinkedList.head.next.next.data);
        myLinkedList.addNode(4);
        System.out.println(myLinkedList.head.next.next.next.data);


    }
}
