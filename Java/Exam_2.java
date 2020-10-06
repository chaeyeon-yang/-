import java.util.Scanner;

public class Exam_2 {
    public static void main(String[] args) {

        int max1=0;
        int max2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이 프로그램은 주어진 정수 리스트에서 큰 정수 2개를 찾는 프로그램입니다.");
        System.out.println("한 줄에 하나씩 정수를 입력하고, 프로그램을 종료하고 싶으면 0을 입력하세요.");

        while(true) {
            System.out.println("Enter an integer: ");
            int num = scanner.nextInt();
            for (; num!=0; System.out.print("Enter an integer: "),num = scanner.nextInt()){
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else {
                    if (num > max2)
                        max2 = num;
                }
            }

            if (num == 0) break;

        }
        System.out.println("가장 큰 정수는 "+max1);
        System.out.println("두번째로 큰 정수는 "+max2);

    }

}
