package day01.polymorphism.P2;

public class Coffee extends Beverage {

    public static int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Coffee(String name){
        super(name);
        amount++;
    }

    @Override
    void calcPrice() {
        switch (getName()){
            case "Americano":
                setPrice(1500);
                break;
            case "CafeLatte":
                setPrice(2500);
                break;
            case "Cappuccino":
                setPrice(3000);
                break;
            default:
                setPrice(0);
        }
    }

}
