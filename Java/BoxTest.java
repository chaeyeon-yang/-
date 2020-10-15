import java.util.Scanner;

public class BoxTest extends Box{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 박스의 가로, 세로, 높이를 입력하세요.");
        int width1 = scanner.nextInt();
        int length1 = scanner.nextInt();
        int height1 = scanner.nextInt();

        Box box1 = new Box(width1, length1, height1);
        System.out.print("두번째 박스의 가로, 세로, 높이를 입력하세요.");
        int width2 = scanner.nextInt();
        int length2 = scanner.nextInt();
        int height2 = scanner.nextInt();

        Box box2 = new Box(width2,length2,height2);
        System.out.print("세번째 박스의 가로, 세로, 높이를 입력하세요.");
        int width3 = scanner.nextInt();
        int length3 = scanner.nextInt();
        int height3 = scanner.nextInt();
        Box box3 = new Box(width3,length3,height3);
        System.out.println("총 "+getBoxes()+"개의 박스가 생성되었습니다.");
        System.out.println("첫번째 박스의 부피는 "+box1.getVolume());
        System.out.println("두번째 박스의 부피는 "+box2.getVolume());
        System.out.println("세번째 박스의 부피는 "+box3.getVolume());
    }
}

