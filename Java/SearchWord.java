import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class SearchWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>> ");
        String name = scanner.next();

        try {
            Scanner fscanner = new Scanner(new FileReader(name));
            Vector<String> v = new Vector<>();
            while (fscanner.hasNext()){
                String line = fscanner.nextLine();
                v.add(line);
            }

            while(true){
                System.out.print("검색할 단어나 문장>> ");
                String text = scanner.next();
                if (text.equals("그만")){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                for (int i=0; i<v.size(); i++){
                    if (v.get(i).contains(text))
                        System.out.println(v.get(i));
                }

            }
            scanner.close();
            fscanner.close();
        }catch (IOException e) {System.out.println("입출력 오류");}
    }
}
