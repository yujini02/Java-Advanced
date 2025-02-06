package day03.interfaceEx.ex04.CarEx;

public class Car {

    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    public void run(){
        tire1.roll();
        tire2.roll();  //인터페이스에 선언된 추상메소드를 호출했다.
    }
}
