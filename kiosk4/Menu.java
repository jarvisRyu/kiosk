package kiosk4;

import java.util.List;

public class Menu {
    //속성
    private final String movieCategory;
    private final List<MovieMenuItem> menuItems;


    //생성자
    public Menu(String movieCategory, List<MovieMenuItem> menuItems) {
        this.movieCategory = movieCategory;
        this.menuItems = menuItems;
    }

    //기능
    //게터
    public String getMovieCategory() {
        return movieCategory;
    }

    public List<MovieMenuItem> getMenuItems() {
        return menuItems;
    }



    public void showMenuItems() {
        System.out.println("============================ " + movieCategory + " 메뉴 ============================");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print((i + 1) + ". " + menuItems.get(i));
        }
        System.out.println("=====================================================[돌아가기 =0번]======");
    }

}





