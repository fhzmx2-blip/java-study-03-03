/*
 *	생성자 => p.229
 *		=>본인 호출가능 
 *		=>this()=>자신의 생성자=>상속 super()
 *		=>this=>객체=>상속 내린 클래스 : super
 */

class Member2{
	int mno;
	String name;
	String address;
	
//	static {
//		name="심청이";
//	}
//	이건 사용 불가. static 메소드 내부에선 mno나 name 등 적어놓은 저 위치의 것들 사용 불가
//	static은 모든 곳에 사용 가능
	
	Member2() {
		mno=1;
		name="홍길동";
		address="서울";
	}
	
	Member2(String n){
		this();
//		생성자 안에서만 사용이 가능, 반드시 첫번째 줄에서 사용
//		중복코딩이 많은 경우
//		mno=145;
		name=n;
	}
	
	Member2(String n, String s){
		this(n);
		//this(n)은 처음에 저걸 불러온게 아니라 Member2(String n)의 값을 가져왔음에 주의
		name=n;
		address=s;
	}
}

public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1=new Member2();
		System.out.println("회원번호: "+m1.mno);
		System.out.println("이름: "+m1.name);
		System.out.println("주소: "+m1.address);
		Member2 m2=new Member2("심청이");
		System.out.println("회원번호: "+m2.mno);
		System.out.println("이름: "+m2.name);
		System.out.println("주소: "+m2.address);
		Member2 m3=new Member2("박문수", "부산");
		System.out.println("회원번호: "+m3.mno);
		System.out.println("이름: "+m3.name);
		System.out.println("주소: "+m3.address);
	}

}
