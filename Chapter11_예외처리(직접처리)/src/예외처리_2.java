/*
 * try-catch-finally
 */

public class 예외처리_2 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println(10/0);
			System.out.println("4");
		} catch(Exception e) {
			System.out.println("5");
		} finally {
			System.out.println("6");
		}
	}
}
