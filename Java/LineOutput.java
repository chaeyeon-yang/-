
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineOutput {
    public static void main(String[] args) {

        try{
            int lineNumber = 1;

            Scanner fscanner = new Scanner(new FileReader("C:\\Windows\\system.ini"));
            System.out.println("C:\\Windows\\system.ini 파일을 읽어 출력합니다.");
            while(fscanner.hasNext()){
                String line = fscanner.nextLine();
                System.out.printf("%4d",lineNumber);
                System.out.print(": "+line);
                lineNumber++;
                System.out.println();
            }
            fscanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
