
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		for (int i=1;i<=10;i++) {
			if (i%2!=0) {
				a=a+i;
			}
			else {
				a=a-i;
			}
		}
		System.out.println(a);
		
		for (int i=1;i<=10;i++) {
			if(i%3!=0) {
				System.out.println(i);
			}
		}
		
		for (int i=1;i<=10;i++) {
			if (i%2==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		double sum = 0.0;
		double plusMinus = 1.0;
		
		for (int i=0; i<1000000; i++) {
			double denominator = 2*i+1;
			sum += plusMinus*(1.0/denominator);
			plusMinus *= -1; 
		}
		
		double pi = sum*4;
		System.out.println(pi);
	}

}
