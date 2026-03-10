import java.util.Scanner;

public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 입력받을 준비
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 입력값 => 받아서 메모리에 저장하는 역할
		// => API => 자바에서 제공
		// 1. 첫번째 숫자
		System.out.print("첫번째 정수 입력: ");
		int num1 = scan.nextInt();
		// 2. 연산자
		System.out.print("연산자입력(+-*/): ");
		String op = scan.next();
		// 3. 두번째 숫자 ===> 저장 --> 결과값 출력시 읽기
		System.out.print("두번째 정수 입력: ");
		int num2=scan.nextInt();
		
		//처리
		if (op.equals("+")) {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}
		else if (op.equals("-")) {
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}
		else if (op.equals("*")) {
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}
		else if (op.equals("/")) {
			if (num2!=0) {
			System.out.printf("%d/%d=%.2f\n", num1, num2, (double) num1/num2);
			}
			else {
				System.out.println("0으로 나눌 수 없습니다");
			}
		}
		else {
			System.out.println("올바른 계산이 아닙니다.");
		}
	}

}
