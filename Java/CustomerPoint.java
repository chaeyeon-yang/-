
import java.util.*;

class Customer {
    HashMap<String, Integer> pointmap = new HashMap<String, Integer>();
    ArrayList<String> allcustomer = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void save() {
        while (true) {
            System.out.print("이름과 구매금액 입력>> ");
            String name = scanner.next();
            if (name.equals("그만")) break;
            int money = scanner.nextInt();
            int point = money / 10;

            if (pointmap.containsKey(name)) {
                int sumpoint = pointmap.get(name) + point;
                pointmap.remove(name);
                pointmap.put(name, sumpoint);
            } else {
                pointmap.put(name, point);
                allcustomer.add(name);
            }
            for (int i = 0; i < pointmap.size(); i++) {
                System.out.print("(" + allcustomer.get(i) + "," + pointmap.get(allcustomer.get(i)) + ") ");
            }
            System.out.println();
        }
    }

    public void view() {
        System.out.print("이름>> ");
        String name = scanner.next();
        if (pointmap.containsKey(name))
            System.out.println("포인트: " + pointmap.get(name));
        else
            System.out.println("등록되지 않은 고객입니다.");                     // 등록되지 않은 고객의 경우 조회 불가
    }

    public void deduction() {
        System.out.print("이름>> ");
        String name = scanner.next();
        if (pointmap.get(name) == null) {
            System.out.println("등록되지 않은 고객입니다.");                      // 등록되지 않은 고객인 경우 포인트 차감 불가
            return;
        }
        int minuspoint = pointmap.get(name);
        if (minuspoint == 0) {
            System.out.println("잔여포인트가 없어서 포인트 차감이 불가능 합니다.");   // 잔여포인트가 0인경우
            return;
        }
        System.out.print("상품가격>> ");
        int money = scanner.nextInt();
        System.out.println("실지불액: " + (money - minuspoint));
        System.out.println("잔여포인트:0");
        int finalpoint = 0;
        pointmap.remove(name);
        pointmap.put(name, finalpoint);


    }

    public void vip() {
        int max = 0;
        ArrayList<String> viplist = new ArrayList<String>();
        Set<String> customers = pointmap.keySet();
        Iterator<String> it = customers.iterator();
        String vip = null;
        int finalmax = 0;
        while (it.hasNext()) {
            String name = it.next();
            int point = pointmap.get(name);
            if (point > max) {
                vip = name;
                max = point;
            }
        }
        viplist.add(vip);
        for (int i=0; i<allcustomer.size(); i++){
            String name = allcustomer.get(i);
            if (!name.equals(vip) && pointmap.get(name) == max) viplist.add(name);
        }

        System.out.print("최우수고객>> ");
        for (int i = 0; i < viplist.size(); i++) {
            System.out.print(viplist.get(i));
            if (i != viplist.size()-1) System.out.print(", ");  // 포인트가 같은 최우수 고객이 다수일 수 있음
        }
        System.out.println();
        }
    }



    public class CustomerPoint {
        public void run() {
            Customer c = new Customer();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("**포인트 관리 프로그램입니다**");
                System.out.println("**1: 포인트 적립");
                System.out.println("**2: 포인트 조회");
                System.out.println("**3: 포인트 차감");
                System.out.println("**4: 최우수 고객 알림");
                System.out.println("**5: 종료");
                System.out.print("** 선택: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    c.save();
                } else if (choice == 2) c.view();
                else if (choice == 3) c.deduction();
                else if (choice == 4) c.vip();
                else {
                    System.out.println("MJ포인트 관리 프로그램 정상 종료");
                    break;
                }
            }
            scanner.close();
        }

        public static void main(String[] args) {
            CustomerPoint cp = new CustomerPoint();
            cp.run();
        }
    }