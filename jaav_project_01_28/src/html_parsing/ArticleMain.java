package html_parsing;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ArticleMain {
	private static int cnt;

	// 한겨레 신문사 웹 페이지에서 나혼자산다로 검색된 기사 내용 전부를 파일에 저장하기
	public static void main(String[] args) {
		//나혼자 산다로 검색된 기사 개수 파악하기
		try {
			String keyword = URLEncoder.encode("나혼자산다", "utf-8");																			//한글로 된 검색어를 인코딩 해야 한다.
			//뉴스 검색 URL만들기
			String addr = "http://search.hani.co.kr/Search?command=query&keyword=" + keyword  		
					+ "&media=news&submedia=&sort=d&period=all&datefrom=2000.01.01&dateto=2020.01.28&pageseq=0";
			
			URL url = new URL(addr);
			
			//연결 옵션과 연결하기
			HttpURLConnection con = (HttpURLConnection)url.openConnection();	
			con.setConnectTimeout(20000);
			con.setUseCaches(false);
			
			//문자열을 전부 읽어 sb에 저장하기
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			String html = sb.toString();
			br.close();
			con.disconnect();
			
			//System.out.println(html);
			
			//html을 DOM으로 펼치기
			Document document = Jsoup.parse(html);
			//Elements span = document.getElementsByTag("span");						태그 이름으로 찾기						↓
			//Elements span = document.getElementsByClass("total");					클래스 이름으로 찾기										↓
			Elements span = document.select("#contents > div.search-result-section.first-child > div > span");				//selector로 찾기

			//출력
/*			for(int i = 0; i < span.size(); i = i + 1) {
				System.out.println(span.get(i).text());
			}																						*/
			
			String temp = span.get(0).text();			//119'건'이라고 저장된다.
			String [] ar = temp.split(" ");				//ar[0] -> '119', ar[1] -> '건'
			cnt = Integer.parseInt(ar[0]);
			//System.out.println(cnt);
			if(cnt <= 0) {
				System.out.println("검색된 기사가 없습니다");
				return;
			}
			
			
		}catch(Exception e) {
			System.out.println("기사 개수 파악 예외 : " + e.getMessage());
			e.printStackTrace();
		}
		
		//검색된 데이터의 링크를 전부 찾아 list에 삽입하기
		ArrayList <String> list = new ArrayList<String>();
		try {
			int pagesu = cnt / 10;
			if(pagesu % 10 != 0) {
				pagesu = pagesu + 1;
			}
			
			for(int i = 0; i < pagesu; i = i + 1) {
				String keyword = URLEncoder.encode("나혼자산다", "utf-8");																			
				String addr = "http://search.hani.co.kr/Search?command=query&keyword=" + keyword  		
						+ "&media=news&submedia=&sort=d&period=all&datefrom=2000.01.01&dateto=2020.01.28&pageseq=0";
				URL url = new URL(addr);
				
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
				con.setConnectTimeout(10000);
				con.setUseCaches(false);
				//반복문 안에 try-catch는 권장되지 않지만 해야 하는 경우가 있다. 뉴스나 sns는 게시된 이후 삭제될 가능성도 있기 때문에 삭제된 게시물을 건너 뛰고 파싱할려면 필수!
				try {	//특정 페이지의 데이터를 읽지 못 해도 다음 페이지의 데이터를 읽기 위해서 반복문 안에 예외처리문장을 삽입한다.
					StringBuilder sb = new StringBuilder();
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					while(true) {
						String line = br.readLine();
						if(line == null) {
							break;
						}
						sb.append(line + "\n");
					}
					String html = sb.toString();
					br.close();
					con.disconnect();
					
					Document document = Jsoup.parse(html);
					Elements links = document.select("dl > dt > a");
					
					for(int j = 0; j < links.size(); j = j + 1) {
						//System.out.println(links.get(j).text());		//a태그 문자열 출력하기
						//System.out.println(links.get(j).attr("herf"));
						list.add(links.get(j).attr("herf"));		//a태그의 herf의 속성 값을 가져오기
					}
					//System.out.println(links.size());
					
				}catch(Exception e) {
					System.out.println("링크 수집 실패 : " + e.getMessage());
					e.printStackTrace();
				}
						
			}
		}catch(Exception e) {
			System.out.println("링크 수집 예외 : " + e.getMessage());
			e.printStackTrace();
		}
		
		//list에 저장된 링크의 기사 데이터를 전부 읽어 파일에 저장하기
		try {
			for(int k = 0; k < list.size(); k = k + 1) {			//String addr : list  를 넣어도 된다.
				try {
					String keyword = URLEncoder.encode("나혼자산다", "utf-8");			
					String addr = "http://search.hani.co.kr/Search?command=query&keyword=" + keyword  		
							+ "&media=news&submedia=&sort=d&period=all&datefrom=2000.01.01&dateto=2020.01.28&pageseq=0";
					URL url = new URL(addr);
					
					HttpURLConnection con = (HttpURLConnection)url.openConnection();
					con.setUseCaches(false);
					con.setConnectTimeout(10000);
					//실제 스크래핑할 땐 딜레이를 주는 것이 좋다. 		Thread.sleep(1000);		이렇게
					StringBuilder sb = new StringBuilder();
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					while(true) {
						String line = br.readLine();
						if(line == null) {
							break;
						}
						sb.append(line + "\n");
					}
					String html = sb.toString();
					br.close();
					con.disconnect();
					//System.out.println(html);
					
					Document document = Jsoup.parse(html);
					Elements articles = document.select("div > div.text");
					for(int h = 0; h < articles.size(); h = h + 1) {		
						PrintWriter pw = new PrintWriter(new FileOutputStream("./코로나.txt", true));			//파일에 기록하기
						pw.println(articles.get(h).text());
						pw.flush();
						pw.close();
					}

				}catch(Exception e) {
					System.out.println("기사 읽기 예외 : " + e.getMessage());
				}
			}
		}catch(Exception e) {
			System.out.println("링크 읽기 예외 : " + e.getMessage());
		}
		
		
	}

}
