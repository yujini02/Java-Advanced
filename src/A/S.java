package A;

interface aaa {
    void print();
}
interface bbb {
    void input();
}
interface ccc {
    void search();
}

public abstract class S implements aaa, bbb, ccc{
    //static final S INSTANCE = new A();

    public static void main(String[] args) {

    }

}

class A extends S {
    private int a = 10;

    public void print() {
        System.out.println(a);
        System.out.println("p");
    }
    public void input() {

        System.out.println("I");
    }
    public void search() {

        System.out.println("S");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
