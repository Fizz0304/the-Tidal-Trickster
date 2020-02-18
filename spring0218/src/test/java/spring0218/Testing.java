package spring0218;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import di.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:./di/app.xml")	//app.xml 모든 내용 수행
public class Testing {
	@Autowired
	private Service service;
	
	@Test			//테스트용 메소드
	public void method() {
		service.insert();
	}
}
