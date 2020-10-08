
import com.sun.source.tree.UsesTree;

import java.util.Scanner;

class Phone{
    private String name;
    private String phonenum;

    public Phone(String name, String phonenum){this.name = name; this.phonenum = phonenum;}
    public String getName(){return name;}
    public String getPhonenum(){return phonenum;}
}


public class PhoneBook {
    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int peoplenum = scanner.nextInt();
        Phone[] phonearray = new Phone[peoplenum];
        for (int i = 0; i < peoplenum; i++) {
            System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String phonenum = scanner.next();
            phonearray[i] = new Phone(name, phonenum);
        }
        System.out.println("저장되었습니다...");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int peoplenum = scanner.nextInt();
        Phone[] phonearray = new Phone[peoplenum];
        for (int i = 0; i < peoplenum; i++) {
            System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String phonenum = scanner.next();
            phonearray[i] = new Phone(name, phonenum);
        }
        System.out.println("저장되었습니다...");

        while (true) {
            String check = "없음";
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            for (int i = 0; i < phonearray.length; i++) {
                if (name.equals(phonearray[i].getName())) {
                    check = "있음";
                    System.out.println(name + "의 번호는 " + phonearray[i].getPhonenum() + "입니다.");
                    break;
                }
            }
            if (name.equals("그만")) break;
            if (check.equals("없음"))
                System.out.println(name + " 이 없습니다.");
        }
    }
}