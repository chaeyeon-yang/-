
// 100미만의 짝수들을 모두 더해주는 프로그램
public class ForTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<100; i += 2)
            sum += i;
        System.out.println(sum);
    }
}
