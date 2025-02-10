package day05.ex06.builderpatternEx2;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student.StudentBuilder("방탄","진","경영").build();
        Student student2 = new Student.StudentBuilder("방탄","지민","컴공").addgrade("A").build();
        System.out.println(student1);
        System.out.println(student2);
    }
}
