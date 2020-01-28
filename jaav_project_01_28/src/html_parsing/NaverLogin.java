package html_parsing;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com");
		
		//아이디와 비밀번호 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pw = sc.nextLine();
		
		//ID와 PW를 받기
		driver.findElement(By.id("id")).sendKeys(id);
		driver.findElement(By.id("pw")).sendKeys(pw);
		//로그인 버튼 클릭하기
		driver.findElement(By.id("log.login")).submit();		//click()말고 type이 submit이면, submit을 써도 된다.
		
		String html = driver.getPageSource();
		Document document = Jsoup.parse(html);
		
		
		
	}

}
