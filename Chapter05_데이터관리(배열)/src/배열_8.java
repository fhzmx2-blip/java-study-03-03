/*
 * 컴퓨터랑 가위바위보 10번 하기
 */

import java.util.Scanner;

public class 배열_8 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int win=0, lose=0, same=0;
		String[] res= {"가위", "바위", "보"};
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<10;i++) {
			int com=(int)(Math.random()*3);
			System.out.println("가위0 바위1 보2");
			int user = scan.nextInt();
			if (user<0 || user>2) {
				System.out.println("잘못된 입력");
				i--;
				continue;
			}
			System.out.println("컴퓨터: "+res[com]);
			System.out.println("사용자: "+res[user]);
			
			int r=com-user;
			if (r==-1 || r==2) {
				win++;
			}
			else if (r==1 || r==-2) {
				lose++;
			}
			else {
				same++;
			}
		}
		System.out.printf("결과: %d승 - %d무 - %d패", win, same, lose);
//		for (int i=0; i<10;i++) {
//			System.out.print("가위0 바위1 보2");
//			int user = scan.nextInt();
//			System.out.println("컴퓨터: "+res[com]);
//			System.out.println("사용자: "+res[user]);
//			System.out.println("=====결과값====");
//			int r=com-user;
//			if (r==-1 || r==2) {
//				System.out.println("승리");
//			}
//			else if (r==1 || r==-2) {
//				System.out.println("패배");
//			}
//			else {
//				System.out.println("비김");
//			}
//		}
	}

}
