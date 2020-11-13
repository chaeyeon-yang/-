import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String one = scanner.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String two = scanner.nextLine();
        System.out.print("합병할 파일 이름을 입력하세요>>");
        String finalfile = scanner.nextLine();

        int c;
        File appended = new File("c:\\project",finalfile);
        try{
            File f = new File("c:\\project",one);
            File f2 = new File("c:\\project",two);
            FileReader fr = new FileReader(f);
            FileReader fr2 = new FileReader(f2);
            FileWriter fw = new FileWriter(appended);
            while((c = fr.read())!=-1){
                fw.write((char)c);
            }
            while((c = fr2.read())!=-1){
                fw.write((char)c);
            }
            fr.close();
            fr2.close();
            fw.close();
            System.out.println("프로젝트 폴더 밑에 "+appended.getName()+" 파일에 저장하였습니다.");

        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}

