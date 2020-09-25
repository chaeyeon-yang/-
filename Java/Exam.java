import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");
        int max1 = 0, max2 = 0;
        int num = scanner.nextInt();


        for (; num !=0; num = scanner.nextInt()) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else {
                if (num > max2)
                    max2 = num;
            }
        }
        System.out.println("가장 큰 수 : "+max1+" 두번 째로 큰 수 : "+max2);
        scanner.close();
    }
}