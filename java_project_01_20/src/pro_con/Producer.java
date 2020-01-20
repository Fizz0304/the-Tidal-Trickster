package pro_con;

public class Producer extends Thread {
	//외부에서 인스턴스를 받아 객체를 생성하는 생성자
	private Product product;
	public Producer(Product product) {
		this.product = product;
	}
	
	public void run() {	//스레드로 동작하는 메소드
		for(char i = 'A'; i <= 'Z'; i++) {//문자 또한 숫자로 취급된다.
			product.put(i);
		}
	}
}
