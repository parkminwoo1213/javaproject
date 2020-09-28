import java.util.Scanner;

public class No_10951 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B;
		System.out.print("정수 A입력: ");
		A = in.nextInt();
		
		System.out.print("정수 B입력: ");
		B = in.nextInt();
		int sum = A+B;
		System.out.println("A+B= "+sum);
		in.close();
	}

}
