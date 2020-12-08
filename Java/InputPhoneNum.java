import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputPhoneNum {
    public static void main(String[] args) {
        File f = new File("C:\\Temp\\Phone.txt");
        FileReader fr = null;
        int c;
        try{
            fr = new FileReader(f);
            System.out.println(f.getPath()+"를 출력합니다.");
            while ((c=fr.read())!=-1){
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
