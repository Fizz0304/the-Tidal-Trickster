package html_parsing;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KakaoLogin {

	public static void main(String[] args) {
		//크롬 드라이버 프로퍼티에 추가하기
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//크롬 실행하기
		WebDriver driver  = new ChromeDriver();			
		//카카오 로그인 화면 가기
		driver.get("https://accounts.kakao.com/login?continue=https%3A%2F%2Flogins.daum.net%2Faccounts%2Fksso.do%3Frescue%3Dtrue%26url%3Dhttps%253A%252F%252Fwww.daum.net%252F");
		//System.out.println(driver.getPageSource());
		
		//아이디와 비밀번호 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pw = sc.nextLine();
		
		//ID와 PW를 받기
		driver.findElement(By.xpath("//*[@id=\"id_email_2\"]")).sendKeys(id);
		driver.findElement(By.xpath("//*[@id=\"id_password_3\"]")).sendKeys(pw);
		
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[8]/button")).click();
		
		try {
		Thread.sleep(5000);							//잠시 쉬기
		}catch(Exception e) {}
		
		//driver.get("https://media.daum.net/");		//뉴스란 들어가기
		
		driver.switchTo().frame(driver.findElement(By.id("down")));	//down이라는 프레임으로 전환
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("")).click();				//클릭하기
		
		
		sc.close();
	}
}
