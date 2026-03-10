/*
 * 	계절
 * 	12 1 2 
 * 	3 4 5
 * 	6 7 8
 *  9 10 11
 */

import java.util.Scanner;

public class 제어문_다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		
		if(month==3||month==4||month==5) {
			System.out.println("봄입니다");
		}
		else if (month==6||month==7||month==8) {
			System.out.println("여름입니다");
		}
		else if (month==9||month==10||month==11) {
			System.out.println("가을입니다");
		}
		else if (month==12||month==1||month==2) {
			System.out.println("겨울입니다");
		}
		else {
			System.out.println("없는 달입니다");
		}
		
		switch(month) {
			case 3, 4, 5 -> System.out.println("봄");
			case 6, 7, 8 -> System.out.println("여름");
			case 9, 10, 11 -> System.out.println("가을");
			case 12, 1, 2 -> System.out.println("겨울");
			default -> System.out.println("없는 계절");
		}
	}

}
