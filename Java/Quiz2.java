import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수:" );
        for (int i=0; i<6; i++){
            arr.add(scanner.nextInt());
        }

        int max = 0;
        for (int i=0; i<arr.size(); i++){
            if (arr.get(i)>max) max = arr.get(i);
        }
        System.out.println("가장 큰 수는 "+max);
    }
}
