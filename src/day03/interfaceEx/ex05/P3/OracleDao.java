package day03.interfaceEx.ex05.P3;

public class OracleDao implements DataAccessObject{
    //추상메소드 오버라이딩
    @Override
    public void select() {
        System.out.println("Oracle DB 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB 삭제");
    }
}
