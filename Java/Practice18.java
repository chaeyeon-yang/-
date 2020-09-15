import java.util.Scanner;

// 3개의 숫자 중 중간 크기의 수를 출력하기
public class Practice18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("정수 3개 입력>>");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1>num2)&&(num1>num3)){
            if(num2>num3)
                System.out.println("중간값은 "+num2);
            else
                System.out.println("중간값은 "+num3);
        }
        else if((num2>num1)&&(num2>num3)){
            if(num1>num3)
                System.out.println("중간값은 "+num1);
            else
                System.out.println("중간값은 "+num3);
        }
        else{
            if(num1>num2)
                System.out.println("중간값은 "+num1);
            else
                System.out.println("중간값은 "+num2);
        }
        scanner.close();
    }
}
