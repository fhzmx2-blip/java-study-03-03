
public class 제어문_중첩반복문_6 {
	public static void main(String[] args) throws Exception {
//		for (int i=1; i<=6;i++) {
//			int lotto = (int)(Math.random()*45)+1;
//			System.out.println(lotto);
//			Thread.sleep(1000);
//			System.err.println(lotto+" ");
//		}
		
//		for (int i=1; i<=4;i++) {
//			for (int j=1; j<=4-i;j++) {
//				System.out.print(" ");
//			}
//			for (int k=1; k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=4;i++) {
			for (int j=1; j<=4-i;j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=4;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*(4-i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
//		for (int i=1; i<=10; i++) {
//			for (int j=1; j<=10;j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
	}
}
