/*
 * 
 */

public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단
		for (int i=1; i<=9;i++) {
			for (int j=2; j<=9;j++){
				System.out.printf("%d*%d=%2d\t", j, i, j*i);
			}
			System.out.println();
		}
	}

}
