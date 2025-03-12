package kiosk2;

public class MovieMenu {
    //속성
    private final String movieName;
    private final int moviePrice;
    private final String movieExplanation;
    //생성자
    public MovieMenu(String movieName, int moviePrice, String movieExplanation) {

        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.movieExplanation = movieExplanation;
    }

    @Override
    public String toString() {
        return "영화제목 :"+movieName+" , 금 액 : "+moviePrice+"원"+" 『"+movieExplanation+"』";
    }
        //게터
        public String getMovieName() {
            return this.movieName;
        }

        public int getMoviePrice() {
            return this. moviePrice;
        }

        public String getMovieExplanation() {
            return this.movieExplanation;
        }

}


