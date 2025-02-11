package day06.reflectionEx;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String str= new String("Class클래스 테스트");
        Class<? extends String> cls = str.getClass();
        System.out.println(cls);

        //.class 리터럴 로 얻기
        Class<? extends String> cls2 = String.class;
        System.out.println(cls2);
        //Class.forName()

        try { //인스턴스 할 수 없고 메소드 호출할 수 있다.
            Class<?> cls3 = Class.forName("java.lang.String"); //동적 로딩
            System.out.println(cls3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("1. "+ cls.getSimpleName());
        System.out.println("2. "+ cls.getPackage());
        System.out.println("3. "+ cls.getName());
        System.out.println("4. "+ cls.toString());
        System.out.println("5. "+ cls.toGenericString());

        System.out.println("6. "+ Arrays.toString(cls.getFields()));
        System.out.println("6. "+ Arrays.toString(cls.getMethods()));
        System.out.println("6. "+ Arrays.toString(cls.getInterfaces()));
        System.out.println("6. "+ cls.getSuperclass());
    }
}
