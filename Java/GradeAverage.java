
//p.434 #2

import java.util.ArrayList;
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<6; i++){
            String grade = scanner.next();
            list.add(grade);
        }
        int sum = 0;
        for (int i=0; i<6; i++){
            if (list.get(i).equals("A")) sum+=4;
            else if (list.get(i).equals("B")) sum+=3;
            else if (list.get(i).equals("C")) sum+=2;
            else if (list.get(i).equals("D")) sum+=1;
        }
        System.out.println(sum/6.0);
    }
}
