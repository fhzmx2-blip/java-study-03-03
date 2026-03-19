/*
 * CallByValue와 callByReference의 차이
 * 
 * 모든 클래스와 배열 Call By Reference
 * 
 * 
 */

class Value{
	int a;
	int b;
}
//결국 값에 영향을 끼치려면 같은 주소값을 사용하게 해서 값을 같이 제어하게 해야...
// 그러려면 배열이나 클래스로 만들어야 함
// CallByValue는 메소드에서 새로운 메모리를 만들어서 쓰는거고,
// CallByReference는 같은 메모리를 건드리는거

class CallByValue{
	void swap(int a, int b) {
		System.out.println("변경 전: a="+a+", b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경 후: a="+a+", b="+b);
	}
	void swap2(String s1, String s2) {
		System.out.println("변경 전: s1="+s1+", s2="+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("변경 후: s1="+s1+", s2="+s2);
	}
}

class CallByReference{
	void swap(int[] arr) {
		System.out.println("수행전 arr[0]="+arr[0]+", arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[0];
		System.out.println("변경 후: arr[0]="+arr[0]+", arr[1]="+arr[1]);
	}
	void swap2(Value v) {
		System.out.println("v.a="+v.a+", v.b="+v.b);
		int temp=v.a;
		v.a=v.b;
		v.b=temp;
		System.out.println("변경 후 v.a="+v.a+", 변경 후 v.b="+v.b);
	}
}

class Test{
	int a=10;
	void display() {
		System.out.println("Test:display Call...");
		System.out.println("a="+a);
		a++;
	}
}

public class 메소드_2 {
	public static void main(String[] args) {
		CallByValue call = new CallByValue();
		int a=10;
		int b=20;
		
		call.swap(a, b);
		System.out.println("변경 후: a="+a+", b="+b);
		
		String s1="홍길동";
		String s2="심청이";
		
		call.swap2(s1, s2);
		System.out.println("변경 후: s1="+s1+", s2="+s2);
		
		CallByReference cr = new CallByReference();
		int[] arr= {10, 20};
		cr.swap(arr);
		System.out.println("변경 후: arr[0]="+arr[0]+", arr[1]="+arr[1]);
		
		int[] data= {10,20};
		int[] copy=data;
		System.out.println("copy="+copy);
		System.out.println("data="+data);
		
		int[] copy2=data.clone();
		System.out.println("copy2"+copy2);
		System.out.println("data"+data);
		
		Value v = new Value();
		v.a=100;
		v.b=200;
		cr.swap2(v);
		System.out.println("변경 후 v.a="+v.a+", 변경 후 v.b="+v.b);
		
		new Test().display();
		new Test().display();
		new Test().display();
		
		Test t=new Test();
		t.display();
		t.display();
		t.display();
		
		//생성자는 new 필수
	}
}
