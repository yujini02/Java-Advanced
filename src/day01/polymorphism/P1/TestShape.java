package day01.polymorphism.P1;

public class TestShape {
    public static void main(String[] args) {

        Rectangular rectangular = new Rectangular();
        Circle circle = new Circle();

        circle.setRadius(10);                              //설정
        circle.calculationArea();                          //계산
        System.out.println("원의 면적은 "+circle.getArea()); //출력

        rectangular.setWidth(10);
        rectangular.setHight(20);
        rectangular.calculationArea();
        System.out.println("직사각형의 면적은 "+rectangular.getArea());

    }
}
