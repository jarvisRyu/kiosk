package kiosk4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private final List<Menu> menus;

    //생성자
    public Kiosk(List<Menu> menus) { //메뉴 타입 리스트를  받도록
        this.menus = menus;
    }

    //시작화면
    public void start() {
        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {

            System.out.println("               😀『HELLO SPARTA CINEMA』🎞");
            showMenu();                                                            //영화메뉴출력
            System.out.print("카테고리를 선택하세요. :");

            int inputNumber = checkScan(sc);                                                        //영화 선택하기
            if (inputNumber < 1 || inputNumber > menus.size()) {
                System.out.println("🚫 해당 메뉴는 없습니다. 다시 입력해주세요.");
                continue ;
            }
            while (true) {
                Menu selectedMenu = menus.get(inputNumber - 1);   //리스트의 n번째 인덱스를 가져온다 > 받는값도 menu 참조
                selectedMenu.showMenuItems();

                System.out.println();
                System.out.print("영화 선택하세요: ");
                int movieChoice = checkScan(sc);
                if (movieChoice < 1 || movieChoice > selectedMenu.getMenuItems().size()) {
                    System.out.println("🚫 해당 메뉴는 없습니다. 다시 입력해주세요.");
                    continue;
                }
                System.out.printf("%d번 구매하시겠습니까?      (1.예)/(2.아니오)", movieChoice);     //구매하기
                while (true) {
                    int buyOrNot = checkScan(sc);
                    switch (buyOrNot) {
                        case 1:
                            System.out.printf("🎬 선택하신 영화: %s (%d원)\n",
                                    selectedMenu.getMenuItems().get(movieChoice-1).getMovieName(),
                                    selectedMenu.getMenuItems().get(movieChoice-1).getMoviePrice());
                            System.out.println("😀감사합니다.");
                            break loop;
                        case 2:
                            System.out.println("취소하였습니다. 이전으로 돌아갑니다.");
                            continue loop;
                        default:
                            System.out.println("잘못입력하셨습니다.");
                    }
                }
            }
        }
    }

    //입력값 체크
    public int checkScan(Scanner scanner) {
        while (true) {
            if (!(scanner.hasNextInt())) {
                System.out.println("🚫숫자를 입력해주세요.");
                scanner.next();    //숫자가아닐때
                continue;
            }
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("❌프로그램을 종료합니다. 감사합니다");
                System.exit(0);
            } else {
                return num;
            }
        }
    }

    //메뉴리스트 보여주기
    private void showMenu() {
        System.out.println("=======================================================================");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("                %d. %s\n", i + 1, menus.get(i).getMovieCategory());
        }
        System.out.println("=======================================================================");
        System.out.println("                                                          0. exit");
    }
}




