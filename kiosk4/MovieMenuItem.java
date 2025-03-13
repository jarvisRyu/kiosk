package kiosk4;

public class MovieMenuItem {
    //속성
    private final String movieName;
    private final int moviePrice;
    private final String movieExplanation;

    //생성자
    public MovieMenuItem(String movieName, int moviePrice, String movieExplanation) {
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.movieExplanation = movieExplanation;
    }

    //게터
    public String getMovieName() {
        return movieName;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    //세터

    @Override
    public String toString() {
        return String.format("제목: %-10s | 금액:%6d원 | %s\n", movieName, moviePrice, movieExplanation);
    }
}

