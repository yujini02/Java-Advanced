package day05.ex03.refact;
//캡슐화를 통해서 외부에서의 접근을 차단하면서, 내부 클래스에서 외부 클래스의 멤버들을 제약없이 쉽게 접근할 수 있도록 구조적으로 프로그래밍 하였다. 클래스 구조를 숨겨서 코드의 복잡성도 줄임
class Creature2 {
    int life=100;

    // private class, 오로지 Creature2 외부에서만 접근 가능한 내부 클래스 생성
    private class Animal2{
        private String name = "Tiger";

        int getOuter(){
            return life;
        }
    }

    public void method(){
        Animal2 animal1 = new Animal2();

        //Getter 없이 내부 클래스의 private멤버 접근
        System.out.println(animal1.name);
        //내부 클래스에서 외부 클래스 private 멤버 출력
        System.out.println(animal1.getOuter());
    }
}
public class CreatureMain2{
    public static void main(String[] args) {
        Creature2 creature1 = new Creature2();
        creature1.method();
    }
}


