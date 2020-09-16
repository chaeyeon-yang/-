import java.util.Scanner;

// 두 원이 겹치는지 판별해주는 프로그램
public class Practice24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        if (((x2<(x1+radius1))||(x2>(x1-radius1)))&&((y2<(y1+radius1))||y2>(y1-radius1)))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 겹치지 않는다.");
    }
}
