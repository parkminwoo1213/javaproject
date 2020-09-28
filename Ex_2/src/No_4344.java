import java.util.Scanner;

public class No_4344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N;
		System.out.print("input N: ");
		N = input.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int x=i,y=j;
				while(x>0) {
					if(x%3==1&&y%3==1) {
						break;
					}
					x /=3;
					y /=3;
				}
				if(x==0) {System.out.print("*");}
				else {System.out.print(" ");}
			}
		System.out.print("\n");
		input.close();
	  }
	}
}
