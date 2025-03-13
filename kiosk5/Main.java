package kiosk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MovieMenuItem>actionSf = new ArrayList<>(Arrays.asList(  //movie menu 의 생성자 ( 제목,금액,설명)
                new MovieMenuItem("《인터스텔라》", 12000, "우주. 그 끝엔 사랑"),
                new MovieMenuItem("《인셉션》", 11000, "꿈에서 꾸는 꿈에서 꿈꾸는 꿈"),
                new MovieMenuItem("《테넷》", 11000, "?면다른흐 로꾸거 이간시"),
                new MovieMenuItem("《탑건: 매버릭》", 13000, "날으는 톰크루즈"),
                new MovieMenuItem("《존 윅 4》", 14000, "남자의 차와 개를 건드리면 복수극이 4편이나 나온다."),
                new MovieMenuItem("《어벤져스: 엔드게임》", 15000, "어벤져스 어셈블"),
                new MovieMenuItem("《아이언맨》", 10000, "아임 아이언맨"),
                new MovieMenuItem("《듄 : 파트 2》", 15000, "퀴사츠 테더락")));

        List<MovieMenuItem>horrorThriller = new ArrayList<>(Arrays.asList(
                new MovieMenuItem("《컨저링》", 11000, "실화 바탕의 공포 이야기, 저주받은 집의 비밀"),
                new MovieMenuItem("《그것 (IT)》", 11000, "이것 저것 그리고"),
                new MovieMenuItem("《유전》", 12000, "oilfield 아님 inheritance 임 "),
                new MovieMenuItem("《겟 아웃》", 10000, "인종차별을 주제로 한 심리 스릴러 공포"),
                new MovieMenuItem("《샤이닝》", 10000, "히얼스 쟈니"),
                new MovieMenuItem("《부산행》", 10000, "코리안 좀비 vs 공유"),
                new MovieMenuItem("《노인을 위한 나라는 없다》", 10000, "굳이 이럴 필욘 없잖아요.")));

        List<MovieMenuItem>dramaRomance = new ArrayList<>(Arrays.asList(
                new MovieMenuItem("《라라랜드》", 13000, "City of Stars"),
                new MovieMenuItem("《타이타닉》", 11000, "You're here there's nothing i fear~"),
                new MovieMenuItem("《포레스트 검프》", 10000, "인생은 초콜릿 상자 같아서 무엇을 얻게 될지 알 수 없다"),
                new MovieMenuItem("《쇼생크 탈출》", 12000, "이거 보고 따라하시면 안됩니다."),
                new MovieMenuItem("《슬럼독 밀리어네어》", 11000, "퀴즈쇼를 통해 밝혀지는 한 소년의 기적 같은 삶"),
                new MovieMenuItem("《위대한 개츠비》", 11000, "화려한 시대 속에서 꿈을 좇는 한 남자의 이야기")));

        List<MovieMenuItem>koreaMovieMenuItem = new ArrayList<>(Arrays.asList(
                new MovieMenuItem("《기생충》", 11000, "빈부 격차를 그린 블랙코미디, 봉준호 감독의 걸작"),
                new MovieMenuItem("《범죄도시 4》", 13000, "이번엔 어떤 악당을 물리칠까? 마동석 주연의 통쾌한 액션영화"),
                new MovieMenuItem("《명량》", 11000, "神 에게는 아직 12척의 배가 남아있사옵니다."),
                new MovieMenuItem("《한산: 용의 출현》", 12000, "필즉사 필즉생"),
                new MovieMenuItem("《1987》", 12000, "현대사의 분수령이 된 1987년의 사건들을 담은 영화")));



        List<Menu> menus = new ArrayList<>(Arrays.asList(   //menu 클래스의 생성자 (장르,리스트)
                new Menu("액션/SF", actionSf),
                new Menu("공포/스릴러", horrorThriller),
                new Menu("드라마/로맨스", dramaRomance),
                new Menu("한국 영화", koreaMovieMenuItem)

        ));

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();


    }
}




