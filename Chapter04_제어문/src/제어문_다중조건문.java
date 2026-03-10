/*
 * 	1. 단일 조건문
 * 	2. 다중 조건문 if, else if(여러 개 가능), else
 */

import java.util.Scanner;

public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수 입력: ");
		int num1=scan.nextInt();
		
		System.out.print("연산자+-*/ 입력: ");
		String op=scan.next();
		
		System.out.print("두번쨰 정수 입력: ");
		int num2=scan.nextInt();
		
		char c=op.charAt(0);
		
		if (c=='+') {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}
		else if (c=='-') {
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}
		else if (c=='*') {
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}
		else if (c=='/') {
			System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
		}
		else {
			System.out.println("잘못된 연산자입니다");
		}
	}

}
