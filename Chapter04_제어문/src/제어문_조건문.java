/*
 * 개월을 입력하고 계절확인
 * 
 * 12 1 2
 * 3 4 5
 * 6 7 8
 * 9 10 11
 */

import java.util.*;

public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month=scan.nextInt();
		
		if(month>=1 && month<=12) {
			if(month>=3 && month<=5) {
				System.out.println("봄입니다");
			}
			else if (month>=6 && month<=8) {
				System.out.println("여름입니다");
			}
			else if (month>=9 && month<=11) {
				System.out.println("가을입니다");
			}
			else {
				System.out.println("겨울입니다");
			}
		}
		else {
			System.out.println("없는 달");
		}

	}

}
