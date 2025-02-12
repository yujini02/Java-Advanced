package day08.A1;

import lombok.Data;

@Data
public class Student implements Comparable<Student>{

    //멤버 필드
    private String name;
    private int[] record;

    //생성자
    public Student(String name, int[] record) {
        this.name = name;
        this.record = record;
    }

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.record = new int[3];
        this.record[0] = kor;
        this.record[1] = eng;
        this.record[2] = math;
    }

    //총점을 계산하여 반환하는 메소드
    public int computeSum(){
        int total = 0 ;
        for(int score : record) {
            total += score;
        }
        return total;
    }

    //평균을 계산하여 반환하는 메소드
    public double computeAvg(){
        return (double) computeSum() / record.length;
    }

    //학점을 계산하여 반환하는 메소드
    public String computeGrade(){
        int gradeLevel = (int) computeAvg() /10;
        if (gradeLevel >=9) return "A";
        else if (gradeLevel == 8) return "B";
        else if (gradeLevel == 7) return "C";
        else if (gradeLevel == 6) return "D";
        else return "F";
    }

    @Override
    public int compareTo(Student o) {
        if(this.computeSum() >= o.computeSum()) return -1;
        else return 1;

    }
}
