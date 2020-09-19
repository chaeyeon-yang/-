
// 그림 출력하는 프로그램 (2중 중첩 사용, do-while문 활용)
public class Practice31 {
    public static void main(String[] args) {
        int i = 5;
        do{
            int j=0;
            while(j++<i)
                System.out.print("*");
            System.out.println();
            i--;
        }
        while(i>0);
    }
}
