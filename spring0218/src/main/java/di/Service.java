package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired					
	private Dao dao;			//Service가 Dao를 사용한다.

	public void insert() {
		dao.insert();
	}
}
