
public class 메소드_3 {

	static void display() {
		System.out.println("display() 진입...");
		System.out.println("실행");
		System.out.println("display() 종료...");
	}
	
	static void increment() {
		int a=10;
		System.out.println("a="+a);
		a++;
	}
	/*
	 * 만약
	 * increment();
	 * increment();
	 * increment();
	 * 했을 때의 결과를 생각해보기
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display();
		display();
		display();
		display();

	}

}
