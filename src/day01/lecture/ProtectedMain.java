package day01.lecture;

class A1 {
    public String field1;

    protected A1(){}
    protected A1(String field1){
        this.field1 = field1;
    }
    protected void method(){
        System.out.println("A클래스의 method1()");
    }
}

class B1 {
    protected String field2;

    protected B1(){}
    protected void method1(){
        System.out.println("B클래스의 method1()");
        A1 a = new A1();
        a.field1 ="value1";
    }
}
public class ProtectedMain {
}
