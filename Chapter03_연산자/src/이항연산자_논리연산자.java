/*
 * 논리연산자 결과값은 boolean 트루 오어 퍼스
 * 
 * => 최적화 연산자
 * => 연산기호
 * 		&& And
 * 		|| Or
 */

public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		boolean res = x>10 || ++y==x;
		System.out.println(res);
		System.out.println(y);
	}

}
