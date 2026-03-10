/*
 * 
 */

public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*100)+1;
		System.out.println(num+"은(는)");
		
		if (num%3==0) {
			System.out.println("3의 배수임");
		}
		if (num%5==0) {
			System.out.println("5의 배수임");
		}
		if (num%7==0) {
			System.out.println("7의 배수임");
		}
		
		if (num%3!=0 && num%5!=0 && num%7!=0) {
			System.out.println("3도 5도 7의 배수도 아님");
		}

	}

}
