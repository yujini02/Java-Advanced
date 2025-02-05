package day01.polymorphism.P2;

public class CoffeShop {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverage[] beverage = new Beverage[5];
        beverage[0] = new Coffee("Cappuccino");
        beverage[1] = new Coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new Coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");
        getSalesInfo(beverage);

        System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>"+Coffee.amount+"잔");  //static은 합산하기위해 사용(누적값). static은 해당프로그램이 종료되기 전까지 유지되는 영역이다.
        System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔");
    }
    //결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요.
    public static void getSalesInfo(Beverage[] beverages){ //위의 Beverage 정보를 가져오는건가. ()는 배열의 주소값을 복사함
        for(int i=0; i<beverages.length;i++){
            beverages[i].print(i+1);
        }
    }

    //결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
    public static int getTotalPrice(Beverage[] beverages){
        int totalPrice = 0;
        for(Beverage beverage : beverages){
            totalPrice += beverage.getPrice();
        }
        return totalPrice; // totalPrice값을 호출한 곳에 정수로 리턴
    }
}
