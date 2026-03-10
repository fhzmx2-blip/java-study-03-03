/*
 * 변수의 정의 : 하나의 값을 저장할 수 있는 메모리 주소의 별칭
 * 			  -------
 * RAM => 주소 (주소마다 => 데이터 저장)
 *  | 각 => 4byte (0~2140000) => 저장된 위치 기억
 *  
 *  저장 크기
 *  1 byte / 2 byte / 4 byte / 8 byte => 기본형
 *  
 *  지역변수
 *  =>  stack 공간에 저장
 *  => {변수 선언} =>  지역변수
 *  				------- {}이 종료되면 자동 해제 => 메모리 자체 관리
 *  *** 변수 사용시에는 반드시 어떤 종류의 값을 저장할 지 미리 지정해야 된다
 *  
 *  캐멀스타일
 *  
 *  변수 선언
 *  int kor;
 *  int eng;
 *  
 *  int kor, eng, math;
 *  
 *  변수의 초기값
 *  kor=100;
 *  eng=90;
 *  math=80;
 *  
 *  프로그램에서 사용 => 초기값이 없는 상태에서는 오류 발생
 *  
 *  변수명
 *  1) 길이 제한은 없으나 적당히
 *  2) 변수명에 i나 j는 쓰지 않음(필기체로 변하면 구분 힘듦)
 *  
 *  => 변수 : 변하는 수 => 수정 / 저장 /읽기
 *  
 *  각 데이터형마다
 *  초기값
 *  
 *  byte b=100 (127 초과하지 않으면 된다)
 *  byte b1=10;
 *  byte b2=20;
 *  byte b3=b1+b2; //오류발생 byte b3이 아니라 int b3으로 받았어야
 *  
 *  
 *  int
 *  long
 *  double
 *  float
 *  float => 4byte => double 구분
 *  		10.5F / 10.5D (10.5라고만 적으면 F가 아니라 D로 취급)
 *  
 *  char	=> 문자를 저장
 *  		=>0~65535 ==> 멀티바이트 2바이트 => 유니코드
 *  		=>각국의 언어 표현이 가능
 */

import java.io.FileReader;

public class 변수_4 {
	
	public static void main(String[] args) throws Exception{
//		System.out.println((int)'A');
		FileReader fis = new FileReader("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_1.java");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		double d='A';
		int k='A';
		String addr="주소어쩌구";
	}
	
}
