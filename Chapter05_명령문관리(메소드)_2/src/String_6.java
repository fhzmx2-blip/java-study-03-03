
public class String_6 {
	public static void main(String[] args) {
		String color = "red,green,blue,yellow,black,magenta,pink";
		String[] colors=color.split(",");
		for (String c:colors) {
			System.out.println(c);
		}
		
		/*
		 * 정규식 기호
		 * | . ? * +
		 * 
		 * 이 앞엔 \\
		 */
		
		color = "red|green|blue|yellow|black|magenta|pink";
//		String[] colors2=color.split("|");
		String[] colors2=color.split("\\|");
		for (String c:colors2) {
			System.out.println(c);
		}
	}
}
