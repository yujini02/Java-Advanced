package day09.doubleLinkedList;
//양방향 링크드 리스트
//문제 아래 코드를 분석하여 데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하세요
// method name : insertToFront(frontNode , insertNode);
public class DoubleLinkedList<T> {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        //노드 추가
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        //임의의 노드 앞에 노드 추가
        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        //존재하지 않는 노드 앞에 삽입 시도와 맨 앞에 삽입 시도
        MyLinkedList.insertToFront(6, 2);
        MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        //노드 추가
        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    //노드 클래스 정의
    public class Node<T> {
        T data;
        Node<T> prev = null;   //이전 노드를 가리키는 포인터
        Node<T> next = null;   //다음 노드를 가리키는 포인터

        //노드 생성자
        public Node(T data) {
            this.data = data;
        }
    }

    //노드 추가 메서드
    public void addNode(T data) {
        if (this.head == null) {
            //리스트가 비어있는 경우, head와 tail을 새로운 노드로 설정
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            //리스트가 비어 있지 않은 경우, 마지막 노드까지 이동하여 새로운 노드 추가
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    //모든 노드 출력 메서드
    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    //head 로 부터 특정 노드를 찾는 메서드
    public T searchFromHead(T isData) {
        //리스트가 비어 있는 경우 null 반환
        if (this.head == null) {
            return null;
        } else {
            //현재 노드를 head로 초기화
            Node<T> node = this.head;
            //리스트의 끝까지 순회
            while (node != null) {
                //현재 노드의 데이터가 찾고자 하는 데이터와 일치하면 해당 데이터 반환
                if (node.data == isData) {
                    return node.data;
                } else {
                    //현재 노드를 다음 노드로 이동
                    node = node.next;
                }
            }
            //찾고자 하는 데이터를 발견하지 못한경우 null 반환
            return null;
        }
    }

    //tail 로부터 특정 노드를 찾는 메서드
    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    //임의 노드 앞에 새로운 노드를 삽입하는 메서드
    public boolean insertToFront(T existedData, T addData) {
        //리스트가 비어있는 경우
        if (this.head == null) {
            this.head = new Node<T>(addData);       //새로운 노드를 head로 설정
            this.tail = this.head;                  
            return true;                            //삽입 성공
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            this.head.next.prev = this.head;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                } else {
                    node = node.next;
                }
            }
            return false;
        }
    }
}
