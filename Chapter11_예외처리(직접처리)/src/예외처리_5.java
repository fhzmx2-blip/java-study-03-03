interface Animal{
	public abstract void eat();
	private void display() {
		System.out.println("공통사용");
	}
	public default void aaa() {
		display();
	}
	public default void bbb() {
		display();
	}
	public default void ccc() {
		display();
	}
}

public class 예외처리_5 {

}
