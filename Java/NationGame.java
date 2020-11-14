//p.439 ##11-1

import java.util.Scanner;
import java.util.Vector;

class Nation{
    private String country;
    private String capital;
    public Nation(String country, String capital){
        this.country = country; this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public boolean equals(String capital){
        if (capital.equals(getCapital())) return true;
        else return false;
    }
}


class Game{
    Scanner scanner = new Scanner(System.in);
    Vector<Nation> nations = new Vector<>(9);
    public Game(){
        nations.add(new Nation("한국","서울"));
        nations.add(new Nation("미국","뉴저지"));
        nations.add(new Nation("베트남","하노이"));
        nations.add(new Nation("멕시코","멕시코시티"));
        nations.add(new Nation("스페인","리스본"));
        nations.add(new Nation("프랑스","파리"));
        nations.add(new Nation("중국","베이징"));
        nations.add(new Nation("러시아","모스크바"));
    }

    public void insert(){
        int count = nations.size()+1;
        System.out.println("현재 "+nations.size()+"개의 나라와 수도가 입력되어 있습니다.");
        while (true){
            System.out.print("나라와 수도 입력"+count+">> ");
            String country = scanner.next();
            if (country.equals("그만")) break;
            String capital = scanner.next();

            for (int i=0; i<nations.size(); i++) {
                if (nations.get(i).getCountry().equals(country)) {
                    System.out.println(country + "는 이미 있습니다!");
                    count--;
                }
            }
            nations.add(new Nation(country, capital));
            count++;
        }
    }

    public void quiz() {
        while (true) {
            int random = (int) (Math.random() * (nations.size()));
            String randomCountry = nations.get(random).getCountry();
            System.out.print(randomCountry + "의 수도는? ");
            String capital = scanner.next();
            if (capital.equals("그만")) break;
            else if (nations.get(random).equals(capital))
                System.out.println("정답!!");
            else System.out.println("아닙니다!!");
        }
    }

    public void finish(){
        System.out.println("게임을 종료합니다.");
    }


}



public class NationGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    game.insert();
                    break;
                case 2:
                    game.quiz();
                    break;
                case 3: {
                    game.finish();
                    return;
                }
            }
        }
    }

}
