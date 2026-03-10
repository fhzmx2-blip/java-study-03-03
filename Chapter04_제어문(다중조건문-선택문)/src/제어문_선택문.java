/*
 * 선택문 =>	다중 조건문을 단순화
 * 			복잡한 소스코딩에서 주로 사용
 * 			-------- 게임 / 네트워크
 * 					 |===> 복잡도 
 * 
 * 	switch(정수/문자/문자열) ===> boolean double 안됨
 * 	case "+" -> 처리문장; break;
 *  case "-" -> 처리문장;
 *  ...
 *  ...
 *  
 */

import java.util.Scanner;

public class 제어문_선택문 {
	public static void main(String[] args) {
		// 1. 입력받을 준비
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 입력값 => 받아서 메모리에 저장하는 역할
		// => API => 자바에서 제공
		// 1. 첫번째 숫자
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		// 2. 연산자
		System.out.print("연산자입력(+-*/): ");
		String op = scan.next();
		// 3. 두번째 숫자 ===> 저장 --> 결과값 출력시 읽기
		System.out.print("두번째 정수 입력: ");
		int num2=scan.nextInt();
		
//		switch(op) {
//		case "+":
//			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
//			break;
//		case "-":
//			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
//			break;
//		case "*":
//			System.out.printf("%d+%d=%d\n", num1, num2, num1*num2);
//			break;
//		case "/":
//			if (num2!=0) {
//				System.out.printf("%d/%d=%.2f\n", num1, num2, (double) num1/num2);
//				}
//			else {
//					System.out.println("0으로 나눌 수 없습니다");
//			}
//			break;
//		default: 
//			System.out.println("존재하지 않는 연산자입니다");
//		}
		
		
		switch(op) {
//		case "+", "%"-> {
//			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
//			System.out.println("프로그램 종료");
//			}
		case "+"-> 
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);			
		case "-"->
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);			
		case "*"->
			System.out.printf("%d+%d=%d\n", num1, num2, num1*num2);
		case "/"->	{		
			if (num2!=0) {
				System.out.printf("%d/%d=%.2f\n", num1, num2, (double) num1/num2);
				}
			else {
				System.out.println("0으로 나눌 수 없습니다");
				}
			}
		default-> System.out.println("존재하지 않는 연산자입니다");
		}
	
	}
	

}
