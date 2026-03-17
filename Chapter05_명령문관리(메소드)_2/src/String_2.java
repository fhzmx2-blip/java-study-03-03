/*
 * String은 변경불가, final
 */
import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject= {
			"혼자 배우는 자바",
			"자바 AND Spring",
			"기본 자바",
			"이것이 자바",
			"Java AND JSP",
			"Oracle AND Java",
			"자바로 시작한 JSP",
			"JSP AND 자바"
		};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력: ");
		String fd=scan.next();
		
		for (String data:subject) {
			if(data.startsWith(fd)) {
				System.out.println(data);
			}
		}
		
		for (String data:subject) {
			if(data.endsWith(fd)) {
				System.out.println(data);
			}
		}
	}

}
