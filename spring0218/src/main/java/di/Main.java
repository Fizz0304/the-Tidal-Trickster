package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:./di/app.xml");
		Controller controller = context.getBean("controller", Controller.class);
		controller.insert();		
		context.close();
		
		
		
		/*
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:./di/app.xml");
		Dao dao = context.getBean("dao", Dao.class);
		Service service = context.getBean("service", Service.class);
		Controller controller = context.getBean("controller", Controller.class);
		controller.insert();																																															*/
		
/*		
		//Spring Bean 설정 파일의 내용 가져오기
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:di/app.xml");
		
		//설정 파일에서 bean 가져오기
		Dao dao = context.getBean("dao", Dao.class);
		
		Service service = context.getBean("service", Service.class);
		
		Controller controller = context.getBean("controller", Controller.class);
		controller.setService(service);	
		controller.insert();																																*/	
		
/*			// 스프링을 사용하지 않는다면, 자바에서 Controller의 insert메소드를 호출할 때
		Dao dao = new Dao();
		
		Service service = new Service();
		service.setDao(dao);
		
		Controller controller = new Controller();
		controller.setService(service);
		
		controller.insert();																																	*/
	}

}
