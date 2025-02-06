package day03.interfaceEx.ex03;

public abstract class Factory {   //Factory 추상클래스
    private int openHour;                 //가동시각 //멤버변수
    private int closeHour;                //종료시각
    private String name;                  //공장이름

    public Factory(String name, int openHour, int closeHour){  //생성자
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }
    String getFactoryName(){
        //공장의 이름을 리턴
        return this.name;
    };
    public int getWorkingTime(){
        //종료시간 에서 가동시간 값을 뺀 실제 공장운영시간을 리턴
        return closeHour - openHour;
    };
    abstract int makeProducts(char skill); //추상메소드 정의. 스킬에 맞게 생산할 수 있는양

}
