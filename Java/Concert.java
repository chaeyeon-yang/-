//p.247 #12

import java.util.Scanner;

class Software{
    public static String seats_S[] = {"S>>","---", "---", "---", "---", "---", "---", "---", "---", "---","---"};
    public static String seats_A[] = {"A>>","---", "---", "---", "---", "---", "---", "---", "---", "---","---"};
    public static String seats_B[] = {"B>>","---", "---", "---", "---", "---", "---", "---", "---", "---","---"};
    public static int seat_num;

    void reservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3) >>");
        int seat = scanner.nextInt();
        if (seat == 1) {
            for (int i=0; i<seats_S.length; i++)
                System.out.print(seats_S[i]+" ");
            System.out.println();
            System.out.print("이름>>");
            String name = scanner.next();
            System.out.print("번호>>");
            seat_num = scanner.nextInt();
            seats_S[seat_num] = name;
        } else if (seat == 2) {
            for (int i=0; i<seats_A.length; i++)
                System.out.print(seats_A[i]+" ");
            System.out.println();
            System.out.print("이름>>");
            String name = scanner.next();
            System.out.print("번호>>");
            int seat_num = scanner.nextInt();
            seats_A[seat_num] = name;
        } else {
            for (int i=0; i<seats_B.length; i++)
                System.out.print(seats_B[i]+" ");
            System.out.println();
            System.out.print("이름>>");
            String name = scanner.next();
            System.out.print("번호>>");
            int seat_num = scanner.nextInt();
            seats_B[seat_num+1] = name;
        }
    }

    public void show(){
        for (int i=0; i<seats_S.length; i++)
            System.out.print(seats_S[i]+" ");
        System.out.println();
        for (int i=0; i<seats_A.length; i++)
            System.out.print(seats_A[i]+" ");
        System.out.println();
        for (int i=0; i<seats_B.length; i++)
            System.out.print(seats_B[i]+" ");
        System.out.println();
            System.out.println("<<<조회를 완료하였습니다.>>>");
        }
    public void cancel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3>>");
            int num = scanner.nextInt();
            if (num == 1){
                for (int i=0; i<seats_S.length; i++){
                    System.out.print(seats_S[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i=0; i<seats_S.length; i++){
                    if (seats_S[i].equals(name)){
                        seats_S[i] = "---";
                    }
                }
            }
            else if (num == 1){
                for (int i=0; i<seats_A.length; i++){
                    System.out.print(seats_A[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i=0; i<seats_A.length; i++){
                    if (seats_A[i].equals(name)){
                        seats_A[i] = "---";
                    }
                }
            }
            else {
                for (int i=0; i<seats_B.length; i++){
                    System.out.print(seats_B[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i=0; i<seats_B.length; i++){
                    if (seats_B[i].equals(name)){
                        seats_B[i] = "---";
                    }
                }
            }
        }
}

public class Concert {
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Software sf = new Software();
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int select = scanner.nextInt();
            if (select == 1){sf.reservation();}
            else if (select ==2){sf.show();}
            else if (select == 3){sf.cancel();}
            if (select == 4) break;
        }
    }
    public static void main(String[] args){
        Concert concert = new Concert();
        String seats[] = {"---","---","---","---","---","---","---","---","---","---",};
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        concert.run();
        }
    }

