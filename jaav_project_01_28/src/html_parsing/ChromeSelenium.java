package html_parsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {

	public static void main(String[] args) {
		//크롬 드라이버의 위치를 프로퍼티에 추가하기
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver  = new ChromeDriver();			
		driver.get("https://www.naver.com");
		System.out.println(driver.getPageSource());
		
		
	}

}
