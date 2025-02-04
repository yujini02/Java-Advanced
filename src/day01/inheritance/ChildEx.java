package day01.inheritance;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data";
        parent.method1();
        parent.method2();

//        parent.field2 = "data_value";
//        parent.method3();

        Child child = (Child) parent;
    }
}
