package day03.interfaceEx.ex02;

public abstract class Animal {    //Animal 추상 클래스
    private int speed;
    private double distance;      // 멤버변수인 속도와 거리를 측정 및 보관해 놓기위해 만들었다.

    public Animal(){}
    public Animal(int speed){     //속도받는 생성자를 만들었다
        this.speed = speed;
    }
    abstract void run(int hours); //run이라는 메서드는 자식클래스에서 오버라이딩 하기 위해 오버라이딩 이유: 동물들마다 달리는 속도가 달라서/객체내에서 유도리있게 사용하기 위해/이동거리를 측정하기 위해

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
