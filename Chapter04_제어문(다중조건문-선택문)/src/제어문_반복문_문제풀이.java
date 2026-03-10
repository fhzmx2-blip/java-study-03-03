import java.util.Scanner;

public class 제어문_반복문_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1
		int a1 = 0;
		
		for (int i =0; i<=100; i+=2) {
			a1+=i;	
		}
		System.out.println(a1);
		
		//문제2
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력:");
		int a2 = scan.nextInt();
		int b2 = 0;
		
		for (int i=0; i<=a2; i++) {
			b2+=i;
		}
		System.out.println(b2);
		
		//문제3
		for (int i =1; i<=50; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		
		//문제4
		int a4 = 0;
		
		for (int i =1; i<=100; i++) {
			if (i%7==0) {
				a4++;
			}
		}
		System.out.println(a4);
		
		//문제5
		String str = "JavaProgramming";
		for(int i=0;i<=str.length()-1;i++) {
			System.out.println(str.charAt(i));
		}
		
		//문제6
		int i6=0;
		while (i6<10) {
			i6++;
			System.out.println(i6);
		}
		
		//문제7
		System.out.print("a7값: ");
		int a7 = scan.nextInt();
		
		int i7=0;
		while (i7<a7) {
			i7++;
			System.out.println(i7);
		}
		
		//문제8
		for (int i =1; i<=100; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		
		//문제9
		int a9 = 0;
		
		for (int i =1; i<=100; i++) {
			if (i%5==0) {
				a9+=i;
			}
		}
		System.out.println(a9);
		
		//문제10
		for (int i =10; i>=1; i--) {
			System.out.println(i);
		}
	}

}
