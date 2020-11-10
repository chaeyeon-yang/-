import java.util.*;

public class RelativeGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scorelist = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> gradelist = new ArrayList<>();

        int stu_num = 0;
        int a_index = 0;
        int b_index = 0;
        int c_index = 0;
        int d_index = 0;
        int f_index = 0;
        System.out.println("**Java 성적 관리 프로그램입니다**");
        while (true){
            System.out.print("이름과 성적 입력>> ");
            String name = scanner.next();
            if (name.equals("끝")) break;
            int score = scanner.nextInt();
            scorelist.add(score);
            names.add(name);
            stu_num++;
        }
        Collections.sort(scorelist);

       for (int i=0; i<stu_num; i++){
           a_index = stu_num*2/10;
           b_index = stu_num*5/10;
           c_index = stu_num*7/10;
           d_index = stu_num*9/10;
           f_index = stu_num*10/10;
       }
       for (int i=0; i<a_index; i++){
           gradelist.add("A");
       }
        for (int i=a_index; i<b_index; i++){
            gradelist.add("B");
        }
        for (int i=b_index; i<c_index; i++){
            gradelist.add("C");
        }
        for (int i=c_index; i<d_index; i++){
            gradelist.add("D");
        }
        for (int i=d_index; i<f_index; i++){
            gradelist.add("F");
        }

        System.out.println("**Java 성적 입니다.");
       for (int i =0; i<stu_num; i++){
           String name = names.get(i);
           System.out.println(name+" "+gradelist.get(i)+"("+(i+1)+"0%)");
       }

    }
}
