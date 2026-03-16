/*
 * 
 */

import java.util.*;

public class 메소드_2 {
	//반복제거 
	static int input(String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.print(subject+" 입력: ");
		return scan.nextInt();
	}
	
	static int total(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	static double avg (int total) {
		return total/3.0;
	}
	
	static String score (double avg) {
		String score=switch((int)(avg/10)) {
		case 10, 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		return score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("국어 값: ");
//		int kor=scan.nextInt();
//		
//		System.out.print("영어 값: ");
//		int eng=scan.nextInt();
//		
//		System.out.print("수학 값: ");
//		int math=scan.nextInt();
		int kor=input("국어");
		int eng=input("수학");
		int math=input("영어"); 
		
//		int total=kor+eng+math;
//		double avg=total/3.0;
		
//		String score=switch((int)(avg/10)) {
//		case 10, 9 -> "A";
//		case 8 -> "B";
//		case 7 -> "C";
//		case 6 -> "D";
//		default -> "F";
//		};
		
		int t=total(kor, eng, math);
		double a=avg(t);
		String s=score(a);
		
		System.out.println(t);
		System.out.println(a);
		System.out.println(s);
	}

}
