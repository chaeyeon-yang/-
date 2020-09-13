import java.util.Scanner;

// 가위바위보 게임 (p. 106)
public class SimpleGame {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        Scanner sc = new Scanner(System.in);
        System.out.print("철수 >> ");
        String answer1 = sc.next();
        System.out.print("영희 >> ");
        String answer2 = sc.next();

        if (answer1.equals("가위")){
            if(answer2.equals("가위")){
                System.out.println("비겼습니다.");
            }
            else if(answer2.equals("바위")){
                System.out.println("영희가 이겼습니다.");
            }
            else {
                System.out.println("철수가 이겼습니다.");
            }
        }
        else if(answer1.equals("바위")){
            if(answer2.equals("가위")){
                System.out.println("철수가 이겼습니다.");
            }
            else if(answer2.equals("바위")){
                System.out.println("비겼습니다.");
            }
            else{
                System.out.println("영희가 이겼습니다.");
            }
        }
        else{
            if(answer2.equals("가위")){
                System.out.println("영희가 이겼습니다.");
            }
            else if(answer2.equals("바위")){
                System.out.println("철수가 이겼습니다.");
            }
            else{
                System.out.println("비겼습니다.");
            }
        }
    }
}
