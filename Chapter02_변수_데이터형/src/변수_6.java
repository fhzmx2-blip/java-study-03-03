/*
 * String : 문자열 여러개를 한번에 저장할 수 있는 참조형 데이터형
 * ---------------------------------------------------
 * 형식) String 변수명=""
 * 		=> 웹 가장 많이 사용되는 데이터형
 * 		=> 클래스형으로 사용이 가능 => 기능 사용
 * 
 * => 문자열 결합
 * +가 산술 연산을 할지 결합을 할지 생각해서 쓸 것
 * 
 * boolean
 * true나 false를 반환함. 크기 비교는 불가.
 * 
 * 
 */

public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
