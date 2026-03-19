import java.io.FileReader;

class Sawon{
//		int sabun;
//		String name;
//		String dept;
//		String job;
//		String loc;
		
		int sabun=100;
		String name="홍길동";
		String dept="어느부서";
		String job="대리";
		String loc="서울";
		FileReader in= new FileReader("\\|) ' 
		
	}

public class 생성자_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		System.out.println("데이터 저장 위치: "+s1);
		System.out.println("sabun: "+s1.sabun);
		System.out.println("sabun: "+s1.name);
		System.out.println("sabun: "+s1.dept);
		System.out.println("sabun: "+s1.job);
		System.out.println("sabun: "+s1.loc);
		
		Sawon s2=new Sawon();
		System.out.println("데이터 저장 위치: "+s2);
		System.out.println("sabun: "+s2.sabun);
		System.out.println("sabun: "+s2.name);
		System.out.println("sabun: "+s2.dept);
		System.out.println("sabun: "+s2.job);
		System.out.println("sabun: "+s2.loc);
		
	}

}
