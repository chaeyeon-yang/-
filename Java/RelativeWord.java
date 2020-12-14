import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class RelativeWord {
    public static void main(String[] args) {
        System.out.println("Temp 폴더 밑의 words.txt 파일을 읽었습니다...");
        try{
            File file = new File("c:\\temp\\words.txt");
            Scanner fscanner = new Scanner(new FileReader(file));

            Vector<String> v = new Vector<>();
            while (fscanner.hasNext()){
                String line = fscanner.nextLine();
                v.add(line);
            }
            boolean found = false;
            while(true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("단어>>");
                String word = scanner.next();
                if (word.equals("그만")){
                    System.out.println("종료합니다...");
                    break;
                }

                for (int i=0; i<v.size(); i++){
                    String text = v.get(i);
                    if (text.length()<word.length()) continue;
                    String frontPart = text.substring(0,word.length());

                    if (word.equals(frontPart)){
                        System.out.println(text);
                        found = true;
                    }
                }
                if (found == false) System.out.println("발견할 수 없음");

            } fscanner.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
