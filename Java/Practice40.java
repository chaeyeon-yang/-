import java.util.Scanner;

// 과목이름을 입력받고 점수를 출력하는 프로그램
public class Practice40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};
        String check = "없음";

        while (true) {
            System.out.print("과목 이름>>");
            String name = scanner.next();
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    System.out.println(name + "의 점수는 " + score[i]);
                    check = "있음";
                    break;
                }

            }
            if (check.equals("없음"))
                System.out.println("없는 과목입니다.");
        if (name.equals("그만"))
            break;

    }
        scanner.close();
            }
        }


