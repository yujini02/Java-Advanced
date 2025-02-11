package day07.genericEx.practice;
//어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
public class GenericMethodEx {
    public static <T> void printArray(T[] array){
        for(T element : array) System.out.print(element);
    }

    public static void main(String[] args) {
        String[] strArray = {"abc","def"};
        GenericMethodEx.printArray(strArray);
        System.out.println();
        Integer[] integers = {5,4,3,2,1};
        GenericMethodEx.printArray(integers);

    }
}
