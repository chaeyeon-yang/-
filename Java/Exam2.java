import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        String array[] = new String[10];
        int num[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        for(int i=0; i<10; i++){
            num[i] = scanner.nextInt();
        }
        for (int i=0; i<10; i++){
            array[i] = ((10*i)+"~"+((10*(i+1))-1))+":";
        }
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if ((10*i)<=num[j] && num[j]<=((10*(i+1))-1)){
                    array[i] += "*";
                }
            }
        }

        for (int i=0; i<10; i++) {
            System.out.println(array[i]);
        }

    }
}
