import java.util.Scanner;

// 중복되지 않는 랜덤한 수들을 가지는 배열 출력하는 프로그램
public class Practice38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num = scanner.nextInt();
        int intarray[] = new int[num];
        int random = (int)(Math.random()*100 + 1);

        for (int i=0; i<intarray.length; i++){
            intarray[i] = random;
            random = (int)(Math.random()*100 + 1);

            for (int j=0; j<intarray.length; j++){
                if (intarray[j]==random)
                    intarray[j] = (int)(Math.random()*100+1);
            }
        }
        for (int i=0; i<intarray.length; i++)
            System.out.print(intarray[i]+ " ");
    }
}
