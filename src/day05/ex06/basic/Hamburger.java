package day05.ex06.basic;

public class Hamburger {
    //필수 멤버
    private int bun;  //빵의 수량
    private int patty;

    //선택 멤버
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    //다양한 햄버거 제공 가능
    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public Hamburger(int bun, int patty, int cheese) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }
}
