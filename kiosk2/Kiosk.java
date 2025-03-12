package kiosk2;

import kiosk2.FoodMenu;
import kiosk2.MovieMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    Scanner sc = new Scanner(System.in);
    List<MovieMenu> movieMenus = new ArrayList<>();
    List<FoodMenu> foodMenuItems = new ArrayList<>();

    //생성자
    public Kiosk() {
        //영화
        movieMenus.add(new MovieMenu("《듄: 파트 2》", 15000, "외모도 SF 같은 티모시 살라메 주연의 스페이스 오페라 장르 영화"));
        movieMenus.add(new MovieMenu("《존 윅 4》", 14000, "죽을 위기에서 살아난 존 윅 최후의 반격을 준비하는데..."));
        movieMenus.add(new MovieMenu("《범죄도시 4》", 13000, "이번엔 어떤 악당을 물리칠까? 마동석 주연의 통쾌한 액션영화"));
        movieMenus.add(new MovieMenu("《300》", 12000, "명작은 결말을 알더라도 다시 찾게된다! 스파르타 개강기념 영화 300 재개봉"));
        //음식
        foodMenuItems.add(new FoodMenu("팝콘", 5000, "고소한 팝콘"));
        foodMenuItems.add(new FoodMenu("츄러스", 4000, "달콤한 시나몬 츄러스"));
        foodMenuItems.add(new FoodMenu("콜라", 2000, "시원한 콜라"));
        foodMenuItems.add(new FoodMenu("팝콘", 2000, "콜라 친구"));
    }

    //시작화면
    public void start() {
        while (true) {
            System.out.println("[ 🎥스파르타 시네마🎞️");
            System.out.println("1.🎫 Movie Tickets");
            System.out.println("2.🍿 Food & Beverage");
            System.out.println("0.Exit");
            System.out.println("메뉴를 선택하세요 : ");


            int inputNumber = Kiosk.checkScan(sc);//입력값 체크하기
            switch (inputNumber) {
                case 1: {
                    choiceMovie();

                }
                case 2: {
                    choiceFoodMenu();
                }
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }

    //입력값 체크
    public static int checkScan(Scanner scanner) {
        while (true) {
            if (!(scanner.hasNextInt())) {
                System.out.println("숫자를 입력해주세요.");
                scanner.next();    //숫자가아닐때
                continue;
            }
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("키오스크를 종료합니다..");
                System.exit(0);
            }
            return num;
        }
    }


    //입력값 체크2
    public static int checkScan2(Scanner scanner) {
        while (true) {
            if (!(scanner.hasNextInt())) {
                System.out.println("숫자를 입력해주세요.");
                scanner.next();    //숫자가아닐때
                continue;
            }
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("이전으로 돌아갑니다.");
                return -1;
            }
            return num;
        }
    }

    //메뉴리스트 보여주기
    private <T> void viewMenu(List<T> menu) {
        for (T seeMenu : menu) System.out.println(seeMenu);
        System.out.println("0.돌아가기");
    }

    //영화고르기
    private void choiceMovie() {
        viewMenu(movieMenus);
        System.out.println("영화를 선택해주세요.");
        int choiceMovie = checkScan2(sc);
        System.out.println("choiceMovie = " + choiceMovie);
        System.out.printf("선택하신 영화 :" +
                movieMenus.get(choiceMovie).getMovieName() +
                " 금액 :\n" + movieMenus.get(choiceMovie).getMoviePrice());
    }
    //음식고르기
    private void choiceFoodMenu() {
        viewMenu(foodMenuItems);
        System.out.println("메뉴를 선택해주세요.");
        int choiceFoodMenu = checkScan2(sc);
        System.out.println("choiceMovie = " + choiceFoodMenu);
        System.out.printf("선택하신 영화 :" +
                foodMenuItems.get(choiceFoodMenu).getFoodName() +
                " 금액 :\n" + foodMenuItems.get(choiceFoodMenu).getFoodPrice());
    }



    //구매여부 묻기
    public static int buyItOrNot(int value) {
        while (true) {
            System.out.println("구매하시겠습니까? 예(1) / 아니오(2)");
            value = checkScan(new Scanner(System.in));
            if (value == 1) {
                System.out.println(value + "를 구매하셨습니다.");
                System.out.println("금액은");
                break;
            }
            if (value == 2) {
                System.out.println("구매 취소하였습니다. 이전메뉴로 돌아갑니다.");
                return value = 0;

            } else {
                System.out.println("1 또는 2 중 고르세요");
                continue;
            }

        }
        return value;
    }
}
