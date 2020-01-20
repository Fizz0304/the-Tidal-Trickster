package test;

public class Main {
//Runnable 인터페이스 일 때
	public static void main(String[] args) {
		//Runnable 인터페이스를 implements한 클래스의 인스턴스 생성
		ThreadImpl threadImpl = new ThreadImpl();
		//Thread클래스 생성자에 대입해서 Thread 인스턴스 생성
		Thread th1 = new Thread(threadImpl);
		Thread th2 = new Thread(threadImpl);
		//스레드 시작, 기본적으로 비동기
		th1.start();
		th2.start();
		
		//스레드가 2개 이상일 때 부터 문제가 발생하기 시작한다.
		
		try {
			Thread.sleep(30000);
			System.out.println(threadImpl.getResult());
		}catch(Exception e) {
			
		}
		
	}

}
