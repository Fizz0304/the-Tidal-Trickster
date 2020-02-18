package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 			//bean을 자동으로 생성해 주는 어노테이션
public class Controller {
	@Autowired
	private Service service;

	public void insert() {
		service.insert();
	}
}
