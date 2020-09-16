import java.util.Scanner;

// 점이 원 안에 있는지 판별하는 프로그램
public class Practice23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double radius = scanner.nextDouble();
        System.out.print("점 입력>>");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();

        if((x1 <= (x+radius) || x1 >= (x-radius))&&(y1 <= (y+radius) || x1 >= (y-radius)))
            System.out.println("점 ("+x1+", "+y1+")는 원 안에 있다.");
        else
            System.out.println("점 ("+x1+", "+y1+")는 원 안에 없다.");
    }
}
