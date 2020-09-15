
// 반복문을 사용하여 1부터 10까지의 합 구하기
public class Practice6 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i <=10; i++){
            sum += i;
            System.out.print(i);

            if(i<=9){
                System.out.print("+");
            }
            else{
                System.out.print("="+sum);
            }
        }
    }
}
