package kiosk3;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}
//            switch (inputNumber) {
//                case 1:
//                    for (MovieMenu movieMenuView : movieMenus) {
//                        System.out.println(movieMenuView);
//                    }
//                    System.out.println("0.돌아가기");
//
//                    int getMovieSelect = Kiosk.checkScan(sc);
//                    switch (getMovieSelect) {
//                        case 1:
//                        case 2:
//                        case 3:
//                        case 4:
//                            System.out.println("선택한 영화 : " + movieMenus.get((getMovieSelect) - 1).getMovieName());//인덱스값조정
//                            return;
//                        case 0:
//                            System.out.println("이전으로 돌아갑니다.");
//                            continue;
//                        default:
//                            System.out.println("잘못입하셨습니다. 1~4 중 입력해주세요.");
//                            continue;

//                case 2:
//                    for (FoodMenu foodMenuView : foodMenuItems) {
//                        System.out.println(foodMenuView);
//                    }
//                    System.out.println("0.돌아가기");
//
//
//                    int getFoodSelect = sc.nextInt();
//
//                    switch (getFoodSelect) {
//                        case 1:
//                        case 2:
//                        case 3:
//                        case 4:
//                            System.out.println("선택한 메뉴 : " + foodMenuItems.get((getFoodSelect) - 1).getFoodName());//인덱스값조정
//
//                            break;
//                        case 0:
//                            System.out.println("이전으로 돌아갑니다.");
//                            continue;
//                        default:
//                            System.out.println("잘못입력하셨습니다. (1~4)중 입력하세요.");
//                            continue;
//                    }
//        case 0:
//        System.out.println("시스템을 종료합니다.");
//        sc.close();
//        System.exit(0);
//    }





