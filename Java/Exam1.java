import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Double> map = new HashMap<>();
        Vector<String> list = new Vector<>();
        System.out.println("명지 장학금 관리 시스템입니다. 이름과 학점을 입력하세요.");
        while(true){
            System.out.print("이름과 학점>> ");
            String name = scanner.next();
            if (name.equals("그만")) break;
            double score = scanner.nextDouble();
            map.put(name,score);
        }
        double boundary;
        System.out.print("장학생 선발 학점 기준을 입력하세요>> ");
        boundary = scanner.nextDouble();

        Set<String> key = map.keySet();
        Iterator<String> it = key.iterator();
        while(it.hasNext()){
            String name = it.next();
            if (map.get(name)>=boundary){
                list.add(name);
            }
        }

        System.out.print("장학생 명단: ");
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        scanner.close();
    }
}
