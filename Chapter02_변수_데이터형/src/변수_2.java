import java.util.Scanner;

public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사과 5개
		 * 사과 2개를 먹었다
		 * 남은 사과 갯수
		 */
		
		int apCount = 5;
		int apEaten = 2;
		int finalApCount = apCount - apEaten;
		
		System.out.println("남은 사과: "+finalApCount);
		
		/*
		 * 국어 80
		 * 영어 90
		 * 수학 70
		 * -------------평균
		 */
		
		/*int kor = 80;
		int eng = 90;
		int math =70;
		
		int averageScore = (kor+eng+math)/3;
		
		System.out.println("평균점수: "+averageScore);*/
		
		Scanner scan = new Scanner(System.in);
		//System.in은 키보드 입력을 지시하기 위함
		//공백 / 엔터 
		System.out.println("국어 영어 수학 (90 90 90)");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		System.out.println("총점: "+(kor+eng+math));
		
		System.out.printf("평균점수:%.2f ", (kor+eng+math)/3.0);

	}

}
