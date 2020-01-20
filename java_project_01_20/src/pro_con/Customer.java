package pro_con;

public class Customer extends Thread {
	//공유자원 변수를 하나 만들기
	private Product product;
	//외부에서 주입받는 생성자
	public Customer(Product product) {
		this.product = product;
	}
	
	public void run() {	
		for(int i = 0; i < 26; i = i + 1) {
			product.get();
		}
	}
}
