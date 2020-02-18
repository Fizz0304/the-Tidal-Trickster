package html_parsing;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver  = new ChromeDriver();			
		driver.get("https://www.op.gg/");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소환사 이름 : ");
		String id = sc.nextLine();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input")).sendKeys(id);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/button[1]/i")).click();
	
		try {
		Thread.sleep(5000);							//잠시 쉬기
		}catch(Exception e) {}
		
		driver.findElement(By.xpath("//*[@id=\"SummonerLayoutContent\"]/div[2]/div[2]/div/div[2]/div[4]/a")).click();
		
		try {
			String keyword = URLEncoder.encode(id, "utf-8");
			String addr = "https://www.op.gg/summoner/userName=" + keyword;
			
			URL url = new URL(addr);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();	
			con.setConnectTimeout(20000);
			con.setUseCaches(false);
			
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
			
			Elements a = document.getElementsByClass("GameResult");
			Elements b = document.getElementsByClass("ChampionName");
			PrintWriter pw = new PrintWriter(new FileOutputStream("./lol.txt", true));			//파일에 기록하기
			
			for(int i = 0; i < a.size(); i = i + 1) {
				Element element1 = a.get(i);
				Element element2 = b.get(i);
				System.out.print(element1.text());
				System.out.print(",");
				System.out.println(element2.text());
				pw.print(element1.text());
				pw.print("\t");
				pw.println(element2.text());
			}
			pw.flush();
			
			pw.close();
			
			try {
				Thread.sleep(5000);							//잠시 쉬기
				}catch(Exception e) {}
			
			
		}catch(Exception e) {
			System.out.println("파싱 예외 :" + e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}
