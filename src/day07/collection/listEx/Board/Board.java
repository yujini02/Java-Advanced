package day07.collection.listEx.Board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private String subject;
    private String writer;
    private String content;

    public Board(String subject, String writer, String content) {
        this.subject = subject;
        this.writer = writer;
        this.content = content;
    }

}
