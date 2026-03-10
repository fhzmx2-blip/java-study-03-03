import java.awt.desktop.AboutHandler;
import java.util.Scanner;

public class 제어문_단일조건문 {
	public static void main(String[] args) {
//		int a=10;
//		if (a==10) {
//			System.out.println("a="+a);
//		}
//		System.out.println("program exit");
		
		int r = (int)(Math.random()*3);
		
		String com="지정되지 않은 값";
		
		if (r == 0) {
			com ="가위";
		}
		if (r == 1) {
			com="바위";
		}
		if (r == 2) {
			com="보";
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		int choice = scan.nextInt();
		String user="지정되지 않은 값";
		
		if (choice == 0) {
			user ="가위";
		}
		if (choice == 1) {
			user ="바위";
		}
		if (choice == 2) {
			user ="보";
		}
		
		System.out.println("나: "+user);
		System.out.println("컴: "+com);
		
//		if ((choice==0 && r==2) || (choice==1 && r==0) || (choice==2 && r==1)) {
//			System.out.println("승리");
//		}
//		else if ((choice==r)) {
//			System.out.println("무승부");
//		}
//		else {
//			System.out.println("패배");
//		}
		
		int res =r-choice;
		if (res==-1 || res==2)
			System.out.println("승리");
		if (res==1 || res==-2)
			System.out.println("패배");
		if (res==0)
			System.out.println("무승부");


	}
}
