class Member{
	int mno;
	String name;
	static String company="Daum";
}

public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		m1.mno=100;
		m1.name="홍길동";
		Member m2 = new Member();
		m2.mno=200;
		m2.name="심청이";
		Member m3 = new Member();
		m3.mno=300;
		m3.name="박문수";
		
		System.out.println("회원1 번호: "+m1.mno);
		System.out.println("회원1 이름: "+m1.name);
		System.out.println("회원2 번호: "+m2.mno);
		System.out.println("회원2 이름: "+m2.name);
		System.out.println("회원3 번호: "+m3.mno);
		System.out.println("회원3 이름: "+m3.name);
		
		m1.name="홍길수";
		System.out.println("회원1 이름: "+m1.name);
		
		System.out.println(m3.company);
		m3.company="Kakao";
		System.out.println(m3.company);
		System.out.println(m1.company);
		//static은 한군데만 바꿔도 다 바뀜
	}
}
