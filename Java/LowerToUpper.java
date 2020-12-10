import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LowerToUpper {
    public static void main(String[] args) {
        File f = new File("C:\\Windows\\system.ini");
        FileReader fr = null;
        int c;
        try{
            fr = new FileReader(f);
            while ((c=fr.read())!= -1){
                char a = (char)c;
                if (Character.isLowerCase(a)){
                    a = Character.toUpperCase(a);
                }
                System.out.print(a);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
