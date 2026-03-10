/*
 * 범위가 있는 경우
 * 하나의 값을 선택
 */

import java.util.*;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score=scan.nextInt();
		/*char op='a';
		
		switch(score/10) {
		case 10: case 9:
			op='A';
			break;
		case 8:
			op='B';
		case 7:
			op='C';
			break;
		case 6:
			op='D';
			break;
		default:
			op='F';
		}
		System.out.println("힉점: "+op);*/
		String grade=switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println("학점: "+grade);
	}

}
