import java.util.Scanner;

// break 문을 통해 무한루프 나오기
public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료합니다.");
        while(true){
            System.out.println(">>");
            String text = scanner.nextLine();
            if(text.equals("exit"))
                break;
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
