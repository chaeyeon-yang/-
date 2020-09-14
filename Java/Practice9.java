
//a부터 z까지 출력하는 프로그램
public class Practice9 {
    public static void main(String[] args) {
        char c = 'a';

        do{
            System.out.print(c);
            c = (char)(c+1);
        } while(c <= 'z');
    }
}
