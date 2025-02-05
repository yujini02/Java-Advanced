package day03.interfaceEx.ex02;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        if(cheatableChicken instanceof Cheatable){
            cheatableChicken.fly();
        }

        for(int i =0; i<3; i++){
            System.out.println(i+1 + "시간 후");
            dog.run(1);
            System.out.println(dog.getDistance());
            chicken.run(1);
            System.out.println(chicken.getDistance());
            cheatableChicken.run(1);
            System.out.println(cheatableChicken.getDistance());
        }
    }
}
