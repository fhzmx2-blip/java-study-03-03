/*
 * 인터페이스
 * 1. 기능을 정해둔다
 * => 표준화
 * 2. 인터페이스 사용
 * 1) 이미 어떤 걸 구현해야하는지 알고 있다
 * 2) 여러 개발자가 동시에 개발
 * 		=> 이 기능은 반드시 구현
 * 3) 내부 구현이 변경 => 메소드는 반드시 유지
 */
import java.util.*;
interface I{
	int a=100;
	//public static final 자동 첨부
	void display();
	default void aaa();{}
}
interface II{
	void display();
	//void 앞에 public이 있음으로 간주됨을 숙지
	default void aaa();
	//디펄트 보이드는 이미 구현되어서 따로 추가할 필요X
}
class A implements II{
	public void display() {}

}
class B implements II{
	public void display() {}
	public void aaa() {}
}

class C implements II{
	public void display() {}
}

class D implements II{
	public void display() {}
}


public class 인터페이스_1 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("심청이");
		for (String name:list) {
			System.out.println(name);
		}
	}
}
