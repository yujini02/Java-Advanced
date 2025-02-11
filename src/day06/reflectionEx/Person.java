package day06.reflectionEx;
import java.lang.reflect.*;

public class Person {

    public String name;
    private int age;
    public static int weight = 50;

    //기본 생성자
    public Person(){}
    //이름과 나이를 입력받는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getField(){
        System.out.printf("이름 : %s 나이 : %d\n", name,age);
    }
    public int total(int left, int right){
        return left + right;
    }
    public static int staticTotal(int left, int right){
        return left + right;
    }
    public static int privateTotal(int left, int right){
        return left + right;
    }
}
