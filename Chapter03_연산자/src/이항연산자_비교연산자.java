/*
 * =는 선언, 같다가 아님
 * ==같다
 * !=다르다
 * <
 * >
 * <=
 * >=
 * 
 * 문자열 사용은 권장하지 않는다
 * 
 * char는 모든 연산자를 사용하면 자동으로 정수형으로 변경
 * 'A' < 'B'
 * 65     66
 */

public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 6==7;
		System.out.println("b1="+b1);
		b1= 6!=7;
		System.out.println("b1="+b1);
		b1= 6<7;
		System.out.println("b1="+b1);
		b1= 6>7;
		System.out.println("b1="+b1);
		b1= 6<=7;
		System.out.println("b1="+b1);
		b1= 6>=7;
		System.out.println("b1="+b1);
		
		b1 = 'A'=='C';
		System.out.println("b1="+b1);
		b1= 'A'!='C';
		System.out.println("b1="+b1);
		b1= 'A'<'C';
		System.out.println("b1="+b1);
		b1= 'A'>'C';
		System.out.println("b1="+b1);
		b1= 'A'<='C';
		System.out.println("b1="+b1);
		b1= 'A'>='C';
		System.out.println("b1="+b1);
		
		boolean r1=false;
		boolean r2=true;
		
		b1 = r1==r2;
		System.out.println("b1="+b1);
		b1 = r1!=r2;
		System.out.println("b1="+b1);
		
		b1 = 'A'==66;
		System.out.println("b1="+b1);
		b1 = 'A'!=66;
		System.out.println("b1="+b1);
		
	}

}
