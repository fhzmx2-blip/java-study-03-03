/*
 * 	p38 변수명의 길이
 * 
 * 	p41 정수에 대한 설명
 * 
 * 	p43 정수표현법
 * 		n진법
 * 
 * 	p45 문자
 * 
 * 	p47 실수
 * 		float, double
 * 
 * 	p50 boolean
 * 
 * 	p51 String
 * 
 * 	p55 자동 형변환
 * 		큰 데이터 = 작은 데이터
 * 
 * 	p57	깅제 형변환
 * 		=> 실수 => 정수, 평균 : 정수 => 실수
 * 
 * p83 산술연산자
 * 
 * p90 비교연산자 => 결과값은 boolean
 * 
 * p93 논리연산자
 * 
 * p104 대입연산자
 * 
 * p105 삼항연산자
 */

public class 자바_연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;{
			int b=20;{
				int c=30;
				System.out.println(a+"\n"+b+"\n"+c);
			}
			System.out.println("\n"+a+"\n"+b);
		}
		System.out.println("\n"+a);

	}

}
