package day05.ex01;

//인스턴스 멤버클래스 B
//B객체는 A클래스 내부 어디에서나 생성할 수 없고, 인스턴스 필드값, 생성자, 인스턴스 메소드에서 생성할 수 있따.
public class A {

    //인스턴스 멤버 클래스를 만든다
    class B{

    }
    //인스턴스 필드 값으로 B객체를 생성해서 대입한다.
    B field = new B();

    //생성자
    A(){
        B b = new B();
    }
    //인스턴스 메소드
    void method(){
        B b = new B();
    }
}
