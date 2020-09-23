
import java.util.Scanner;

//정수 10개중 3의 배수만 출력해주는 프로그램
public class Practice35 {
    public static void main(String[] args) {
        int intarray[] = new int[10];
        int multiple[] = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i=0; i<10; i++){
            intarray[i] = scanner.nextInt();
            if(intarray[i]%3==0){
                multiple[i] += intarray[i];
            }
        }
        System.out.print("3의 배수는 ");
        for (int j=0; j<multiple.length; j++){
            if(multiple[j]==0)
                continue;
            else
                System.out.print(multiple[j] + " ");
        }
        scanner.close();
    }
}
