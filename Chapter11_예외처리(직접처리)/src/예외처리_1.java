/*
 * 
 */

class A{
	
}
class B extends A {
	
}

public class 예외처리_1 {
	String msg; 
	public static void main(String[] args) {
//		예외처리_1 a = new 예외처리_1();
//		예외처리_1 a=null;
//		a.msg.substring(2);
		
		try {
		A a=new A();
		B b=(B)a;
		}catch(ClassCastException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//		Integer.parseInt(" 100 ".trim());
//		int[] arr=new int[2];
//		try {
//		arr[0]=10;
//		arr[2]=20;
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println(ex.getMessage());
//		}
//		System.out.println(arr[0]);
		
		
	}
	
}
