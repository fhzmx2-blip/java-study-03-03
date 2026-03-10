/*
 * 제어문 : 연산자 => 형식, 결과값 
 */

import java.util.Scanner;

public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 입력:");
		int score=scan.nextInt();
		
		String res=score>=0 && score<=100?"정상":"오류";
		System.out.println(res);
	}

}
