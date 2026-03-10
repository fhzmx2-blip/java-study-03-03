
import java.util.Scanner;

public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("id 입력: ");
		String id = scan.next();
		
		System.out.print("password 입력: ");
		String pwd = scan.next();
		
//		if(id=="admin" && pwd=="1234") 이러면 주소값을 가져와서 로그인 불가
		if(id.equals("admin") && pwd.equals("1234")) {
			System.out.println("로그인되었습니다");
		}
		else {
			System.out.println("id나 password가 틀립니다");
		}

	}

}
