import java.util.Random;
import java.util.Scanner;

public class 숫자야구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int[] com = new int[3];
		int[] user = new int[3];
		
		for (int i = 0; i < 3; i++) {
			com[i] = r.nextInt(9) + 1;
			
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
		
		while (true) {
			System.out.println("3개 입력");
			int input = scan.nextInt();
			if (input<100 || input>999) {
				System.out.println("😣 잘못된 입력");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("😣 같은 수 사용 불가");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("😣 0 사용 불가");
				continue;
			}
			
			int s=0, b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if (i==j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			System.out.printf("Input Number: %d, Result:%dS-%dB\n", input, s, b);
			
			if (s==3) {
				System.out.println("Game Over");
				break;
			}
			
		}
				
	}

}
