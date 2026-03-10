/*
 * 	피연산자가 1개
 * 	증감연산자
 * 		= 전치연산자
 * 			++a
 * 			=> 증가를 먼저 => 나중에 다른 연산 수행
 * 		= 후치연산자
 * 			a++
 * 			=> 다른 연산 수행 => 증가
 * 
 * 		=> 정수 / 문자만 가능
 * 
 */

public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a =10;
//		int b=a++ + a++;
//		
//		System.out.println(a+", "+b);
		
		int a = 10;
		int b = a--;
		
		System.out.println(a+", "+b);
		
		
		

	}

}
