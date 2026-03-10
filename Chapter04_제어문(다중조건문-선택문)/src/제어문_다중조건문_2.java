/*
 * 1. 경우의 수
 * 로그인을 예시로 하면
 * 아이디가 없는 경우, 비밀번호가 틀린 경우 등
 * 2. 문법사항
 * 3. 어떤 조건인가
 * 
 * 4. 성적계산처럼 점수 범위별 조건의 경우
 */

import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = scan.nextInt();
		
		char c = 'A';
		
//		if (score>=90) {
//			c='A';
//		}
//		else if (score>=80) {
//			c='B';
//		}
//		else if (score>=70) {
//			c='C';
//		}
//		else if (score>=60) {
//			c='D';
//		}
//		else {
//			c='F';
//		}
//		
//		System.out.println("학점: "+c);
		
//		switch(score/10) {
//		case 10, 9 -> c='A';
//		case 8 -> c='B';
//		case 7 -> c='C';
//		case 6 -> c='D';
//		default -> c='F';
//		}
		
		String s = switch(score/10) {
		case 10, 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		
		System.out.println("학점: "+s);
	}

}
