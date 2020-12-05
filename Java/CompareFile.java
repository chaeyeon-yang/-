import java.io.*;
import java.util.Scanner;

public class CompareFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream srcStream = null;
        FileInputStream detStream = null;

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String src = scanner.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String det = scanner.next();
        System.out.println(src+"과 "+det+"를 비교합니다.");
        try{
            srcStream = new FileInputStream(src);
            detStream = new FileInputStream(det);
            if (compareTo(srcStream, detStream))
                System.out.println("파일이 같습니다.");
            else
                System.out.println("파일이 다릅니다.");

        if (srcStream!=null) srcStream.close();
        if (detStream!=null) detStream.close();
        scanner.close();
        }catch (IOException e) {System.out.println("입출력 오류");}
    }

    private static boolean compareTo(FileInputStream src, FileInputStream det) throws IOException{
        byte[] srcbuf = new byte[1024];
        byte[] detbuf = new byte[1024];

        int srcCount, detCount = 0;

        while (true){
            srcCount = src.read(srcbuf, 0, srcbuf.length);
            detCount = det.read(detbuf,0,detbuf.length);

            if (srcCount != detCount) return false;

            if (srcCount == -1) break;

            for (int i=0; i<srcCount; i++){
                if (srcbuf[i]!=detbuf[i])return false;
            }
        }
        return true;
    }
}
