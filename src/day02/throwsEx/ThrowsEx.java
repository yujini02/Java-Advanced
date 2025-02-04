package day02.throwsEx;

public class ThrowsEx {
    public static void main(String[] args) {  //main 메소드에서 throws 키워드 예외는 JVM 이 최종적으로 처리한다.
        try {
            findClass();
        } catch (Throwable e) {
            System.out.println("예외처리" + e.getMessage());
        }

    }

    public static void findClass() throws Exception{
        Class.forName("java.lang.String2");
    }
}
