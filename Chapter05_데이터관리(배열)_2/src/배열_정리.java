import java.util.Scanner;

public class 배열_정리 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MovieData movie = new MovieData();
		
		while (true) {
			System.out.println("====메뉴====");
			System.out.println("1. 영화목록");
			System.out.println("2. 영화 상세보기");
			System.out.println("3. 영화명 찾기");
			System.out.println("4. 출연진으로 영화 찾기");
			System.out.println("5. 장르별 찾기");
			System.out.println("6. 종료");
			System.out.println("==========");
			System.out.print("메뉴선택");
			int menu=scan.nextInt();
			if (menu==6) {
				System.out.println("종료");
				break;
			}
			else if(menu==1) {
				for(int i=0; i<MovieData.title.length;i++) {
					System.out.println((i+1)+". "+MovieData.title[i]);
				}
			}
			else if(menu==2) {
				System.out.print("상세히 볼 영화번호: ");
				int no=scan.nextInt();
				if(no<1 || no>1938) {
					System.out.println("없는 영화입니다");
					continue;
				}
				System.out.println("======영화상세======");
				System.out.println("영화명: "+movie.title[no-1]);
				System.out.println("장르: "+movie.genre[no-1]);
				System.out.println("출연: "+movie.actor[no-1]);
				System.out.println("감독: "+movie.director[no-1]);
				System.out.println("개봉일: "+movie.regidate[no-1]);
				System.out.println("등급: "+movie.grade[no-1]);
			}
			
			else if(menu==3) {
				System.out.print("검색어 입력: ");
				String fd=scan.next();
				for (String data:movie.title) {
					if(data.contains(fd)) {
						System.out.println(data);
					}
				}
			}
			
			else if(menu==4) {
				System.out.print("배우명: ");
				String fd=scan.next();
				for (int i=0; i<movie.actor.length;i++) {
					if(movie.actor[i].contains(fd)) {
						System.out.println(movie.title[i]+"("+movie.actor[i]+")");
					}
				}
			}
			
			else if(menu==5) {
				System.out.print("장르: ");
				String fd=scan.next();
				for (int i=0; i<movie.genre.length;i++) {
					if(movie.genre[i].contains(fd)) {
						System.out.println(movie.title[i]+"("+movie.genre[i]+")");
					}
				}
			}
		}
	}

}
