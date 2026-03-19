import java.util.Arrays;

public class 숫자야구게임 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com[] = 숫자야구게임_메소드.getRand();
//		System.out.print(Arrays.toString(com));
		while(true) {
			int user[] = 숫자야구게임_메소드.userScan();
			숫자야구게임_메소드.compare(com, user);
		}
	}
}

