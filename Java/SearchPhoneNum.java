import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchPhoneNum {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try {
            Scanner fscanner = new Scanner(new FileReader("c:\\temp\\phone.txt"));
            while (fscanner.hasNext()) {
                String line = fscanner.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                String name = st.nextToken();
                String num = st.nextToken();
                map.put(name, num);
            }
            System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("이름>> ");
                String name = scanner.next();
                if (name.equals("그만")) break;
                if (map.containsKey(name)) {
                    System.out.println(map.get(name));
                } else System.out.println("찾는 이름이 없습니다");
            }
            fscanner.close();
        }catch (IOException e) {System.out.println("입출력 오류");}
    }
}
