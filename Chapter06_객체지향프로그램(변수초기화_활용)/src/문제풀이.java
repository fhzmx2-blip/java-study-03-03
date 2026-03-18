
public class 문제풀이 {

	
	//문제 1
	class Movie {
		String poster;
		String korTitle;
		String engTitle;
		String regdate;
		String genre;
		String country;
		String grage;
		int playTime;
		double score;
		int ranking;
		String synopsis;
	}
	
	//문제 2
	class News {
		String photo;
		String title;
		String article;
		String date;
		String publisher;
	}
	
	//문제 3
	class GoodFood {
		String photo;
		String title;
		String subTitle;
	}
	
	//문제 4
	class Address {
		String streetAddress;
		String traditionalAdress;
		String phoneNumber;
		String[] category;
		int startAvgPrice;
		int endAvgPrice;
		boolean parking;
		int startTime;
		int endTime;
		MenuPrice[] menu;
		}
	
	class MenuPrice {
		String menu;
	    int price;
	    MenuPrice(String a, int b){
	    	menu=a;
	    	price=b;
	    }
	}
	
	//문제 5
	class FoodMovie{
		String movie;
		String title;
		String userName;
		String userIcon;
		double score;
		int reviewCount;
		int viewCount;
	}
	
	//문제 6
	class MusicRanking{
		int ranking;
		int rankChange;
		String albumImage;
		String lyric;
		String title;
		String musician;
		String album;
		int likeCount;
	}
	
	//문제 7
	class FoodShop{
		int discount;
		String foodImage;
		String title;
		int price;
	}
	
	//문제 8
		class Theatre {
			String title;
			String poster;
			boolean nowPlaying;
			String genre;
			String startDate;
			String endDate;
			String place;
			String[] actor;
			String grade;
			int playTime;
		}
}
