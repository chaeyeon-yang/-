import java.util.Scanner;

public class Average1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ���� ���� 3���� �Է��ϼ���.");
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int num3 = Integer.parseInt(c);
		
		System.out.println((num1+num2+num3)/3);
		
	}

}
