
public class 변수_5 {
	public static void main(String[] args) {
//		int kor = 100;
//		int eng = 100;
//		int math = 100;
//		
//		int totalScore = (kor+eng+math);
//		double average = (totalScore/3.0);
//		
////		double average*4.5/100 
//		
//		String alphabetScore = "A+";
//		int drink=12;
//		
////		drink=drink-5;
//		drink-=5;
//		
//		System.out.println("남은 음료수: "+drink);
		/*
		 * 샌드위치==> 250kcal
		 * 사과 ==> 100kcal
		 * 쥬스 ==>150kcal
		 * 
		 * 샌드위치 1개, 사과 2개, 쥬스 1잔
		 * => 총 칼로리
		 */
		
		int sandwitch = 250;
		int apple = 100;
		int juice = 150;
		
		System.out.println(sandwitch*1+apple*2+juice*1);
		
		/*
		 * 이름: 홍길동
		 * 성별: 남성
		 * 나이: 20
		 * 키 : 180.5
		 * 카드 보유 여부: X
		 * 
		 * 장바구니
		 * 우유 = 1200 => 2개
		 * 빵 = 1500 => 3개
		 * 계란 =200 => 10개
		 * -----------------------------------
		 */
		
		String name = "홍길동";
		String gender = "남성";
		int age = 20;
		double height = 180.5;
		boolean havingCard = false;
		
		int costMilk = 1200;
		int costBread = 1500;
		int costEgg = 200;
		
		int buyingMilk = 2;
		int buyingBread = 3;
		int buyingEgg = 10;
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(height);
		System.out.println(havingCard);
		
		System.out.println(costMilk*buyingMilk+costBread*buyingBread+costEgg*buyingEgg);
	}

}
