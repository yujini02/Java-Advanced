package day03.interfaceEx.ex04.CarEx;


public class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국타이어 회전합니다.");
    }
}
