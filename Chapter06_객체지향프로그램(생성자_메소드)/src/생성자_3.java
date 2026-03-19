class Student{
	int hakbun;
	String name;
	int kor, eng, math;
	Student(int h, String n, int k, int e, int m){
		hakbun=h;
		name=n;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int hakbun, String name){
//		// 지역변수 우선순위에 의해 0와 null
//		hakbun=hakbun;
//		name=name;
		this.hakbun=hakbun;
		this.name=name;
	}
}

public class 생성자_3 {
	public static void main(String[] args) {
		Student hong = new Student(1, "홍길동", 90, 90, 90);
		Student shim = new Student(2, "심청이", 90, 90, 90);
		Student park = new Student(3, "박문수", 90, 90, 90);
		System.out.println(hong.hakbun+" "+hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math);
		System.out.println(shim.hakbun+" "+shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math);
		System.out.println(park.hakbun+" "+park.name+" "+park.kor+" "+park.eng+" "+park.math);

		Student lee=new Student(4, "이순신");
		System.out.println(lee.hakbun+" "+lee.name);
		System.out.println(lee);
	}
}
