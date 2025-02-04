package day01.polymorphism.P2;

public class VideoShop {
    public static void main(String[] args) {
        Content[] content = new Content[3];
        content[0] = new Video("이클립스","new");
        content[1] = new Video("체포왕","comic");
        content[2] = new Video("뽀롱뽀롱뽀로로2","child");
        for (int i = 0; i < content.length; i++) {
            content[i].totalPrice();
            content[i].show();
        }

        //for each
        for(Content content1 : content){
            content1.totalPrice();
            content1.show();
        }

    }
}
