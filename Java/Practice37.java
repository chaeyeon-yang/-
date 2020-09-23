
// 배열안의 랜덤한 숫자들과 평균을 출력하는 프로그램
public class Practice37 {
    public static void main(String[] args) {
        int i = (int)(Math.random()*10 +1);
        int intarray[] = new int[10];
        int sum=0;

        System.out.print("랜덤한 정수들 : ");
        for (int j=0; j<10; j++, i=(int)(Math.random()*10 +1)){
            intarray[j] = i;
            System.out.print(intarray[j]+" ");
        }
        System.out.println();
        for (int j=0; j<i; j++)
            sum += intarray[j];
        System.out.println("평균은 "+(double)sum/i);
    }
}
