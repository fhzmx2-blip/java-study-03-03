import java.util.Scanner;

public class 제어문_선택문_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 스캐너는
		 * 		정수 nextInt
		 * 		실수 nextDouble
		 * 		문자열 next(공백 이후의 문자열은 안받음), nextLine(공백 포함 전체 문자열)
		 * 을 받음
		 */
//		System.out.print("문자열 입력: ");
//		String msg = scan.nextLine();
//		System.out.println(msg);

		System.out.print("월 입력: ");
		int month = scan.nextInt();		
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2: 
			System.out.println("겨울");
			break;
		default:
			System.out.println("없는 계절");
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
