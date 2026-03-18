
public class FrontEnd {
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		System.out.println("=====영화 목록=====");
		for (Movie m:ms.movies) {
			System.out.println(m.title);
			System.out.println(m.actor);
			System.out.println(m.genre);
			System.out.println(m.grade);
			System.out.println(m.director);
			System.out.println("=============");
		}
	}
}
