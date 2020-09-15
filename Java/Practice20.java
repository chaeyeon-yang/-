import java.util.Scanner;

// 369게임
public class Practice20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = scanner.nextInt();

        if(num%3==0){
            if((num/3)%3==0)
                System.out.println("박수짝짝");
        }
        else if(num%3==1 || num%3==2)
            System.out.println("박수짝");

        scanner.close();
    }

}
