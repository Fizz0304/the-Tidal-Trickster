package html_parsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test_1 {

	public static void main(String[] args) {
		String html = null;
		try {
			String addr = "https://www.naver.com";
			URL url = new URL(addr);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
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
			
			br.close();								
			con.disconnect();
			
			html = sb.toString();				
			//System.out.println(html);
//----------------------------------------------------------
			
		}catch(Exception e) {
			System.out.println("다운로드 예외 : " + e.getMessage());
			e.printStackTrace();
		}

		if(html == null) {
			System.out.println("다운로드 받을 문자열이 없습니다.");
			return ;
		}
		
		try {
			//문자열을 DOM(Document Object Model)로 펼치기
			Document document = Jsoup.parse(html);
		
			//span태그를 모두 가져오기
			Elements a = document.getElementsByTag("span");
			
			//가져온 데이터를 모두 출력하기
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
