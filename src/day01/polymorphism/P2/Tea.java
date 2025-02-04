package day01.polymorphism.P2;

public class Tea extends Beverage {

    public static int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Tea(String name){
        super(name);
        amount++;
    }

    @Override
    void calcPrice() {
        switch (getName()){
            case "lemonTea" :
                setPrice(1500);
                break;
            case  "ginsengTea":
                setPrice(2000);
                break;
            case "redginsengTea":
                setPrice(2500);
                break;
            default:
                setPrice(0);
        }

    }



}
