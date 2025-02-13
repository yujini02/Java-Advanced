package day07.collection.tree.binarySearchTree;
//1. Node 생성 => Root
//2. BST에 데이터 넣은 기능 구현
public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else { //CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.value) {  //삽입할 값이 현재의 노드값보다 작다
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        //CASE 1 : Node가 하나도 없을때
        if (this.head == null) {
            return null;
            //CASE 2 : Node가 하나 이상일때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }
        return null;
    }

    //노드 삭제 boolean delete(int data); search써서 remove
   /* public boolean delete(int data){
        *//*삭제 케이스
        * 자식이 없는 노드를 삭제
        * 자식 하나만 있는 노드에 대한 삭제
        * 자식 둘 다 있는 노드에 대한 삭제*//*

    }*/
}

