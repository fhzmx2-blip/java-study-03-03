
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
//		for (int i=0; i<com.length;i++) {
//			com[i]=(int)(Math.random()*9)+1;
//			for(int j=0;j<i;j++) {
//				if(com[j]==com[i]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		int su=0;
		boolean bCheck=false;
		for (int i=0;i<com.length;i++) {
			bCheck=true;
			while (bCheck) {
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				for(int j=0; j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
}
