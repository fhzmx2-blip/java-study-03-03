/*
 * for 특정 부분 제외
 * while 처음부터 다시
 */

import java.util.*;

public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int com=r.nextInt(100)+1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1~100까지의 정수 입력: ");
			int user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			
			if(com>user) {
				System.out.println("입력값보다 큰 값을 입력하세요");
			}
			else if(com<user) {
				System.out.println("입력값보다 작은 값을 입력하세요");
			}
			else {
				System.out.println("Game Over");
				break;
			}
		}while(true);
	}

}
