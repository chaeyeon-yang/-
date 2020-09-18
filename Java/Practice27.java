import java.util.Scanner;

// 사칙연산을 입력받아 계산해주는 프로그램 (switch문 사용)
public class Practice27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        try {
            switch (operator) {
                case "+":
                    System.out.println(num1 + operator + num2 + "의 계산 결과는 " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + operator + num2 + "의 계산 결과는 " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + operator + num2 + "의 계산 결과는 " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + operator + num2 + "의 계산 결과는 " + (num1 / num2));
                    break;

            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
