
// 그림 출력 프로그램(2중 중첩 사용, while문 활용)
public class Practice30 {
    public static void main(String[] args) {
        int i = 5;
        while(i>0){
            for (int j=0; j<i; j++)
                System.out.print("*");
            i--;
            System.out.println();
        }
    }
}
