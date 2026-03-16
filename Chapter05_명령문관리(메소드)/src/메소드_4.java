import java.util.Scanner;

public class 메소드_4 {
	static void gugudan(int dan) {
		for (int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dan=scan.nextInt();
		gugudan(dan);
		
		int dan2=scan.nextInt();
		gugudan(dan2);
		
		int dan3=scan.nextInt();
		gugudan(dan3);
	}

}
