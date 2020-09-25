
// 369게임에서 박수치는 경우를 출력하는 프로그램
public class Quiz2 {
    public static void main(String[] args) {
        for (int i=1; i<100; i++){
            if (i%10 == 3|| i%10 == 6||i%10 == 9){
                if (i/10 == 3|| i/10 == 6||i/10 == 9){
                    System.out.println(i+" 박수 짝짝");
                }
                else
                    System.out.println(i+" 박수 짝");
            }
            else if ((i/10) == 3|| (i/10) == 6 || (i/10)==9)
                System.out.println(i+" 박수 짝");

        }
    }
}
