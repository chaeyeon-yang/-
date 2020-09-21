
//100 미만의 짝수를 모두 더해주는 프로그램
public class WhileTest {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while(i<100){
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
