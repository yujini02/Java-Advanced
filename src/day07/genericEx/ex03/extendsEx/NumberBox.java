package day07.genericEx.ex03.extendsEx;

import java.util.List;

//Number 타입만 지원하는 제너릭클래스
//Number를 확장하는 클래스만 NumberBox의 타입매개변수로 사용할 수 있다
public class NumberBox <T extends Number>{
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }
    public double doubleValue(){
        return number.doubleValue();
    }

    //상한 제한 와일드 카드 (? extends T) 알려지지 않은 유형이 특정 타입 또는 그 하위클래스가
    public void printNumberList(List<? extends Number> list){ //Number의 하위타입들을 받아서 출력해줘
        for(Number number : list){                            //List 타입으로 printNumberList를 출력
            System.out.println(number);
        }
    }

    //어떤 유형과도 함께 사용할 수 있도록 유연성 제공
    public void printList(List<?> list){
        for(Object element : list) System.out.println(element);
    }

    //하한 제한 와일드 카드 (? super T) 특정 타입 또는 그 상위 클래스 중 하나를 허용
    public void addNumbers(List<? super Integer> list){ //Integer의 상위 클래스 중에 사용
        list.add(10);
    }
}
