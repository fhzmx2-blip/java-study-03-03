
public class 예외처리_4 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			try {
			int no=(int)(Math.random()*3);
			System.out.println(i+"."+(i/no));
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}