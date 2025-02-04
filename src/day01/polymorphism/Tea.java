package day01.polymorphism;

public class Tea extends Beverage{

    private int amount;

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
