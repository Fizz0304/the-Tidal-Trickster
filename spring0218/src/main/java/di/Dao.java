package di;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	public void insert() {
		System.out.println("데이터 삽입 성공");
	}
}
