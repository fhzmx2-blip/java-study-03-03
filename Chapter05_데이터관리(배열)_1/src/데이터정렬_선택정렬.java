import java.util.Arrays;
import java.util.Random;

public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int arr[] = new int[5];
		for (int i=0; i<5;i++) {
			arr[i]=r.nextInt(100);
		}		
		
		
		System.out.println("정렬 전: ");
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("정렬 후: ");
		for (int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		for(int i:arr) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
