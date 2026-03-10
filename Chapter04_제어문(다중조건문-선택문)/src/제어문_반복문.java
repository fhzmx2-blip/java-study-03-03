/*
 *	자바 반복문
 *	for, while, do~while 
 *
 *for (초기값; 조건식(true=>실행, false=>종료); 증가식) {
 */

public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		
//		for (;;) { //<= 이러면 무한 루프
//			System.out.println("hello");
//		}
		
		for (char c='A'; c<='Z';c++ ) {
			System.out.print(c);
		}
	}

}
