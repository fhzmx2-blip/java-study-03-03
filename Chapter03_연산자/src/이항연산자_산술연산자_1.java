/*
 * 	국어/영어/수학 점수 입력을 받아서 총점 / 평균 출력
 *  --------------------------------------
 */

import java.util.Scanner;
//	import 생략 => java.lang.* : string, math ...
//	java.util.*
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter kor: ");
		int kor = scanner.nextInt();
		System.out.println("enter eng: ");
		int eng = scanner.nextInt();
		System.out.println("enter math: ");
		int math = scanner.nextInt();
		
		int total = kor+eng+math;
		
		double avg = total/3.0;
		
		System.out.println("kor: "+kor+"\neng: "+eng+"\nmath: "+math);
		
		System.out.printf("\n최종결과"+"\nScore: "+total+"\n평균:%.2f\n",avg);
	}

}
