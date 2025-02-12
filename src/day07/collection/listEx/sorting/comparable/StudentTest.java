package day07.collection.listEx.sorting.comparable;

public class StudentTest {
    public static void main(String[] args) {
        Student 철수 = new Student(250123, "김철수");
        Student 영희 = new Student(240123,"최영희");

        int isBig = 철수.compareTo(영희);
        System.out.println(isBig); //리턴값에 따라 자리바꿈이 된다
    }
}
