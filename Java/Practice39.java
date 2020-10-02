
// 무작위의 숫자들을 원소로 가지는 4x4 배열
public class Practice39 {
    public static void main(String[] args) {
        int[][] intarray;
        intarray = new int[4][4];
        int num = (int)(Math.random()*10+1);

        for (int i = 0; i<4; i++){
            for (int j=0; j<4; j++){
                if (intarray[i][j] == 0)
                    intarray[i][j] = num;
                num = (int)(Math.random()*10+1);
            }
        }

        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++)
                System.out.print(intarray[i][j]+" ");
            System.out.println();
        }
    }
}
