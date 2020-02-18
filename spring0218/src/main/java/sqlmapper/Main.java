package sqlmapper;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:./mybatis.xml");
		
		SqlSession sqlSession = context.getBean("sqlSession", SqlSession.class);
		
		List<Good> list = sqlSession.selectList("good.goodlist");
		
		context.close();
		
		
/*		
		DataSource ds = context.getBean("dataSource", DataSource.class);
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
