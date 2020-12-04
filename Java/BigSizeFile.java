import java.io.File;

public class BigSizeFile {
    public static void main(String[] args) {

    File file = new File("C:\\");
    File[] subFiles = file.listFiles();
    long max = 0;
    String maxFile = null;
    for (int i=0; i<subFiles.length; i++) {
        if (subFiles[i].length() > max) {
            max = subFiles[i].length();
            maxFile = subFiles[i].getPath();
        }
    }
        System.out.println("가장 큰 파일은 "+maxFile+" "+max+"바이트");
}
}
