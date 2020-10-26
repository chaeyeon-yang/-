//p.385 #5

public class Calendar {
    private int hour;
    private int minute;
    public Calendar(int hour, int minute){
        this.hour = hour; this.minute = minute;
    }
    public String toString(){
        return "현재 시간은 "+hour+"시 "+minute+"분입니다.";
    }

    public void check(){
        if (hour>=4 && hour<12) System.out.println("Good Morning");
        else if (hour<18) System.out.println("Good Afternoon");
        else System.out.println("Good Night");
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar(10,22);
        System.out.println(calendar);
        calendar.check();
    }
}
