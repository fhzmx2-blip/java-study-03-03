/*
 * 클래스는 전체가 아닌 하나하나에 대한 값을 저장  
 * 
 */

import java.util.Scanner;

class Student {
	int kor, eng, math, total;
	double avg;
	char score;
	String name;
}

public class 클래스_변수_장점 {
	public static void main(String[] args) {
		Student[] std = new Student[3];
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<3;i++) {
			Student s = new Student();
			System.out.println((i+1)+"번 학생 국어점수");
			s.kor=scan.nextInt();
			System.out.println((i+1)+"번 학생 영어점수");
			s.eng=scan.nextInt();
			System.out.println((i+1)+"번 학생 수학점수");
			s.math=scan.nextInt();
			
			s.total=s.kor+s.eng+s.math;
			s.avg=s.total/3.0;
			
			std[i]=s;
		}
	
	
	for (Student ss:std) {
		System.out.printf("%5s%5d%5d%5d%7d%7.2f\n", ss.name, ss.kor, ss.eng, ss.math, ss.total, ss.avg);
	}
	}
}
