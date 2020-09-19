import java.util.Random;
import java.util.Scanner;

// 숨겨진 카드의 수를 맞추는 게임
public class UpdownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100);

        while(true){
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println("0~99");

            for (int i=1; ; i++){
                System.out.print(i+">>");
                int num = scanner.nextInt();

                if(answer<num){
                    System.out.println("더 낮게");
                    continue;
                }
                else if (answer>num){
                    System.out.println("더 높게");
                    continue;
                }
                else{
                    System.out.println("맞았습니다");
                    System.out.print("다시 하시겠습니까?(y/n)>>");
                    String operation = scanner.next();
                    if (operation.equals("y")){
                        answer = random.nextInt(100);
                        break;
                    }
                    else{
                        System.exit(0);
                    }


                }
            }

            }
        }


    }

