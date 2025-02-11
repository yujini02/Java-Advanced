package day07.genericEx.ex01;

public class Box<T> { // T는 Box의 인스턴스를 생성할 때 어떤 참조타입으로 대체될 수 있는 타입매개변수
    private T item;        //객체타입의 item
    private int count = 0; //item의 수를 추적하는 필드

    //getter & setter
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        this.count++;       //수 증가
    }

    public int getCount() { //수 출력
        return count;
    }
}
