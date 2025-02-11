package day07.genericEx.ex03.extendsEx;

public class CompareUtil {

    public static <T extends Comparable<T>> T max(T a, T b){      //Comparable 인터페이스 상한제한 / <T extends Comparable<T>>의미는 사용할 타입, T는 리턴값
        return a.compareTo(b) > 0 ? a : b;                        //true면 a, false면 b
    }

    public static void main(String[] args) {
        System.out.println(CompareUtil.max(5,10));
    }
}
