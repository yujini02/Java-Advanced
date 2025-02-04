package day01;

class Car {
//    public int speed;
    private int speed;

    final public void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;
    }
    public void speedUp(){
//        this.speed += 1;
        this.speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
class SportsCar extends Car{

    @Override
    public void speedUp() {
//        this.speed +=10;
        int speed = this.getSpeed();
        speed +=10;
    }

    @Override
    public String toString() {
//        return "현재 스피드는 "+ this.speed;
        return "현재 스피드는 "+ this.getSpeed();
    }
}
public class CarMain {

    public static void main(String[] args) {
        Car mycar1 = new Car();
        mycar1.speedUp();
        mycar1.speedUp();
        mycar1.speedUp();
//        System.out.println(mycar1.speed);
        System.out.println(mycar1.getSpeed());

        SportsCar mycar2 = new SportsCar();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        mycar2.speedUp();
        System.out.println(mycar2.toString());
    }
}
