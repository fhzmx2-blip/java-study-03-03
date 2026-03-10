/*
 * if, else
 */
import java.util.Scanner;

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력");
		int num2=scan.nextInt();
		
		int num3=num1>num2?num1:num2;
		if (num3==num1) {
			System.out.println("최대값: " +num1+"\n최소값: "+num2);
		}
		else {
			System.out.println("최대값: " +num2+"\n최소값: "+num1);
		}
	}

}
