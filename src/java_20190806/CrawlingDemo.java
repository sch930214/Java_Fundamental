package java_20190806;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공...");
//		
//		Elements elements = doc.select(".con-wrap.notice-wrap");
//		
//		Elements noticeElements = elements.select("h3");
//		String noticeTitle = noticeElements.text();
//		System.out.println(noticeTitle);
//		
//		Elements liElements = elements.select("li"); //".notice-list li
//		for(int i=0; i<liElements.size();i++) {
//			Element liElement = liElements.get(i);
//			System.out.println(liElement.text());
		
		Elements elements = doc.select(".home_news");
		
		Elements mainElements = elements.select("h2");
		String mainNews = mainElements.text();
		System.out.println(mainNews);
		
		Elements liElements = elements.select("li");
		for (int i = 0; i < liElements.size(); i++) {
			Element ulElement = liElements.get(i);
			System.out.println(ulElement.text());
			
		}
		
	}
}
