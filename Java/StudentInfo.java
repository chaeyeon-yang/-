import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
    private String name;
    private String major;
    private int id;
    private double grade;
    public Student(String name, String major, int id, double grade){
        this.grade = grade; this.id = id;
        this.name = name; this.major = major;
    }
    public String toString(){
        return "-----------------------\n"+
                "이름:"+name+"\n"+"학과:"+major+"\n"+"학번:"+id+"\n"+"학점평균:"+grade;
    }
    public String getName(){
        return name;
    }
    public String stringInfo(){
        return name+", "+major+", "+id+", "+grade;
    }
}


public class StudentInfo {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        int count = 0;
        for (int i=0; i<4; i++){
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            int id = Integer.parseInt(st.nextToken().trim());
            double grade = Double.parseDouble(st.nextToken().trim());

            list.add(new Student(name, major, id, grade));
        }
        for (int i=0; i<4; i++) {
            Student student = list.get(i);
            System.out.println(student);
        }
        System.out.println("-----------------------");
        while(true){
            System.out.print("학생이름 >>");
            String name = scanner.next();
            if (name.equals("그만")) break;
            for (int i=0; i<4;i++){
                Student student = list.get(i);
                if (student.getName().equals(name)) System.out.println(student.stringInfo());
            }
        }
    }

}
