
// 명령행 인자 중 정수만을 골라 합을 구하는 프로그램
public class Add {
    public static void main(String[] args) {
        double sum = 0.0;
        int countInt = 0;
        try{
            for (int i=0; i<args.length; i++){
                sum += Integer.parseInt(args[i]);
                countInt += 1;
            }

        }
        catch (NumberFormatException e){
        }

        System.out.println(sum/countInt);

    }
}
