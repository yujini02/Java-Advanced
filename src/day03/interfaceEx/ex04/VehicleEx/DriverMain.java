package day03.interfaceEx.ex04.VehicleEx;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

//        Bus bus = new Bus();
//        driver.drive(bus);
        driver.drive(new Bus());

//        Taxi taxi = new Taxi();
//        driver.drive(taxi);
        driver.drive(new Taxi());

//        Horse horse = new Horse();
//        driver.drive(horse);
        driver.drive(new Horse());
    }
}
