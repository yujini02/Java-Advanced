package day01.polymorphism;

public class Coffee extends Beverage {

    private int amount;

    public Coffee(String name){
        setName("Americano");
        setName("CafeLatte");
        setName("Cappuccino");
    }

    @Override
    void calcPrice() {

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
