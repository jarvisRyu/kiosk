package kiosk5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private final List<Menu> menus;
    private final List<Cart> carts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //생성자
    public Kiosk(List<Menu> menus) { //메뉴 타입 리스트를  받도록
        this.menus = menus;
    }

    //시작화면
    public void start() {
        loop:
        while (true) {

            System.out.println("               😀『HELLO SPARTA CINEMA』🎞");
            showMenu();                                                    //카테고리출력
            System.out.print("카테고리를 선택하세요. :");

            int inputNumber = checkScan(sc);
            if (inputNumber == 0) {
                System.out.println("💤프로그램을 종료합니다. 감사합니다.");
                sc.close();
                break;

            }
            if (inputNumber == 99) {
                showCart(); // 장바구니 조회
                continue;
            }
            if (inputNumber < 1 || inputNumber > menus.size()) {
                System.out.println("🚫 해당 메뉴는 없습니다. 다시 입력해주세요.");
                continue;
            }

            while (true) {
                Menu selectedMenu = menus.get(inputNumber - 1);   //리스트의 n번째 인덱스를 가져온다 > 받는값도 menu 참조
                selectedMenu.showMenuItems();   //영화리스트 보여주기
                System.out.print("영화 선택하세요: ");

                int movieChoice = checkScan(sc);    //영화선택 입력값확인
                if (movieChoice == 0) {
                    System.out.println("이전 단계로 돌아갑니다.");
                    break;

                } else if (movieChoice < 1 || movieChoice > selectedMenu.getMenuItems().size()) {
                    System.out.println("🚫 해당 메뉴는 없습니다. 다시 입력해주세요.");
                    continue;
                }

                MovieMenuItem selectedMovie = selectedMenu.getMenuItems().get(movieChoice - 1);

                System.out.printf("%d번 %s 장바구니에 담으시겠습니까?      (1.예)/(2.아니오)", movieChoice, selectedMovie.getMovieName());     //구매하기
                int buyOrNot = checkScan(sc);
                if (buyOrNot == 1) {
                    addToCart(selectedMovie);

                } else {
                    System.out.println("❌ 취소하였습니다.");
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
            return scanner.nextInt();
        }
    }


    //메뉴리스트 보여주기
    private void showMenu() {
        System.out.println("=======================================================================");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("                %d. %s\n", i + 1, menus.get(i).getMovieCategory());
        }
        System.out.println("=======================================================================");
        System.out.println("99.장바구니조회                                                   0. exit");
    }

    //장바구니 추가
    private void addToCart(MovieMenuItem movie) {
        for (Cart cart : carts) {
            if (cart.getName().equals(movie.getMovieName())) {
                cart.addQuantity();
                System.out.printf("🎬 %s 1개 추가! 현재 수량: %d개\n", cart.getName(), cart.getQuantity());
                return;
            }
        }
        carts.add(new Cart(movie.getMovieName(), movie.getMoviePrice(), 1));
        System.out.printf("🎬 %s 장바구니에 추가되었습니다. (%d원)\n", movie.getMovieName(), movie.getMoviePrice());
    }

    //장바구니 비면
    public void showCart() {
        if (carts.isEmpty()) {
            System.out.println("🛒 장바구니가 비어 있습니다.");
            return;
        }

        int total = 0;
        System.out.println("\n===== 🛒 장바구니 목록 =====");
        System.out.println("영화 제목  | 수량 | 금액");
        for (Cart cart : carts) {
            int itemTotal = cart.getPrice() * cart.getQuantity();
            total += itemTotal;
            System.out.printf("%-10s | %2d  | %d원\n", cart.getName(), cart.getQuantity(), itemTotal);
        }
        System.out.println("=========================");
        System.out.printf("💰 최종 결제 금액: %d원\n", total);
        payment();
    }

    // 결제 기능
    public void payment() {
        System.out.println("💳 결제하시겠습니까? (1.예) / (2.아니오)");
        int value = checkScan(sc);
        if (value == 1) {
            System.out.println("🎉 결제가 완료되었습니다!");
            carts.clear();
            System.out.println("✅ 장바구니가 초기화되었습니다.");
        } else {
            System.out.println("❌ 결제가 취소되었습니다.");
        }
    }
}


