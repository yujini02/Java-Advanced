package day07.collection.listEx.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //글을 보관 운영하는 ArrayList 생성
        List<Board> boardList = new ArrayList<Board>();

        //객체(Board) 추가
        boardList.add(new Board("제목1", "ssg1", "아 오늘 너무 힘드네...진도가 너무 빠른거 아님?"));
        boardList.add(new Board("제목2", "ssg2", "아 오늘 너무 힘드네...진도가 너무 빠른거 아님?"));
        boardList.add(new Board("제목3", "ssg3", "아 오늘 너무 힘드네...진도가 너무 빠른거 아님?"));

        //저장된 글 목록 수
        int size = boardList.size();
        System.out.println("총 글의 수 :" + size);

        //특정 인덱스의 객체 가져오기
        Board board = boardList.get(1);
        System.out.printf("주제 : %s  내용 : %s  작성자 : %s",board.getSubject(),board.getContent(),board.getWriter());

        //글목록
//        for(Board board : boardList){
//            System.out.printf("주제 : %s  내용 : %s  작성자 : %s%n",board.getSubject(),board.getContent(),board.getWriter());
//        }

        //글 삭제
        boardList.remove(1);
//        for (Board board : boardList) {
//           System.out.printf("주제 : %s  내용 : %s  작성자 : %s%n",board.getSubject(),board.getContent(),board.getWriter());
//        }
        for (int b = 0; b < boardList.size(); b++) {

            System.out.printf(" %d",b);
        }
        System.out.println("=====================================");
        boardList.remove(1);
        for (int b = 0; b < boardList.size(); b++) {

            System.out.printf(" %d",b);
        }
    }

}