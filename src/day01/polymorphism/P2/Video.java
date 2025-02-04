package day01.polymorphism.P2;

public class Video extends Content{
    private String genre;

    public Video(String title,String genre) {
        super(title);
        this.genre = genre;
    }

    @Override
    public void totalPrice() {
        if (genre.equals("new")) super.setPrice(2000);
        else if (genre.equals("comic")) super.setPrice(1500);
        else if (genre.equals("child")) super.setPrice(1000);
        else super.setPrice(500);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
