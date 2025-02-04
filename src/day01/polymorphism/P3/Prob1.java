package day01.polymorphism.P3;

public class Prob1 {
    public static void main(String[] args) {
        Wheeler[] wheelers = new Wheeler[2];

        wheelers[0] = new Truck("트럭",75,4);
        wheelers[1] = new Bike("자전거",20,2);

        for(Wheeler wheeler : wheelers){
            System.out.println(wheeler.carName +" :바퀴 " +wheeler.wheelNumber + "개입니다.");
        }

        //트럭 100
        wheelers[0].speedUp(5);

        //자전거 25
        wheelers[1].speedUp(5);

        //트럭 50
        wheelers[0].speedDown(15);

        //자전거 10
        wheelers[0].speedDown(20);

        //정지상태
        for(Wheeler wheeler : wheelers){
            wheeler.stop();
        }

        //트럭 50
        wheelers[0].speedUp(10);
    }
}
