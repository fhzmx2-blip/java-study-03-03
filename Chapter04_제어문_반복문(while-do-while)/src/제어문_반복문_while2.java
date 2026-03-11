/*
 * 
 */

import java.util.Scanner;

public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력: ");
		int dan = scan.nextInt();
		int i=1;
		while(i<=9) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan*i);
			i++;
		}
	}

}
