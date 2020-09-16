import java.util.Scanner;

// 입력받은 직사각형이 주어진 직사각형과 충돌하는지 판별하는 프로그램
public class Practice22 {
    public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("직사각형을 구성하는 한 점을 입력하세요.");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("직사각형을 구성하는 다른 한 점을 입력하세요.");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean check1 = inRect(x1, y1, 100, 200, 100, 200);
        boolean check2 = inRect(x2, y2, 100, 200, 100, 200);

        if (check1&&check2)
            System.out.println("주어진 직사각형과 충돌하지 않습니다.");
        else
            System.out.println("주어진 직사각형과 충돌합니다.");
    }
}
