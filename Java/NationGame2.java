
//p.440 #11-2

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


class Game2{
    Scanner scanner = new Scanner(System.in);
    HashMap<String,String> nations = new HashMap<>();
    public Game2(){
        nations.put("한국","서울");
        nations.put("멕시코","멕시코시티");
        nations.put("스페인","리스본");
        nations.put("프랑스","파리");
        nations.put("중국","베이징");
        nations.put("러시아","모스크바");
        nations.put("그리스","아테네");
    }



    void insert() {
        int count = nations.size();
        System.out.println("현재 "+count+"개 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력" + (count + 1) + ">>");
            String country = scanner.next();
            if (country.equals("그만")) break;
            String capital = scanner.next();
            if (nations.containsKey(country)){
                System.out.println(country+"는 이미 있습니다!");
            }
            else{
                nations.put(country,capital);
                count++;
            }

        }
    }
    void quiz(){
        Set<String> keys = nations.keySet();
        Object[] arr = (keys.toArray());
        while(true){
            int random = (int)(Math.random()*(nations.size()));
            String country = (String)arr[random];
            String capital = nations.get(country);
            System.out.print(country+"의 수도는?");
            String ans = scanner.next();
            if (ans.equals("그만")) break;
            if (capital.equals(ans)) System.out.println("정답!!");
            else System.out.println("아닙니다!!");
        }
    }
    void finish(){
        System.out.println("게임을 종료합니다.");
    }



    void run(){
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3>>");
            int ans = scanner.nextInt();
            switch (ans){
                case 1:
                    insert();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    finish();
                    return;
            }
        }
    }

}

public class NationGame2 {
    public static void main(String[] args) {
        Game2 game2 = new Game2();
        game2.run();
    }
}
