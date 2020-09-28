import java.util.Scanner;

public class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    Song(){
        System.out.println("생성자 호출");
    }
    Song(int year, String country, String artist, String title){
        this.year = year;
        this.country = country;
        this.artist = artist;
        this.title = title;
    }

    void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("노래가 나온 연도, 가수의 국적, 가수의 이름, 노래 제목을 입력하세요>>");
        int year = scanner.nextInt();
        String country = scanner.next();
        String artist = scanner.next();
        String title = scanner.next();
        Song me = new Song(year, country, artist, title);
        me.show();
    }
}
