package day03.interfaceEx.ex03;

import day01.package2.C;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(String name , int closeHour , int openHour){
        super(name, closeHour, openHour);
    }
    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' :
                return 8*getWorkingTime();
            case 'B' :
                return 5*getWorkingTime();
            case 'C' :
                return 3*getWorkingTime();
            default:
                return 1;
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        if(partner instanceof CarFactory){
            ((CarFactory) partner).makeProducts('C');
        } else if (partner instanceof TVFactory) {
            ((TVFactory)partner).makeProducts('C');
        }
        return 0;

    }
}
