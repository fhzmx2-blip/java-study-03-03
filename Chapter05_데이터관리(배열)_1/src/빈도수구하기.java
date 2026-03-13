import java.util.Arrays;

public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[45];
		for(int i=1;i<=1000;i++) {
			int rand=(int)(Math.random()*45);
			arr[rand]++;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"==>"+arr[i]);
		}
		
	}

}
 