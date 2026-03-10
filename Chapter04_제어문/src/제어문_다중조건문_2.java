/* int avg=85
 * if (avg>=90)
 * 		A
 * if (avg>=80)
 * 		B
 * if (avg>=70)
 * 		C
 * if (avg>=60)
 * 		D
 * if (avg<60)
 * 		E
 * 
 * 이러면 90점이 D가 나오겠네
 */

import java.util.Scanner;

public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("kor: ");
		int kor=scan.nextInt();
		
		System.out.println("eng: ");
		int eng=scan.nextInt();
		
		System.out.println("math: ");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		
		double avg = total/3.0;
		
		char score='A';
//		if(avg>=90) score='A';
//		if(90>avg && avg>=80) score='B';
//		if(80>avg && avg>=70) score='C';
//		if(70>avg && avg>=60) score='D';
//		if(avg<60) score='E';
		if(avg>=90) score='A';
		else if(avg>=80) score='B';
		else if(avg>=70) score='C';
		else if(avg>=60) score='D';
		else score='E';
		
		System.out.println("total: "+total+"\navg: "+avg+"\nscore: "+score);
	}

}
