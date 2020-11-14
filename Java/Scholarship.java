import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<String, Double>();
        System.out.println("미래장학금관리시스템입니다.");
        for (int i=0; i<5; i++){
            System.out.print("이름과 학점>> ");
            String name = sc.next();
            double grade = sc.nextDouble();

            map.put(name, grade);
        }
        System.out.print("장학금 선발 학점 기준 입력>> ");
        double standard = sc.nextDouble();

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        double highscore = 0.0;
        String scholarship_stu = null;
        while (it.hasNext()){
            String name = it.next();
            if (map.get(name) >= standard && map.get(name)> highscore){
                highscore = map.get(name);
                scholarship_stu = name;
            }
        }
        System.out.print("장학생 명단 : "+scholarship_stu+" 상당히 고득점");
        sc.close();
    }
}
