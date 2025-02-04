package day02.exception.ex01;

public class Exception02 {

    public static void main(String[] args) {
        String[] stringarray = {"100","1oo", null};
        for(int i = 0; i<stringarray.length+1;i++){
            try {
                int value = Integer.parseInt(stringarray[i]);
//            } catch(Exception e){
//                e.getMessage();
//            }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
                throw new RuntimeException(e);
            }catch (NullPointerException | NumberFormatException e1){
                System.out.println("실행에 문제가 있습니다." + e1.getMessage());
            }

        }
    }
}
