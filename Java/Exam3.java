import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        int count = 0;
        Vector<Character> list = new Vector<>();
        Vector<String> doublelist = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("영어 문장을 입력하시오:");
        String text = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(text);

        while (st.hasMoreTokens()) {
            count++;
            String word = st.nextToken();
            if (v.contains(word)) doublelist.add(word);
            else v.add(word);

        }



            Collections.sort(v);
            System.out.println("분석 결과입니다>");
            System.out.println("단어 개수:" + count);
            System.out.println("단어 정렬");
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i));
            }
            System.out.println("두번 이상 등장한 단어:");
            for (int k = 0; k < doublelist.size(); k++) {
                System.out.print(doublelist.get(k) + ",");
            }
            System.out.println("가장 많이 등장한 알파벳:");
        }
    }

