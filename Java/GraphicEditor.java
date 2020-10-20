//p.321 #12

package Problem27;

import java.util.Scanner;

public class GraphicEditor{
    Shape start, last, obj;
    static int count=0;
    public void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int answer = scanner.nextInt();
        if (answer == 1){
            if (count == 0){
                start = new Line();
                last = start;
                count += 1;
            }
            else {
                obj = new Line();
                last.next = obj;
                last = obj;
                count += 1;
            }
        }
        else if (answer == 2){
            if (count == 0){
                start = new Rect();
                last = start;
                count += 1;
            }
            else {
                obj = new Rect();
                last.next = obj;
                last = obj;
                count += 1;
            }
        }
        else {
            if (count == 0){
                start = new Circle();
                last = start;
                count += 1;
            }
            else {
                count += 1;
                obj = new Circle();
                last.next = obj;
                last = obj;
                count += 1;
            }
        }
    }
    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 도형의 위치>>");
        int answer = scanner.nextInt();
        if (count==0 || answer > count) {
            System.out.println("삭제할 수 없습니다.");
        }
        else{
            last.next = last.next.next;

        }
    }
    public void show(){
        Shape p = start;
        while (p!=null){
            p.draw();
            p = p.next;
        }
    }
    public String finish(){
        return "beauty을 종료합니다.";
    }
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int answer = scanner.nextInt();
            if (answer == 1){ge.insert();}
            else if (answer == 2){ge.delete();}
            else if (answer == 3){ge.show();}
            if (answer == 4){ge.finish(); break;}
        }

    }
}
