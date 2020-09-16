import java.util.Scanner;

// 점 (x,y)가 사각형안에 있는지 판별해주는 프로그램
public class Practice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if((x>= 100)&&(y>=100)&&(x<=200)&&(y<=200))
            System.out.println("("+x+","+y+")"+"는 사각형 안에 있습니다.");
        else
            System.out.println("("+x+","+y+")"+"는 사각형 안에 없습니다.");

    }
}
