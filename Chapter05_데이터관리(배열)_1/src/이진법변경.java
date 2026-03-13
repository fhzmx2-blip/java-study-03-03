import java.util.Scanner;

public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] binary = new int[16];
		int index=15;
		
		System.out.print("0~32767까지의 정수 입력: ");
		int num =scan.nextInt();
		
		System.out.println("라이브러리: "+Integer.toBinaryString(num));
		System.out.println("라이브러리: "+Integer.toOctalString(num));
		System.out.println("라이브러리: "+Integer.toHexString(num));
		
		while(true) {
			binary[index]=num%2;
			
			num=num/2;
			
			if(num==0) {
				break;
			}
			index--;
		}
		
		for (int i=0; i<binary.length;i++) {
			if (i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
			
		}
	}

}
