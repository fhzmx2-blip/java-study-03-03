/*
 * 삼항연산자, 피연산자가 3개인 경우
 * (조건)?값1:값2
 * true는 1, false는 2
 * => 부정연산자 비교연산자 논리연산자
 */

import java.awt.desktop.AboutHandler;

public class 삼항연산자 {
	public static void main(String[] args) {
//		int num=(int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		String result=num%2==0?"짝":"홀";
//		System.out.println(num+" is "+result);
		
//		int num=(int)(Math.random()*2);
//		char c=num==0?(char)((int)(Math.random()*26)+65):
//				      (char)((int)(Math.random()*26)+97);
//		System.out.println(c);
//		
//		String result=(c>='A' && c<= 'Z')?"대":"소";
//		System.out.println(c+" is "+ result);
		
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		
		int max=num1<num2?num2:num1;
		max=num3<max?max:num3;
		
		int min=num1>num2?num2:num1;
		min=num3>min?min:num3;
		
		System.out.println("max:"+max+"min: "+min);
		
		String result = num3%3==0? "3의 배수":"3의 배수 아님";
		System.out.println(num3+" is "+result);
		
	}
}
