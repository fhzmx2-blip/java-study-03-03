import java.util.Arrays;
import java.util.Random;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n[3]=new int[3];

		char[] c = new char[10];
		int[] n = new int[6];
		for(int i = 0; i<6;i++) {
			n[i]=i;
		}
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		boolean[] bool= {true, false, false, true};
		
		
		
		char[] alpha = {'a', 'b', 'c', 'd'};

		for (int i=0;i<=alpha.length-1;i++){
		     System.out.print(alpha[i]);
		}
		
		System.out.println();
		
		Random r = new Random();
		int[] a5 = new int[10];
		for (int i=0; i<10; i++) {
			a5[i]=r.nextInt(100)+1;
		}
		for (int i:a5) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		int[] a6 = new int[10];
		for (int i=0; i<10; i++) {
			a6[i]=r.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(a6));
		int total=0;
		for (int i=0; i<10; i++) {
			total+=a6[i];
		}
		double avg = total/10.0;
		System.out.println(avg);
		
		int[] a7_1 = new int[5];
		for (int i=0; i<5; i++) {
			a7_1[i]=r.nextInt(100)+1;
		}
		for (int i:a7_1) {
			System.out.print(i+" ");			
		}
		
		char[] a7_2 = new char[10];
		for (int i=0; i<10; i++) {
			a7_2[i]=(char)(r.nextInt(65,90));
		}
		for (char i:a7_2) {
			System.out.print(i);			
		}
		
		System.out.println();
		
		int[] a7_3 = new int[10];
		for (int i=0; i<10; i++) {
			a7_3[i]=r.nextInt(100)+1;
		}
		System.out.println(a7_3[2]+" "+a7_3[4]+" "+a7_3[9]);
		
		System.out.println();
		
		int[] a7_4 = new int[10];
		for (int i=0; i<10; i++) {
			a7_4[i]=r.nextInt(100)+1;
		}
		int max = 0;
		for (int i=0;i<a7_4.length;i++) {
			if (max<a7_4[i]) {
				max=a7_4[i];
			}
		}
		System.out.println(max);
		
		System.out.println();
		
		int[] a8 = new int[10];
		for (int i=0; i<10; i++) {
			a8[i]=r.nextInt(100)+1;
		}
		int total8=0;
		for (int i=0; i<10; i++) {
			total8+=a8[i];
		}
		double avg8 = total8/10.0;
		System.out.println(total8);
		System.out.println(avg8);
		
		System.out.println();
		
		int[] a8_2 = new int[5];
		for (int i=0; i<5; i++) {
			a8_2[i]=r.nextInt(100)+1;
		}
		Arrays.sort(a8_2);
		System.out.println(Arrays.toString(a8_2));
		
		
		
		System.out.println(Arrays.toString(a8));

		
	}

}
