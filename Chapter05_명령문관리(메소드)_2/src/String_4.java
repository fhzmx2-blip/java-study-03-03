/*
 *	toUpperCase	대문자 변환
 *	yoLowerCase	소문자 변환
 *	replace		지정된 문자(문자열)로 변환
 *	replaceAll 	정규식을 이용 (아무래도 좀 복잡하다)
 *	replaceAll(regex, "변경할 문자")
 *			   -----
 *				[A-Z] 대문자 전체
 *				[a-z] 소문자 전체
 *				[A-Z] 대문자 전체
 *				[A-Z] 대문자 전체
 *				[A-Z] 대문자 전체
 *				[A-Z] 대문자 전체
 * 
 */

public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "Hello Java";
		String msg = "Hello Java Javb Javc Javn";
		System.out.println("대문자: "+msg.toUpperCase());
		System.out.println("소문자: "+msg.toLowerCase());
		System.out.println("원본: "+msg);
		
		String s = msg.replace('l', 'k');
		System.out.println(s);
		
		s = msg.replace("Java", "Spring");
		System.out.println(s);
		
		s = msg.replaceAll("Jav+", "Orar");
		System.out.println(s);
	}

}
