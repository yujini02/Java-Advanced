package day06.reflectionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMain {
    public static void main(String[] args) throws Exception{
        //클래스 객체 가져오기 (Class.forName()메소드 방식)
        Class<Person> personClass = (Class<Person>) Class.forName("day06.reflectionEx.Person"); //day06이 아니라 api라고 쓰면 경로못찾아서 오류났음
        //생성자 가져오기 - Person(String name, int age)
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        //가져온 생성자로 인스턴스 만들기
        Person p1 = constructor.newInstance("신세계",30);
        //동적으로 메서드 가져와서 실행
        p1.getField(); //invoke()

        //접근 제한자 public, public static, private Methods
        //특정 public 메서드 가져와 실행
        Method total = personClass.getMethod("total", int.class,int.class);
        int result1 = (int) total.invoke(new Person(), 10, 20);
        System.out.println("result1 :" + result1);

        //특정 static 메서드 가져와 실행
        Method staticTotal = personClass.getMethod("staticTotal", int.class, int.class);
        int staticResult = (int)staticTotal.invoke(null,100,200);
        System.out.println("staticResult : " + staticResult);

        //특정 private 메소드 가져와 실행
        Method privateTotal = personClass.getDeclaredMethod("privateTotal", int.class, int.class);
        privateTotal.setAccessible(true); //외부에서 접근 할 수 있도록 설정
        int privateResult = (int) privateTotal.invoke(new Person(),200,300);
        System.out.println("privateTotal :" + privateResult);
    }
}
