/*
 * 관리가 쉽고 고정적이다. 한 번 설정하면 변경이 불가능
 * 1. 배열선언
 * 2. 배열 초기화
 * 		선언과 동시에 초기화
 * 		int[] arr ={1, 2, 3, 4, 5} => 명시적 초기화
 * 			=> 값을 아는 경ㅇ
 * 		= 값을 모를 때는,
 * 			파일 읽기, 데이터베이스 읽기, 크롤링, 임의로 추출(랜덤), 입력값
 * 3. 배열 출력
 * 4. 배열 데이터 변경
 */

import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong="홍길동";
		String shim="심청이";
		String kim="김두한";
		String lee="이순신";
		String kang="강감찬";
		
		System.out.println(hong);
		System.out.println(shim);
		System.out.println(kim);
		System.out.println(lee);
		System.out.println(kang);
		
		String[] names = { "홍길동","심청이","김두한","이순신","강감찬"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		System.out.println(Arrays.toString(names));
		

	}

}
