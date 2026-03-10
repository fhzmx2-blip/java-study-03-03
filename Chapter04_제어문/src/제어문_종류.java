/*
 *	건너뛰다 / 반복수행 / 선택 / 반복제어
 *	----------------------------------
 *	*** 제어문 (연산자 활용)
 *		=> 평문 : 한줄씩 차례대로 처리
 *		=> 조건문
 *		=> 반복문
 *		=> 한 문장만 수행이 가능
 *			if (조건){
 *					수행문장
 *			}
 *
 *		=> 자바 =>	backend
 *					=> 프로그램언어
 *					=> JSP
 *					=> Oracle
 *					frontend
 *					=> html/css/js
 *
 *	조건문	=> 에러 처리 / 필요한 부분
 *				----- 예외처리
 *		= 단일 조건문
 *		= 선택 조건문
 *		= 다중 조건문
 *	선택문
 *		= 선택문
 *	반복문 
 *		= do~while 
 *		= while
 *		= for
 *	반복제어문
 *		= break
 *		= continue
 */

import java.util.Scanner;

public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		int num=scan.nextInt();
		if (num%2==0) {
			System.out.println(num+ " is 짝");
		}
		else {
			System.out.println(num+ " is 홀");
		}
	}

}
