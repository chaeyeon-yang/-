import java.util.*;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("속담을 입력하시오:");
        String str = scanner.nextLine();
        StringTokenizer ans = new StringTokenizer(str);
        int count = ans.countTokens();
        System.out.println("단어 개수: "+count);
        Vector<String> v = new Vector<String>();
        for (int i=0; i<count; i++){
            v.add(ans.nextToken());
        }
        Collections.sort(v);
        for (int i=0; i<count; i++){
            System.out.print(v.get(i));
            if (i==count-1) break;
            else System.out.print(", ");
        }
        scanner.close();


    }
}
