/*
 *		컴퓨터 값 생성, 나 입력, 값 비교
 */

import java.util.*;

public class 메소드_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();		
		
	}
	
	static void process() {
		int com = rand();
		while (true) {
			int user = input();
			compare(com, user);
		}
	}
	
	static int rand() {
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("1~100 사이의 정수: ");
			int user = scan.nextInt();
			
			if (user<1 || user>100) {
				System.out.println("잘못된입력");
				continue;
			}
			return user;
		}
	}


	private static void compare(int com, int user) {
		if (com>user) {
			System.out.println("입력값보다 높은 수 입력");
		}
		else if(com<user) {
			System.out.println("입력값보다 작은 수 입력");
		}
		else {
			System.out.println("game over");
			System.exit(0);
		}
	}

	

}
