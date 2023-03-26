package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) throws Exception {
		/*
		  	Crawling : (== Scraping) 웹페이지를 그대로 읽어 와서 데이터를 추출해 내는 처리
		  	
		  	Jsoup : java
		  	BeautifulSoup : python
		 */
		Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/?lt=1&ft=0").get();
		/*
			<div class="box-contents">
                <a href="/movies/detail-view/?midx=86796">
                    <strong class="title">앤트맨과 와스프-퀀텀매니아</strong>
                </a>

                <div class="score">
                    <strong class="percent">
                    	예매율
                    	<span>42.1%</span>
                    </strong>
		*/		
		Elements titles = doc.select("div.box-contents strong.title");		
		Elements percents = doc.select("div.box-contents div.score strong.percent span");
		
		for (int i = 0; i < 19; i++) {
			Element title = titles.get(i);
			Element percent = percents.get(i);
			
			System.out.println(title.text() + " " + percent.text());
		}

	}

}




