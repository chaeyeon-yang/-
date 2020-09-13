import java.util.Scanner;

// 입력받은 돈을 지폐, 동전 단위로 환산한 값을 출력
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int cash = sc.nextInt();
        int _50000 = cash/50000;
        int _10000 = (cash%50000)/10000;
        int _1000 = ((cash%50000)%10000)/1000;
        int _100 = (((cash%50000)%10000)%1000)/100;
        int _50 = ((((cash%50000)%10000)%1000)%100)/50;
        int _10 = (((((cash%50000)%10000)%1000)%100)%50)/10;
        int _1 = (((((cash%50000)%10000)%1000)%100)%50)%10;

        if(_50000 != 0)
            System.out.println("오만원권 "+_50000+"매");
        if(_10000 != 0)
            System.out.println("만원권 "+_10000+"매");
        if(_1000 != 0)
            System.out.println("천원권 "+_1000+"매");
        if(_100 != 0)
            System.out.println("백원 "+_100+"개");
        if(_50 != 0)
            System.out.println("오십원 "+_50+"개");
        if(_10 != 0)
            System.out.println("십원 "+_10+"개");
        if(_1 != 0)
            System.out.println("일원 "+_1+"개");
    }

}
