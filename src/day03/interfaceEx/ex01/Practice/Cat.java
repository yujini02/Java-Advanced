package day03.interfaceEx.ex01.Practice;

public class Cat extends Tail implements Animal,Pet{

    public Cat(){

    }

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void play() {
        System.out.println("야옹이 노는중");
    }
}
