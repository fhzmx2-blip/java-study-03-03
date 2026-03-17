/*
 * equals / equalsIgnoreCase
 *  대소문자 구분 / 대소문자 상관없이
 */


public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong ="admin";
		String shim ="admin";
		String park =new String("admin");
		
		if (hong==shim) {
			System.out.println("hong=shim");
		} else {
			System.out.println("hong=/=shim");
		}
		
		if (hong==park) {
			System.out.println("hong=park");
		} else {
			System.out.println("hong=/=park");
		}
		//new String 때문에 같지 않음
		
		if (hong.equals(park)) {
			System.out.println("hong=park");
		} else {
			System.out.println("hong=/=park");
		}
		
		String lee = "ADMIN";
		
		if (hong.equals(lee)) {
			System.out.println("hong=lee");
		} else {
			System.out.println("hong=/=lee");
		}
		
		if (hong.equalsIgnoreCase(lee)) {
			System.out.println("hong=lee");
		} else {
			System.out.println("hong=/=lee");
		}
		
	}

}
