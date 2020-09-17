
import java.util.Scanner;

//입력받은 달의 계절을 알려주는 프로그램 (if-else문을 이용하여 코드를 짠 경우)
public class Practice26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>>");
        int month = scanner.nextInt();
        if(month == 1 || month == 2 || month == 12)
            System.out.println("겨울");
        else if(month == 3 || month == 4 || month == 5)
            System.out.println("봄");
        else if(month == 6 || month == 7 || month == 8)
            System.out.println("여름");
        else if(month == 9|| month == 10 || month == 11)
            System.out.println("가을");
        else
            System.out.println("잘못입력");
    }
}
