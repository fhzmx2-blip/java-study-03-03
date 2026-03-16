import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class 문제풀이 {

	static boolean sameIdCheck(String id) {	}
	static String searchingAdressNumber(String address) {	}
	static String gugudan() {	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		문제1();
		문제2();
		문제3(100);
		문제4(4, 5);
		문제5('h');
		문제6();
		
		int a = 문제4_1_1();
		int[] b = 문제4_1_2(a);
		문제4_1_3(b);
		
		문제2_1();
		
		문제3_1();
	}
	
	
	
			
	static void 문제1() {
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	static int 문제2() {
		int a=0;
		for (int i=1;i<=10;i++) {
			a+=i;
		}
		System.out.println(a);
		return a;
	}
	
	static int 문제3(int n) {
		int a=0;
		for (int i=1;i<=n;i++) {
			a+=i;
		}
		System.out.println(a);
		return a;
	}
	
	static double 문제4(int a, int b) {
		double c= a/(double)b;
		System.out.println(c);
		return c;
	}
	
	static char 문제5 (char c) {
		if ('a'<=c && c<='z') {
			c = (char)(c-32);
		}
		System.out.println(c);
		return c;
	}
	
	static void 문제6() {
		for (char i=90;i>=65;i--) {
			System.out.println(i);
		}
	}
	
	
	
	
	static int 문제4_1_1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("2진법 변환할 수 입력");
		return scan.nextInt();
	}
	
	static int[] 문제4_1_2(int a) {
		int[] binary = new int[16];
		int index=15;
				
		while(true) {
			binary[index]=a%2;
			
			a=a/2;
			
			if(a==0) {
				break;
			}
			index--;
		}
		return binary;
	}
	
	static void 문제4_1_3(int[] binary) {
		for (int i=0; i<binary.length;i++) {
			if (i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	
	
	public static void 문제2_1() {
		int[] list = 정수입력();
		System.out.println();
		출력(list);
		System.out.println();
		정렬처리(list);
		출력(list);
	}
	
	static void 출력(int[]list) {
		System.out.println(java.util.Arrays.toString(list));
	}
	
	static void 정렬처리(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
	
	static int[] 정수입력() {
		Random r = new Random();
        int[] list = new int[5]; // 5개 요소
        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(10);
        }
        return list;
	}
	

	
	static boolean 문제3_1() {
		int year=문제3_1_1();
		boolean a = 문제3_1_2(year);
		문제3_1_1(a);
		return a;
	}
	
	static int 문제3_1_1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력");
		return scan.nextInt();
	}
	
	static boolean 문제3_1_2(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
	    } else {
	    	return false;
	    }
	}
	static void 문제3_1_1(boolean a) {
		if (a) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}
		
}
