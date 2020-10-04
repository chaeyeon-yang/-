
// main()의 매개변수 처리와 Integer.parseInt()
public class Average_2 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i=0; i<args.length; i++)
            sum += Integer.parseInt(args[i]);

        System.out.println(sum/args.length);
    }
}
