package Problem9;

import java.util.Scanner;

public class StackApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = scanner.nextInt();
        StringStack s = new StringStack(size);

        while (true) {
            System.out.print("문자열 입력 >> ");
            String word = scanner.next();
            if (word.equals("그만")) break;

            boolean res = s.push(word);
            if (res==false){
                System.out.println("스택이 꽉 차서 푸시 불가!");}
            }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int len = s.length();
        for (int i=0; i<len; i++){
            System.out.print(s.pop()+" ");
        }
        scanner.close();
    }
}
