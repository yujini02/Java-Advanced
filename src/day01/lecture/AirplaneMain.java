package day01.lecture;

public class AirplaneMain {
    public static void main(String[] args) {
        //AirPlane 생성, 이륙, 날다, 착륙하다 수행하세요
        AirPlane airPlane = new AirPlane();
        airPlane.takeOff();
        airPlane.fly();
        airPlane.land();

        //SuperAirplane 생성, 이륙, 날다, 착륙 수행하세요
        SuperAirPlane superAirPlane = new SuperAirPlane();
        superAirPlane.takeOff();
        superAirPlane.flyMode = superAirPlane.ADVANCED;
        superAirPlane.fly();
        superAirPlane.land();
    }

}
