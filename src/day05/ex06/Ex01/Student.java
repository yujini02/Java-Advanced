package day05.ex06.Ex01;

import day05.ex06.builderpatternEx1.Hamburger;

public class Student {
    //필수멤버
    private String id;            //멤버변수
    private String name;
    private String major;
    //선택멤버
    private String grade;
    private String phoneNumber;
    private String address;

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public static class StudentBuilder{
        private String id;            //멤버변수
        private String name;
        private String major;
        //선택멤버
        private String grade;
        private String phoneNumber;
        private String address;

        public StudentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StudentBuilder addgrade(String grade){
            this. grade = grade;
            return this;
        }

        public StudentBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder address (String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
