class Student{
	int hakbun;
	String name;
	int kor=-1;
	int eng=-1;
	int math=-1;
	Student(int h, String n, int k, int e, int m){
		hakbun=h;
		name=n;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int hakbun, String name){
		this.hakbun=hakbun;
		this.name=name;
	}
}

public class practice {
	public static void main(String[] args) {
		Student hong = new Student(1, "홍길동", 90, 90, 90);
		Student shim = new Student(2, "심청이", 90, 90, 90);
		Student park = new Student(3, "박문수", 90, 90, 90);
		Student lee=new Student(4, "이순신");
		Student kim = new Student(5, "김두한", 0, 0, 0);
		Student[] studentList = {hong, shim, park, lee, kim};
		
		for (int i=0;i<studentList.length;i++) {
			if (studentList[i].kor+studentList[i].eng+studentList[i].math!=-3) {
				System.out.printf("%2d %s %2d %2d %2d\n",
					studentList[i].hakbun, 
					studentList[i].name, 
					studentList[i].kor, 
					studentList[i].eng, 
					studentList[i].math);
			} else {
				System.out.printf("%2d %s 미응시 \n",
						studentList[i].hakbun, 
						studentList[i].name);
			}
		}

//		System.out.println(lee);
	}
}
