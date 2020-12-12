import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OuputPhoneNum {
    public static void main(String[] args) {
        File f = new File("C:\\temp\\phone.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(f);
            Scanner scanner = new Scanner(System.in);
            System.out.println("전화번호 입력 프로그램입니다.");
            while(true){
                System.out.print("이름 전화번호 >> ");
                String ans = scanner.nextLine();
                if (ans.equals("그만"))break;
                fw.write(ans+"\r\n");
            }
            System.out.println(f.getPath()+"에 저장하였습니다.");

            fw.close();
            scanner.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
