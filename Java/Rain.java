
//p/435 #4

import java.util.Scanner;
import java.util.Vector;

public class Rain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int sum = 0;
        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>>");
            int rain = scanner.nextInt();
            if (rain==0) break;
            v.add(rain);
            sum += rain;
            for (int i=0; i<v.size(); i++){
                System.out.println(v.get(i));
            }
            System.out.println("현재 평균 "+sum/v.size());
        }
    }
}
