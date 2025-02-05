package day03.interfaceEx.ex03;

public abstract class Factory {
    int openHour;                 //가동시각 //멤버변수
    int closeHour;                //종료시각
    String name;                  //공장이름

    public Factory(String name, int openHour, int closeHour){  //생성자
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }
    String getFactoryName(){
        //공장의 이름을 리턴
        return this.name;
    };
    int getWorkingTime(){
        //종료시간 에서 가동시간 값을 뺀 실제 공장운영시간을 리턴
        return closeHour - openHour;
    };
    abstract int makeProducts(char skill); //추상메소드 정의

}
