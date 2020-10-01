public class Week2_1 {
    public static void main(String[] args) {
        int intarray[][] = new int[4][4];
        int x, y, count = 0;

        while (count < 10) {
            x = (int) (Math.random() * 4);
            y = (int) (Math.random() * 4);
            if (intarray[x][y] == 0) {
                intarray[x][y] = (int) (Math.random() * 10 + 1);
                count++;
            }
        }

        for (int i = 0; i < intarray.length; i++) {
            for (int j = 0; j < intarray[i].length; j++) {
                System.out.print(intarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
