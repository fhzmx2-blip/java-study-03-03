/*
 * 
 */

import java.security.PublicKey;
import java.util.Scanner;

public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("kor: ");
		int kor=scan.nextInt();
		
		System.out.println("eng: ");
		int eng=scan.nextInt();
		
		System.out.println("math: ");
		int math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		
		if(avg>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
