/*
 * 모든 프로그램 : 데이터 + 메서드
 * 
 * 메소드
 * 	역할
 * 	클래스와 클래스의 연결(통신) 매개변수 주고 리턴현 받고
 *  반복제거
 *  구조적인 프로그램, 절차적 언어는 헌책방이고 객체지향은 대형서점 시스템
 *  메소드는 호출시마다 {부터 }까지 수행하고 호출한 위치로 복귀
 *  
 *  리턴형은 1개만을 출력 가능
 *  메소드명은 타인이 봐도 알아볼 수 있게(코드 컨벤션, 네이밍 컨벤션)
 *  
 *  
 *  = 형식)
 *  [접근지정어][제어어] 리턴형 메소드명(매개변수){
 *  	구현
 *  	return 결과값
 *  }
 *  
 *  static 메소드 => 한 개의 메모리 안에 저장해서 값을 공유
 *  instance 메소드 => 각각의 메모리 안에 저장해서 개별 값 저장 가능
 */

/*
 * 		aaa(int a, char c, int b)
 * 		aaa(int a, int c, float b)
 * 		aaa(double a, char c, char b)
 * 		aaa(char a, char c, char b)
 * 		aaa(int a, double c, char b)
 * 
 * 		aaa(10.5,10,10)		double int int
 * 		일치하는 값이 없기에 가장 가까운 값, aaa(double a, char c, char b)로 인식하게 됨
 * 		아주 다른 값 true나 false가 나오면 가까운 값이 없어서 인식 못하게 될 수 있음
 * 		
 */

class Methods{
	int a =10;
	String name = "홍길동";
	static int b=20;
	
	static void display() {
		System.out.println("Commons Methods");
	}
	//위와 아래는 다른 생성자
	void display(int a) {
		System.out.println("Instance Method");
	}
}

public class 메소드_1 {
	
	public static void main(String[] args) {
//		Methods m = new Methods();
		System.out.println("b="+Methods.b);
		Methods.display();
		
		Methods m = new Methods();
	}
}
