
public class String_5 {
	public static void main(String[] args) {
		String msg="0123456789";
		System.out.println(msg.substring(3));
		System.out.println(msg.substring(1,6));
		
		String post="100-111";
		System.out.println(post.substring(0, 3));
		System.out.println(post.substring(4));
		
		String title="Hello Java, Oracle!!";
		String temp=title.substring(0,10)+"...";
		System.out.println(temp);
	}
}
