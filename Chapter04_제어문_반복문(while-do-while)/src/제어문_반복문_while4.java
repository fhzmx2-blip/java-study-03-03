import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 제어문_반복문_while4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("👍👍👍👍지니뮤직👍👍👍👍");
		while (true) {
			System.out.println("====메뉴=====");
			System.out.println("1. 가요");
			System.out.println("2. 트롯");
			System.out.println("3. OST");
			System.out.println("4. POP");
			System.out.println("5. JAZZ");
			System.out.println("6. CLASSIC");
			System.out.println("7. 종료");
			int menu = scan.nextInt();
			
			if(menu<1||menu>7) {
				System.out.println("존재하지 않는 메뉴입니다. 다시 선택하세요.");
				continue;
			}
			
			if(menu==7) {
				//종료
//				System.exit(0);
//				return;
				break;
			}
			else if (menu==1) {
				System.out.println("==가요==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0100").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
			else if (menu==2) {
				System.out.println("==트롯==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0107").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
			else if (menu==3) {
				System.out.println("==OST==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0300").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
			else if (menu==4) {
				System.out.println("==POP==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0200").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
			else if (menu==5) {
				System.out.println("==JAZZ==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0500").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
			else if (menu==6) {
				System.out.println("==ClASSIC==");
				Document doc = 
						Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0600").get();
				Elements title=doc.select(".title");
				for(int i=0; i<title.size();i++) {
					String s= title.get(i).text();
					System.out.println((i+1)+". "+s);
				}
			}
		}
	}

}
