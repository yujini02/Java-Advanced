package day05.ex02;

public class ABMain {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();
        //A객체 참조하여 B객체 생성
        A.B b = a.new B();

        a.useB();
    }
}
