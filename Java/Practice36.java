import java.util.Scanner;

// 돈의 액수를 입력받아 각 지폐와 동전 몇개로 변환되는지 알려주는 프로그램
public class Practice36 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for (int i=0; i<unit.length; i++){
            if (money/unit[i]!=0){
                System.out.println(unit[i]+"원 짜리 : "+money/unit[i]+"개");
                money -= (unit[i])*(money/unit[i]);
            }
            else{
                continue;
            }



        }
    }
}
