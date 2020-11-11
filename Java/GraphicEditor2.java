package Chapter7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class GraphicEditor2 {
    Scanner scanner = new Scanner(System.in);
    Vector<Shape> v = new Vector<>();
    void run(){
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
            int ans = scanner.nextInt();
            if (ans == 1) insert();
            else if (ans == 2) delete();
            else if (ans == 3) view();
            else {System.out.println("beauty을 종료합니다."); break;}

        }
    }
    void insert() {
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int ans = scanner.nextInt();
        if (ans == 1) v.add(new Line());
        else if (ans == 2) v.add(new Rect());
        else if (ans == 3) v.add(new Circle());
    }

    void delete(){
        System.out.print("삭제할 도형의 위치>>");
        int ans = scanner.nextInt();
        if (ans>v.size() || ans == v.size()) System.out.println("삭제할 수 없습니다.");
    }
    void view(){
        Iterator<Shape> it = v.iterator();
        while(it.hasNext()){
            Shape shape = it.next();
            shape.draw();
        }
    }
    public static void main(String[] args) {
       GraphicEditor2 ge = new GraphicEditor2();
       ge.run();

    }
}
