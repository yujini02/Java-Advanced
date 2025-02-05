package day03.interfaceEx.ex03;

import day01.inheritance.Parent;
import day03.interfaceEx.ex02.Cheatable;

public class CarFactory extends Factory implements IWorkingTogether{
    public CarFactory(String name , int closeHour , int openHour){
        super(name, closeHour, openHour);
    }
    @Override
    int makeProducts(char skill) {
        //실제 공장운영시간과 곱한 값을 결과로 리턴
        //makeProduct는 물건을 만든다는 뜻
        //스킬에 따라 생산량이 달라진다
        //즉 이 함수는 당일 생산량을 구하는 함수이다.
        switch (skill){
            case 'A' :
                return 3*getWorkingTime();
                //break 호출한 곳으로 되돌아가니까 break 의미가 없다
            case 'B' :
                return 2*getWorkingTime();
            case 'C' :
                return getWorkingTime();
            default:
                return 0;
        }
        /*if(skill == 'A'){return 3;}
        else if (skill == 'B') {return 2;}
        else if (skill == 'C') {return 1;}
        else {return 0;}*/
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        //파트너 공장과 협력한 하루 생산량

        if(partner instanceof CarFactory){
        //파트너가 카팩토리 소속인지 검사
            return ((CarFactory)partner).makeProducts('B');
        }else if (partner instanceof TVFactory){
            return ((TVFactory)partner).makeProducts('B');
        }
        return 0; //둘 다 소속이 아닐 경우 0으로 리턴
    }
}
