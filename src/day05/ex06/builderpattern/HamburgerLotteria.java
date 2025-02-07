package day05.ex06.builderpattern;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger 선민이햄버거 = new Hamburger.BurgerBuilder("플랫", "쇠고기").addCheese().addBacon().addtomato().addlettuce().build();
        System.out.println(선민이햄버거);
    }
}

//실습 : 필수 사항에 세트는 반드시 음료가 포함되는 햄버거 세트이다.
//음료가 포함되어 있는 햄버거를 만들어 주세요
//치킨버거(토핑: 치즈, 야채, 베이컨) + 콜라 세트를 메뉴 만들어 주세요
