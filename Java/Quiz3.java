
//p.435 #3

import java.util.HashMap;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String country = scanner.next();
            if (country.equals("그만")) break;
            int people = scanner.nextInt();
            map.put(country, people);
        }
        while (true) {
            System.out.print("인구 검색 >> ");
            String country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            if (map.containsKey(country))
                System.out.println(country + "의 인구는 " + map.get(country));
            else System.out.println(country+" 나라는 없습니다.");
        }

 scanner.close();
    }


}