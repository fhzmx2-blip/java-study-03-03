/*
 * 
 */

import java.util.Scanner;

public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력: ");
		int dan = scan.nextInt();
		
		for (int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		System.out.println();
		
		for (int i=9; i>=1;i--) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		System.out.println();
		String str = "Hello Java";
		for (int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		for (int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		int a=0;
		int b=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z') {
				a++;
			}
			if(c>='a' && c<='z') {
				b++;
			}
		}
		
		System.out.println("\n"+a+"\n"+b);

	}

}
