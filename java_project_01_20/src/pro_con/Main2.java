package pro_con;

public class Main2 {

	public static void main(String[] args) {
		//공유 자원 생성하기
		Product product = new Product();
		
		//Thread클래스로부터 상속받은 클래스의 인스턴스를 만들고 스레드로 동작
		Customer customer = new Customer(product);		
		Producer  producer = new Producer(product); 
		
		//Runnable과 달리 바로 시작할 수 있다.
		customer.start();
		producer.start();
		//start는 스레드로 
	
	}

}
