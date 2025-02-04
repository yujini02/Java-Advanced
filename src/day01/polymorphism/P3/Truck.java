package day01.polymorphism.P3;

public class Truck extends Wheeler{

    public Truck(String carName, int velocity,int wheelNumber){
        super.carName = carName;
        super.velocity = velocity;
        super.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed*5;
        if(velocity>100){
            velocity = 100;
            System.out.println(carName + "의 최고속도 위반으로 속도를" + velocity +"로 내립니다.");
        }else {
            System.out.println(carName + "의 현재 속도는 "+ velocity + "입니다.");
        }
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed*5;
        if(velocity<50){
            velocity = 50;
            System.out.println(carName + "의 최저속도위반으로 속도를" + velocity + "로 올립니다.");
        }else {
            System.out.println(carName + "의 현재 속도는" + velocity + "입니다.");
        }
    }
}
