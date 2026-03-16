/*
 *  반복 제거, 관리 용이, 소스 간결, 재사용 가능 
 * 	return하는 것과 void하는 것 구별
 *   
 */

public class 메소드_1 {
	
	static void sum() {
		int hap=0;
		for(int i=1;i<=10;i++) {
			hap+=i;
		}
		return; // 생략 가능
	}
	static int sum2(int n) {
		int hap=0;
		for(int i=1;i<=n;i++) {
			hap+=i;
		}
		return hap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		int a=sum2(20);
		System.out.println(a);
	}

}
