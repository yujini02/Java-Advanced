package day02.sealedEx;

public non-sealed class Manager extends Person{
    @Override
    public void work() {
        System.out.println("생산 관리직을 수행합니다.");
    }
}
