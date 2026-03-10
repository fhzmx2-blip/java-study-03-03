/*
 *  byte/long => 정수
 *  		| 큰데이터값이 있는 경우 => 금융권 / AI(빅데이터) / 학교
 *  | -128~127
 *  
 *  int / long
 *  
 *  데이터형
 *   = 기본형 : 자바에서 제공하는 데이터형
 *   = 참조형 : 사용자 정의
 *   		  ---------------- class
 *   
 *   급여 / 점수 = int
 *   평균 / 총점 = double
 *   
 *   큰 데이터에 작은 데이터형 대입 O 반대는 X
 *   
 *   byte < short < int < long < float < double
 * 		    char 
 */
public class 변수_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=Byte.MIN_VALUE;
		byte b2=Byte.MAX_VALUE;
		
		System.out.println("byte는 범위: "+b1+"~"+b2);
		
		long l1=Long.MIN_VALUE;
		long l2=Long.MAX_VALUE;
		
		System.out.println("long의 범위: "+l1+"~"+l2);
		
		short s1=Short.MIN_VALUE;
		short s2=Short.MAX_VALUE;
		
		System.out.println("Short의 범위: "+s1+"~"+s2);
		
		int i1=Integer.MIN_VALUE;
		int i2=Integer.MAX_VALUE;
		
		System.out.println("int의 범위: "+i1+"~"+i2);
		
		
		double d=10.5f;
		float f=(float)10.5;
	}

}
