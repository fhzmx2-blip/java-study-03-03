import java.awt.Choice;
import java.text.ChoiceFormat;
import java.util.Scanner;

public class 이항연산자_산술연산자_정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("typing kor: ");
		int kor = scanner.nextInt();
		System.out.print("typing eng: ");
		int eng = scanner.nextInt();
		System.out.print("typing math: ");
		int math = scanner.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		double[] limits= {50,60,64,67,70,74,77,80,84,87,90,94,97};
		String[] score= {"F", "D-", "D0", "D+", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		ChoiceFormat cf = new ChoiceFormat(limits, score);
		
		System.out.println("kor: "+kor+"\neng: "+eng+"\nmath: "+math+"\ntotal: "+total+"\naverage: "+avg+"\nscore: "+cf.format(avg));
		
	}

}
