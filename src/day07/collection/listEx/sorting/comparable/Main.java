package day07.collection.listEx.sorting.comparable;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후 사용자의 이름과 나이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세


public class Main {

    public static void main(String[] args) {

        @Getter
        @ToString                                //클래스 위에 쓰는 것이다. ToString
        class User implements Comparable<User>{
            //@Getter 각각 매길 수도 있다
            String name;
            int age;


            User(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                return this.age - o.age;
            }

        }

        User u1 = new User("석진",30);
        User u2 = new User("지민",29);
        User u3 = new User("승호",28);
        User u4 = new User("길동",32);
        User u5 = new User("준호",48);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.forEach((s)->System.out.println(s));

        System.out.println("=====");
        Collections.sort(users);
        users.forEach(System.out::println);

    }
}
