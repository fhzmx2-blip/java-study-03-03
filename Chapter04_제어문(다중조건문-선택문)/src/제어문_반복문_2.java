import java.util.Random;
import java.util.Scanner;

public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int com=r.nextInt(100)+1;
		
		for(;;) {
			System.out.print("1~100 사이 정수 입력: ");
			int user=scan.nextInt();
			System.out.println("user input: "+user);
			if(com>user) {
				System.out.println("입력값보다 큰 수를 입력");
			}
			else if(com<user) {
				System.out.println("입력값보다 작은 수를 입력");
			}
			else if(com==user) {
				System.out.println("같은 값\nGame over");
				System.exit(0);
			}
			else {
				System.out.println("알 수 없는 오류");
				System.exit(0);
			}
		}
	}

}
