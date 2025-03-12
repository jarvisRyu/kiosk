package kiosk3.kioskMenu;

public class MovieMenu extends Menu {
    private final String movieExplanation;

    public MovieMenu(String movieName, int moviePrice, String movieExplanation) {
       super(movieName,moviePrice);
       this.movieExplanation=movieExplanation;
    }

    //생성자

    @Override
    public String toString() {
        return String.format("제목: %-10s | 금액:%6d원 | %s", super.getName(), super.getPrice(), movieExplanation);
    }

}
