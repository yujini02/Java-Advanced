package day01.polymorphism.P3;

public abstract class Wheeler {
    protected int velocity; //속도
    protected String carName;
    protected int wheelNumber;

    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    public void stop(){
        velocity = 0;
        System.out.println("정지상태로 속도를 "+this.velocity + "으로 초기화합니다"); //공통속성
    }
}
