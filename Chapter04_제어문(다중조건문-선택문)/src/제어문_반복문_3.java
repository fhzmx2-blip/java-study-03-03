
public class 제어문_반복문_3 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			System.out.println(i+"+"+sum);
			sum+=i;
		}
		System.out.println(sum);
	}
}
