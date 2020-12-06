import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println("a.jpg를 b.jpg로 복사합니다.");
        File src = new File("C:\\Temp\\a.jpg");
        File det = new File("C:\\Temp\\b.jpg");

        long size = src.length() / 10;
        long now = 0;
        int read;
        try {
            FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(det);
            System.out.println("10%마다 *을 출력합니다.");

            byte[] buf = new byte[1024];
            while (true) {
                read = input.read(buf, 0, buf.length);
                if (read == -1) {
                    if (now > 0) {
                        System.out.print("*");
                    }
                    break;
                }
                if (read > 0)
                    output.write(buf, 0, read);
                now += read;
                if (now >= size) {
                    System.out.print("*");
                    now = 0;
                }

            }
            input.close();
            output.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
