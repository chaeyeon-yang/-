

// 그림 출력 프로그램 (2중중첩 사용, for문 활용)
public class Practice29 {
    public static void main(String[] args) {
        int i;
        for(i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
