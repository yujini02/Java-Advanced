package day03.interfaceEx.ex03;

public class TVFactory extends Factory implements IWorkingTogether{
    public TVFactory(String name , int closeHour , int openHour){
        super(name, closeHour, openHour);
    }
    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' :
                return 8*getWorkingTime();
        }
        return 0;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return 0;
    }
}
