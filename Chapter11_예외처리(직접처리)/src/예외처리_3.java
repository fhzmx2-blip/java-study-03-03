
public class 예외처리_3 {
	public static void main(String[] args) {
		String s=null;
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		try {
			int[]arr=new int[2];
			arr[2]=100;
			System.out.println("3");
			System.out.println(Integer.parseInt("10 "));
			System.out.println("5");
		} catch (ArithmeticException e) {
			System.out.println("6. 에러발생 수행:에러 복구");
		} catch (NumberFormatException e) {
			System.out.println("7. 에러발생 수행:에러 복구");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("8. 에러발생 수행:에러 복구");
		} catch (RuntimeException e) {
			System.out.println("6. 문자열처리");
		}
		finally {
			System.out.println("9. 무조건 수행");
		}		
		System.out.println("End");
	}
}
