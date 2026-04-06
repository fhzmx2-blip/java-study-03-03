package com.sist.lambda;

@FunctionalInterface
interface Calc{
	int calc(int a, int b);
	
	default int sum(int a, int b) {
		return a+b;
	}
}

public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc add=(a,b)->a+b;
		Calc minus=(a,b)->a-b;
		Calc multiply=(a,b)->a*b;
		Calc div=(a,b)->a/b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(10, 20));
		System.out.println(multiply.calc(10, 20));
		System.out.println(div.calc(10, 3));
	}

}
