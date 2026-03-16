import java.util.Scanner;

public class 메소드_2 {

	static int plus(int a, int b) {
		int c=a+b;
		return c;
	}
	
	static int minus(int a, int b) {
		int c=a-b;
		return c;
	}
	
	static int gop(int a, int b) {
		int c=a*b;
		return c;
	}
	
	static String div(int a, int b) {
		String res="";
		if(b==0) {
			res="0으로 나눌 수 없음";
		}
		else {
			res=a+"/"+b+"="+(a/(double)b);
		}
		return res;
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int a=scan.nextInt();
		
		System.out.print("연산자 입력: ");
		char op=scan.next().charAt(0);
		
		System.out.print("두번쨰 정수 입력: ");
		int b=scan.nextInt();
		
		switch (op){
			case '+' -> {
				int result=plus(a,b);
				System.out.println(result);
			}
			case '-' -> {
				int result=minus(a,b);
				System.out.println(result);
				}
			case '*' -> {
				int result=gop(a,b);
				System.out.println(result);
				}
			case '/' -> {
				String result=div(a,b);
				System.out.println(result);
				}
			default -> System.out.println("없는 연산자입니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
