package day07.genericEx.ex01;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("바비인형");
        stringBox.setItem("기차장난감");
        stringBox.setItem("곰돌이인형");
        System.out.println(stringBox.getItem());

        System.out.println(stringBox.getCount());
    }
}
