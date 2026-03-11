/*
 * 1~100까지 정수 중에 3의 배수 / 5의 배수 / 7의 배수 갯수
 */

public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0;
		
		for(int i=1;i<=100;i++) {
			if (i%3==0) {
				a3++;
			}
			if (i%5==0) {
				a5++;
			}
			if (i%7==0) {
				a7++;
			}
		}
		
		System.out.println("100까지의\n"+"3의 배수 갯수: "+a3+"\n5의 배수 갯수: "+a5+"\n7의 배수 갯수: "+a7);
		
		
		
		//	문제1. 1~100 사이에 짝수합 / 홀수합
		
		int odd=0;
		int even=0;
		
		for(int i=1;i<=100;i++) {
			if (i%2!=0) {
//				System.out.println(i+"+"+odd);
				odd=odd+i;
			}
			if (i%2==0) {
//				System.out.println(i+"+"+even);
				even=even+i;
			}
		}
		
		System.out.println("\n홀 "+odd+"\n짝 "+even);
		
		int numberRange = 10000;
		
		boolean[] isPrime = new boolean[numberRange+1];
		
		for (int i=2; i<=numberRange; i++) {
			isPrime[i]=true;
		}
		
		for (int p=2; p*p<=numberRange; p++) {
			if (isPrime [p] == true) {
				for (int i=p*p; i<=numberRange; i+=p) {
					isPrime[i]=false;
				}
			}
		}
		
		for (int i=2; i<=numberRange; i++) {
			if (isPrime[i]==true) {
				System.out.println(i);
			}
		}
		
		
	}

}
