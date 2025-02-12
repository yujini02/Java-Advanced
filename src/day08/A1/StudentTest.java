package day08.A1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.print("이름을 입력하세요: ");
            String inputName = br.readLine();
            System.out.println("국어 성적을 입력하세요: ");
            int kor = Integer.parseInt(br.readLine());
            System.out.println("영어 성적을 입력하세요: ");
            int eng = Integer.parseInt(br.readLine());
            System.out.println("수학 성적을 입력하세요: ");
            int math = Integer.parseInt(br.readLine());

            students.add(new Student(inputName, new int[]{kor,eng,math}));

            System.out.println("멈추시겠습니까? (y/n) : ");
            String a = br.readLine();
            if (a.equals("y")) {
                break;
            }

        }

        /*students.add(new Student("김석진",98,95,90));
        students.add(new Student("김지민",70,69,51));
        students.add(new Student("유승호",70,78,75));

        students.forEach((s)-> System.out.println(s));*/

        Collections.sort(students); //정렬

        students.forEach((s)-> System.out.println(s)); //출력
    }
}
