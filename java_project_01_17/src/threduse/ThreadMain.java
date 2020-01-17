package threduse;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadUse th1 = new ThreadUse();
		ThreadUse th2 = new ThreadUse();
		
		//일반적인 메소드 호출 : 하나의 메소드 수행이 종료되고 다른 메소드를  수행
/*		th1.run();
		th2.run();			*/
		
		//스레드로 실행 : 하나의 스레드가 쉴 동안 다른 스레드가 작업 
		th1.start();
		th2.start();
		
		
		
		
		

	}

}
