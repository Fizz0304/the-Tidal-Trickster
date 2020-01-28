package html_parsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMain {

	public static void main(String[] args) {
		// 필요한 HTML 다운 - https://www.naver.com
		String html = null;			//파싱 할 것이라면 html 변수를 블록 밖에서 따로 만들어야 한다.
		try {
			String addr = "https://www.naver.com";		//다운 받을 URL생성
			URL url = new URL(addr);								//URL에 한글이 있으면 URLEncoder.encode를 이용해 인코딩 해야 한다.
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();		//연결하기
			con.setConnectTimeout(30000);
			con.setUseCaches(false);  							
			
			StringBuilder sb = new StringBuilder();														//데이터 다운로드
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			
			br.close();								//사용한 스트림 정리하기
			con.disconnect();
			
			html = sb.toString();				//데이터 확인하기
			//System.out.println(html);
 			
		}catch(Exception e) {
			System.out.println("다운로드 예외 : " + e.getMessage());
			e.printStackTrace();
		}
		
		if(html == null) {
			System.out.println("다운로드 받을 문자열이 없습니다.");
			return ;
		}
		
		//HTML 파싱
		try {
			//문자열을 DOM(Document Object Model)로 펼치기
			Document document = Jsoup.parse(html);

/*			
			//span태그를 모두 가져오기
			Elements span = document.getElementsByTag("span");		//ByTag로 찾는다.
			
			//가져온 데이터를 모두 출력하기
			for(int i = 0; i < span.size(); i = i + 1) {
				Element element = span.get(i);
				System.out.println(element.text());
			}
																																		*/
/*				
			//an_txt 클래스를 모두 가져오기
			Elements txt = document.getElementsByClass("an_txt");		//ByClass로 찾는다.
			for(int i = 0; i < txt.size(); i = i + 1) {
				Element element = txt.get(i);
				System.out.println(element.text());
			}
																																//id는 element를 사용	*/
			
			//selector를 이용하기
			Elements a = document.select("#PM_ID_serviceNavi > li:nth-child(9) > a > span.an_txt");	
			for(int i = 0; i < a.size(); i = i + 1) {
				Element element = a.get(i);
				System.out.println(element.text());
			}
			
			
		}catch(Exception e) {
			System.out.println("파싱 예외 :" + e.getMessage());
			e.printStackTrace();
		}
	
	}

}
