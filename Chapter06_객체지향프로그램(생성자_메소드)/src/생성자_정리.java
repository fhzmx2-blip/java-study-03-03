/*
 * 생성자
 * 1. 일반 메소드와 다름
 * 1)클래스명과 동일
 * 2) 리턴형이 없음, void
 * 3) 오버로딩 지원 
 * 		같은 이름의 메소드를 여러개 생성, 메소드명 동일, 리턴형 관계 X, 매개변수 갯수가 틀렸거나 데이터형이 다른 경우, 접근지정어(public, private 등...) 관계없다, 같은 클래스 안에서 생성
 * 
 * 		오버로딩, 데이터형이 틀렸을 때는 메소드형이 같은 다른 함수로 자동으로 인식?
 * 		함수 이름은 같지만 매개변수의 구성(타입, 개수, 순서)이 다른 여러 함수를 정의하고, 호출 시 인자에 맞는 함수를 컴파일러가 선택하는 것
 * 2. 역할
 * 멤버 변수 초기화, 시작과 동시에 처리
 * 네트워크/크롤링/데이터베이스/화면UI
 * 웹, 스프링ai
 * 클래스를 메모리에 저장하는 경우
 * 
 * 웹페이지를 켰을 때 첫 페이지가 뜨는 것을 생각해보면, 첫페이지를 불러오는 경우를 생각해볼 것
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

class A{
////	A(){
////		System.out.println("생성자 호출");
////	}
//	A(int a) {
//		System.out.println("호출");
//	}
	int a, b;
}

public class 생성자_정리 {
	public static void main(String[] args) {
		A a = new A();
		a.a=3;
		a.b=4;
	}
}
