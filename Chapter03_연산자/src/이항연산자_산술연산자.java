/*
 * 결국 값의 범위는 계산에 정수단위를 썼는지 실수단위를 썼는지에 따라 결정된다는 것
 * 
 * 나머지값을 이용해서 변수값의 변화에 따른 일정행동 반복 패턴도 가능한 것이 아닌가?
 * 나머지 값의 +- 부호는 왼쪽에 있는 분자의 +-값을 따름
 * 나머지를 계산하는 연산자는 %
 * 
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		System.out.println(-5%-2);

	}

}
