import java.util.Scanner;

public class MonthSchedule {
    private int days;
    private String plan;
    public MonthSchedule(int days){
        this.days = days;
    }
    public void view(int date){
        System.out.println(date+"일의 할일은 "+plan+"입니다.");
    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.print("날짜(1~" + days + ")?");
                int date = scanner.nextInt();
                System.out.print("할일(빈칸없이입력)?");
                plan = scanner.next();
            }
            if (num == 2) {
                System.out.print("날짜(1~" + days + ")?");
                int date = scanner.nextInt();
                view(date);
            }
            if (num == 3) {
                finish();
                break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}


