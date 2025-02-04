package day02.exception.ex02;

import java.io.*;
/*
public class FileTryWithResourceEx implements AutoCloseable{
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("data2.txt")){
            file.write("Java Programming");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(
        FileInputStream fis = new FileInputStream("data.txt");
        DataInputStream dis = new DataInputStream(fis);
        ){
            int sum = 0;
            while(true){
                int value= dis.read();

                System.out.println(value);
                sum += value;
            }
        }catch (EOFException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
try-with-resources 문의 괄호 () 객체를 생성하는 문장을 넣으면
따로*/
