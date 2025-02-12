package day07.collection.listEx.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        class User {
            String name;
            int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }
        }

        //List에 5명의 사용자 저장 후 정렬
        List<User> users = new ArrayList<>();
        users.add(new User("김석진", 21));
        users.add(new User("김영희", 24));
        users.add(new User("김병곤", 24));
        users.add(new User("이미진", 30));
        users.add(new User("홍길동", 23));

        //정렬
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                //return Integer.compare(o1.age, o2.age);
                return o1.name.compareTo(o2.name); //이름(문자열)순으로 정렬하려면 compareTo()메서드로
            }
        });

        //정렬 리스트 출력
        //Collections.sort(users,(u1,u2) -> Integer.compare(u1.age,u2.age));      //나이순 정렬
        Collections.sort(users,(u1,u2) -> u1.name.compareTo(u2.name));  //이름순 정렬
        for(User user : users) System.out.println(user.name + " " +user.age + "세");
    }

}
