import java.util.Random;

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		Random r = new Random();
		for(int i=0; i<arr.length;i++) {
			arr[i]=r.nextInt(100)+1;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n=========결과===========");
		int max=arr[0];
		int min=arr[0];
		
		for (int i:arr) {
			if(max<i) {
				max=i;
			}
			if(min>i) {
				min=i;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		//이건 왜 (int i:arr)으론 안되지?
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==max) {
				System.out.println("max는"+(i+1)+"번째자리");
			}
			if (arr[i]==min) {
				System.out.println("min는"+(i+1)+"번째자리");
			}
		}
		
	}

}
