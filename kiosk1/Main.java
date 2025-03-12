package kiosk1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieNumber = "";  //영화 선택
        String foodMenuNumber;    //음식 선택
        String movieName = "";   //영화 제목
        int moviePrice = 0;    //영화 금액
        String foodName = "";  //음식 이름
        int foodPrice = 0;     //음식 금액

        while (true) {
            System.out.println("[ 🎥스파르타 시네마🎞️ ]\n" +
                    "1.🎫 Movie Tickets  ️\n" +
                    "2.🍿 Food & Beverage \n" +
                    "0.Exit");  //시간이 지나면 알아서 종료되는게 좋겠음  ScheduledExecutorService 사용하기

            String inputNumber = scanner.next(); //메인 입력값

            switch (inputNumber) {
                case "1":
                    System.out.println("원하시는 영화를 선택해주세요. (1~4) ");
                    System.out.println("1. 《듄: 파트 2》 | 15,000원 | 외모도 SF 같은 티모시 살라메 주연의 스페이스 오페라 장르 영화");
                    System.out.println("2. 《존 윅 4》    | 14,000원 | 죽을 위기에서 살아난 존 윅 최후의 반격을 준비하는데...");
                    System.out.println("3. 《범죄도시 4》 | 13,000원 | 이번엔 어떤 악당을 물리칠까? 마동석 주연의 통쾌한 액션영화");
                    System.out.println("4. 《300》       | 12,000원 | 명작은 결말을 알더라도 다시 찾게된다! 스파르타 개강기념 영화 300 재개봉");
                    System.out.println("0. [ 돌아가기 ]");

                    movieNumber = scanner.next();

                    switch (movieNumber) {
                        case "1":
                            movieName = "<<듄 파트2>>";
                            moviePrice = 15000;
                            break;
                        case "2":
                            movieName = "<<존 윅4>>";
                            moviePrice = 14000;
                            break;
                        case "3":
                            movieName = "<<범죄도시4>>";
                            moviePrice = 13000;
                            break;
                        case "4":
                            movieName = "<<300>>";
                            moviePrice = 12000;
                            break;
                        case "0":
                            System.out.println("이전으로 돌아갑니다.");
                            continue;
                        default:
                            System.out.println("잘못입하셨습니다. 1~4 중 입력해주세요.");
                            continue;
                    }

                    System.out.println("먹거리도 구매하시겠습니까? 예 (1) / 아니오 (2)");
                    String yesOrNo = scanner.next();
                    if (yesOrNo.equals("1")) {
                        inputNumber = "2";
                    } else {
                        System.out.printf("🎞️영화: %s   💲금액 :  %d\n", movieName, moviePrice);
                        return;
                    }

                case "2":
                    System.out.println("원하시는 메뉴를 선택해 주세요. (1~4) ");
                    System.out.println("1. 팝콘 | 5,000원 |고소한 팝콘");
                    System.out.println("2. 츄러스 | 4,000원 | 달콤한 시나몬 츄러스");
                    System.out.println("3. 콜라  | 2,000원 | 시원한 콜라");
                    System.out.println("4. 사이다 | 2,000원 | 콜라친구");
                    System.out.println("0. [ 돌아가기 ]");
                    while (true) {
                        foodMenuNumber = scanner.next();

                        switch (foodMenuNumber) {
                            case "1":
                                foodName = "팝콘🍿";
                                foodPrice = 5000;
                                break;
                            case "2":
                                foodName = "츄러스";
                                foodPrice = 4000;
                                break;
                            case "3":
                                foodName = "콜라";
                                foodPrice = 2000;
                                break;
                            case "4":
                                foodName = "사이다";
                                foodPrice = 2000;
                                break;
                            case "0":
                                System.out.println("이전으로 돌아갑니다.");
                                break;
                            default:
                                System.out.println("잘못입력하셨습니다. (1~4)중 입력하세요.");
                                continue;
                        }
                        System.out.printf("🍿선택한 메뉴 : %s  💲금액 : %d\n", foodName, foodPrice);
                        System.out.printf("🎞️영화: %s   💲금액 :  %d\n", movieName, moviePrice);
                        System.out.printf("🧾 총 결제 금액: %,d원\n", moviePrice + foodPrice);
                        return;
                    }
                case "0":
                    System.out.println("종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못입력하셨습니다. 1~2 중 입력해주세요.");
            }
        }
    }
}