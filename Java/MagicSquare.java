
import java.util.Scanner;

public class MagicSquare {
    static int sum1=0;
    static int sum2=0;
    static int sum3=0;
    static int sum4=0;
    static int sum5=0;
    static int sum6=0;
    static boolean check1 = false;
    static boolean check2 =false;
    static boolean check3 = false;
    static boolean check4=false;
    static  boolean check5=false;
    static boolean check6=false;
    static boolean check7=false;
    static boolean check8=false;
    static  boolean answer = false;
    static boolean check(int a[][]){
         for (int i=0; i<a.length; i++){
             sum1 += a[0][i];
         }
         if (sum1 == 15) {check1 = true;
         }
         for (int i=0; i<a.length; i++) sum2+=a[1][i];
         if (sum2 == 15) {check2 = true;
         }
         for (int i=0; i<a.length; i++) sum3+=a[2][i];
         if (sum3 == 15) {check3 = true;
         }

         for (int i=0; i<a.length; i++) {sum4+=a[i][0];}
         if (sum4 == 15) {check4 = true;}

         for (int i=0; i<a.length; i++) {sum5+=a[i][1];}
         if (sum5 == 15) {check5 = true;}

         for (int i=0; i<a.length; i++) {sum6+=a[i][2];}
         if (sum6 == 15) {check6 = true;}

         if (a[0][2]+a[1][1]+a[2][0] == 15){check7 = true; }
         if (a[0][0] + a[1][1] +a[2][2] == 15) {check8 = true; }
         if (check1&&check2&&check3&&check4&&check5&&check6&&check7&&check8){answer = true;}
         return answer;
         }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[3][3];
        System.out.print("행렬에 넣을 숫자를 입력하세요.(9개의 정수)");
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }

        if (MagicSquare.check(array))System.out.println("마방진입니다.");
        else System.out.println("마방진이 아닙니다.");
    }
}
