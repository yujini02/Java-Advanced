package day07.genericEx.ex04;

public class Main {
    public static void main(String[] args) {
        //모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        System.out.println("======================================");
        //학생만 신청 가능
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));

        //직장인과 일반인 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
    }
}
