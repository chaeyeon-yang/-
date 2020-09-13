import java.util.Scanner;

// 숫자의 자릿수 비교 프로그램
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99) >> ");
        int num = sc.nextInt();
        int index_0 = num/10;
        int index_1 = num%10;
        if(index_0 == index_1){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
    }
}
