import java.util.Scanner;
// 대소문자 확인
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 입력: ");
		String ch=scan.next();
		/*
		 * next문자, nextInt정수, nextDouble실수
		 */
		char c=ch.charAt(0);
		System.out.println("알파벳"+c);
		
		if (c>='A' && c<='Z') {
			System.out.println(c+"는 대문자");
		}
		if (c>='a' && c<='z') {
			System.out.println(c+"는 소문자");
		}
		if (c>='0' && c<='9') {
			System.out.println(c+"는 숫자");
		}
	}

}
