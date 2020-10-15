import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("양의 정수를 입력하세요:");
            int num = scanner.nextInt();
            if (num == -1){break;}
            if (num%2 == 0){sum+= num;}
        }
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
    }
}
