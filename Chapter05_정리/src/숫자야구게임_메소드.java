
import java.util.Scanner;

public class 숫자야구게임_메소드 {
    static int[] getRand() {
    	int[] com=new int[3];
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;

			for(int j=0;j<i;j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}
		return com;
    }
    
    static int[] userScan() {
		Scanner scan = new Scanner(System.in);
		int[] user = new int[3];
		while (true) {
			System.out.println("세자리 정수 입력: ");
			int input=scan.nextInt();
			
			if(input<100 || input>999) {
				System.err.println("세자리 정수만 입력");
				continue;
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if (user[0]==user[1] ||user[0]==user[2] ||user[1]==user[2]) {
				System.err.println("같은 수 사용 불가");
				continue;
			}
			
			if (user[0]==0 ||user[1]==0 ||user[2]==0) {
				System.err.println("0 사용 불가");
				continue;
			}
			break;
		}
		return user;
	}
    
    static void compare(int[] com, int[] user) {
    	int s=0,b=0;
    	for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (user[i]==com[j]) {
					if(i==j) {
						s++; 
					} else {
						b++;
					}
				}
			}
		}
		hint(s,b);
		if(isEnd(s))
		{
			System.out.println("Game Over!!");
			System.exit(0);
		}
		
	}
    
    static void hint(int s, int b) {
		for (int i=0; i<s;i++) {
			System.out.print("S");
		}
		for (int i=0; i<b;i++) {
			System.out.print("B");
		}
		System.out.println();
	}
    
    static boolean isEnd(int s) {
    	if(s==3) {
    		return true;}
    	else {
    		return false;
    	}
    }
    

}