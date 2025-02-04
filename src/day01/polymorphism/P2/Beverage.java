package day01.polymorphism.P2;

public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(){}
    public Beverage(String name){
        this.name = name;
        calcPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract void calcPrice();
    public void print(int index){
        System.out.println(index + "번째 판매 음료는 " + name + "이며, 가격은 "+price);
    };
}
