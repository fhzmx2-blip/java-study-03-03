/*
 * 객체지향 => 설계
 * 요구사항 분석
 * 객체 도출(생성)
 * 클래스마다 역할 / 책임 (단일 책임)
 * 관계설정
 * 구현 => 리팩토링
 * 실행
 * 
 * 객체시향의 4대 특성
 * 데이터 보호
 * 유지보수 용이
 * 코드 안정성 향상
 * 구현
 * 
 * 웹에서는 시큐어 코딩 (private)
 * 
 * 상속 extends
 * 상속 내리는 클래스는 부모 클래스 / 슈퍼 클래스/ 베이스클래스
 * 
 * 상속 받는 클래스는 자식 클래스 / 서브 클래스 / 파생 클래스
 * 
 * 1) 자동 형변환
 * 사람 a = new 남자();
 * 사람 b = new 여자();
 * 
 * 남자 a = new 여자(); => 오류
 * 남자 a=(남자)new 사람();
 * 2) 단일 상속
 * A
 * |
 * B=>A
 * |
 * C=>A,B
 * 
 * 다중상속은 없음. A와 B가 같은 층위에서 동시 상속은 불가
 */

package com.sist.main;

import java.util.ArrayList;

class Super{
	int a, b, c;
	public void display() {
		System.out.println("Super:display() Call");
	}
}
class Sub extends Super{
	// int a, b, c;
	//  ㄴ눈에는 안보이지만 상속했기 때문에 존재한다.
	int d;
	// display() => 변경 / 그대로
	// 변경이 바로 오버라이딩
	public void display() {
		System.out.println("Sub:display() Call");
	}
}

public class 재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println("sub.a="+sub.a);
		System.out.println("sub.b="+sub.b);
		System.out.println("sub.c="+sub.c);
		System.out.println("sub.d="+sub.d);
		Super su = new Super();
//		System.out.println("su.d="+su.d);
		//불가능. 왜냐면 d가 없으니
		su.display();
		Super s = new Sub();
		s.display();
		Sub ss = (Sub)s;
		ss.display();
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o = list.get(3);
		
		Sub sss=(Sub)list.get(3);
	}

}
