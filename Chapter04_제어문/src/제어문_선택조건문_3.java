//	절대값 출력
/*
 * 	break, continue, return
 */

import java.util.Scanner;

public class 제어문_선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println(num*-1);
		}
		else {
			System.out.println(num);
		}
		
//		if (num==0) {
//			System.out.println(num);
////			return;
//		}
//		else {
//			//중첩 if문
//			if(num<0) {
//				System.out.println(num*-1);
//			}
//			else {
//				System.out.println(num);
//			}
//		}
		//검증
		System.out.println("\n검증: "+Math.abs(num));
	}

}
