import java.util.Scanner;

// 삼각형을 만들 수 있는지 판별하는 프로그램
public class Practice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1>num2)&&(num1>num3)){
            if(num1<num2+num3)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("삼각형이 안됩니다");
        }
        else if((num2>num1)&&(num2>num3)){
            if(num2<num1+num3)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("삼각형이 안됩니다");
        }
        else{
            if(num3<num1+num2)
                System.out.println("삼각형이 됩니다");
            else
                System.out.println("삼각형이 안됩니다");
        }
        scanner.close();
    }
}