
// 1부터 100까지 3의 배수의 합을 구하는 프로그램
public class Practice32 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=100; i++){
            if(i%3 == 0)
                sum += i;
        }
        System.out.println("1부터 100까지 중 3의 배수의 합은 "+sum);
    }
}
