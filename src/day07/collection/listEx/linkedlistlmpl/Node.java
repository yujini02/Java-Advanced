package day07.collection.listEx.linkedlistlmpl;

public class Node <T>{
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
