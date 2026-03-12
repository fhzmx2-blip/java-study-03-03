/*
 * 배열은 메모리 주소를 이용하는 프로그램
 * 주소에 있는 데이터가 손상될 수 있다
 * 
 * 결국 얕은 복사는 주소값의 복사일 뿐이고,
 * 깊은 복사는 값을 가져와서 아예 새로 쓰는 것과 같다
 */

import java.util.Arrays;

public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		System.out.println(alpha.length);
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((int)(Math.random()*26)+65);
		}
		
		for(char c:alpha) {
			System.out.print(c+" ");
		}
		
		System.out.println("\n"+Arrays.toString(alpha));
		
		alpha[0]='X';
		int i=0;
		for(char c='A';c<='J';c++) {
			alpha[i]=c;
			i++;
		}
		
		for(char c:alpha) {
			System.out.print(c+" ");
		}
	}

}
