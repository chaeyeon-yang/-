import java.util.Scanner;

// 환전 프로그램
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요.(단위: 원) >> ");
        int won = sc.nextInt();
        double dollar = won/ 1100.0;
        System.out.println(won+"원은 $"+dollar+"입니다.");

    }
}
