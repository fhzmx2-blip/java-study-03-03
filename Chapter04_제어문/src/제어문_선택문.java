/*
 * switch(정수/문자/문자열){
 * case1:	=>	if(no==1)
 * 	처리문장
 * 	break; 이게 없으면 죄다 수행함
 * case2:	=>	if(no==2)
 * 	처리문장
 * 	break;
 * case2:	=>	if(no==3)
 * 	처리문장
 * 	break;
 * default:
 * 	처리문장
 * }
 */

public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int no=(int)(Math.random()*3+1);
//		System.out.println(no+"\n\n");
//		
//		switch(no) {
//		case 1:
//			System.out.println("1");
//			break;
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		case 4:
//			System.out.println("4");
//			break;
//		}
		
//		int no=89;
		char op='a';
		
		int no=(int)(Math.random()*101);
		System.out.println(no);
		
		switch (no/10) {
		case 10:
		case 9:
			op='A';
			break;
		case 8:
			op='B';
			break;
		case 7:
			op='C';
			break;
		case 6:
			op='D';
			break;
		default:
			op='F';
		}
		System.out.println(op);

	}

}
