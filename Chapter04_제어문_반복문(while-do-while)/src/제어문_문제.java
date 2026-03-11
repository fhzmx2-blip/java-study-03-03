import java.util.Scanner;

public class 제어문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("음양판별: ");
		int a1 = scan.nextInt();
		if(a1>0) {
			System.out.println("양수");
		}
		else if (a1<0) {
			System.out.println("음수");
		}
		else if (a1==0) {
			System.out.println("0");
		}
		else {
			System.out.println("입력오류");
		}
		
		System.out.println("3배수 판별: ");
		int a2=scan.nextInt();
		if (a2%3==0) {
			System.out.println("3의 배수");
		}
		else {
			System.out.println("배수아님");
		}
		
		System.out.println("절대값 판별: ");
		int a3=scan.nextInt();
		if (a3<0) {
			a3=a3*-1;
		}
		System.out.println(a3);
		
		System.out.println("윤년 판별: ");
		int a4 = scan.nextInt();
		if (a4%4==0 && a4%100!=0 || a4%400==0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("윤년 아님");
		}
		
		System.out.println("성적판별: ");
		int a5 = scan.nextInt();
		if (a5>=90) {
			System.out.println("A");
		}
		else if (a5>=80) {
			System.out.println("B");
		}
		else if (a5>=70) {
			System.out.println("C");
		}
		else if (a5>=60) {
			System.out.println("D");
		}
		else if (a5>=0 && a5<60) {
			System.out.println("F");
		}
		else {
			System.out.println("오류");
		}
		
		System.out.println("성적판별2: ");
		int a6 = scan.nextInt();
		String b6 = "미입력";
		switch(a6/10) {
		case 10, 9 -> b6="A";
		case 8 -> b6="B";
		case 7 -> b6="C";
		case 6 -> b6="D";
		default -> b6="F";
		}
		System.out.println(b6);
		
		System.out.println("정수 2개 입력");
		int a7 = scan.nextInt();
		int b7 = scan.nextInt();
		System.out.println("연산자 입력");
		String c7 = scan.next();
		int answer7 = 0;
		switch(c7){
		case "+" -> answer7=a7+b7;
		case "-" -> answer7=a7-b7;
		case "*" -> answer7=a7*b7;
		case "/" -> answer7=a7/b7;
		}
		System.out.println(answer7);
		
		int a8=0;
		for (int i=0;i<=100;i+=2) {
			a8+=i;
		}
		System.out.println(a8);
		

		for (int i=0;i<=50;i+=5) {
			System.out.print(i+" ");
		}		
		System.out.println();
		
		char a10='B';
		for (int i=0;i<=12;i+=2) {
			System.out.print(a10+" ");
			a10+=2;
		}
		System.out.println();
		
		System.out.println("n까지 덧셈");
		int a11=scan.nextInt();
		int b11=0;
		for (int i = 0; i<=a11;i++) {
			b11+=i;
		}
		System.out.println(b11);
		
		for (int i=1;i<=30;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				if (i%6==0) {
					System.out.println();
				}
			}
		}
		
		int a13=0;
		for (int i=0; i<=10; i++) {
			int j=1;
			if (i%2==0) {
				j=i*-1;
			}
			else {
				j=i*1;
			}
			a13=a13+j;
		}
		System.out.println(a13);
		
		for (int i=0; i<=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("10부터 99사이 무작위값 입력");
		int a15=scan.nextInt();
		if (a15/10==a15-(a15/10*10)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		System.out.println("월 입력");
		int a16 = scan.nextInt();
		if (1<=a16 && a16<=12) {
			switch(a16) {
			case 3, 4, 5 -> System.out.println("봄");
			case 6, 7, 8 -> System.out.println("여름");
			case 9, 10, 11 -> System.out.println("가을");
			case 12, 1, 2 -> System.out.println("겨울");
			}
		}
		else if ((1>a16 || a16>12)) {
			System.out.println("없는 달");
		}
		else {
			System.out.println("잘못된 입력");
		}
		
		int sum17=0, i17=1;
		while (i17<100) {
			if(i17%3 != 0) {
				i17++;
				continue;
		    }
			else sum17 += i17;
				i17++;
		}
		System.out.println(sum17);
		
		int sum18=0,i18=1;
		while (true) {
		if(i18==51) break;
		sum18+=i18;
		i18++;  
		} 
		System.out.println(sum18);

		
		
		
		

		
	}

}
