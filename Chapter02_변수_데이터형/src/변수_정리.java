import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\sist15\\git\\java-study\\Chapter02_변수_데이터형\\bin\\변수_정리.class");
		long l=f.lastModified();
		System.out.println(l);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
		
		/*
		 * 변수 선언
		 * 변수 = 초기값
		 * 		--------- 명시적
		 * 		--------- 입력값
		 * 		--------- 랜덤
		 * 				  Math.random()
		 * 				  -------------
		 * 				  (int) (0.0 ~ 0.99) => 0~99 + 1
		 * 		--------- 외부에서 데이터 읽기
		 * 		--------- 윈도우
		 * 				  JOptionPane.showInputDialog()
		 * 
		 */
//		String name=JOptionPane.showInputDialog("이름 입력: ");
//		System.out.println(name);
		
		
//		int kor = (int) (Math.random()*101);
//		int eng = (int) (Math.random()*101);
//		int math = (int) (Math.random()*101);

		Random r = new Random();
		
		int kor = r.nextInt(101);
		int eng = r.nextInt(101);
		int math = r.nextInt(101);
		
		System.out.println("국어: "+kor+"\n영어: "+eng+"\n수학: "+math);
	
	}

}
