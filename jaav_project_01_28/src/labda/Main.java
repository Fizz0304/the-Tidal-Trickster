package labda;

public class Main {

	public static void main(String[] args) {
		Thread th1 = new Thread(new RunnableImpl());		//클래스를 만들고 인스턴스를 하나만 사용한다면 메모리 낭비가 된다. 이 클래스는 메모리에서 삭제X 
		th1.start();				
//--------------------------------------------------기본---------------------------------------------------------------------		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println("익명 클래스를 만들어서 사용");
				}catch(Exception e) {
					System.out.println("예외 : " + e.getMessage());
					e.printStackTrace();
				}
			}
		});
		th2.start();
//------------------------------------------------익명 클래스-------------------------------------------------------------------		
		Thread th3 = new Thread(
				()->{
					try {
					for(int i = 0; i < 10; i++) {
						Thread.sleep(1000);
						System.out.println("람다를 만들어서 사용");
					}
				}catch(Exception e) {
					System.out.println("예외 : " + e.getMessage());
					e.printStackTrace();
				}
				});
		th3.start();
//-------------------------------------------------람다-----------------------------------------------------------------------					
	}

}
