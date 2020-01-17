package threduse;

public class ThreadUse extends Thread {
	public void run() {
		//1초마다 Hello Thread라는 문자열을 10번 출력하기
		for(int i = 0; i < 10; i = i + 1) {
			System.out.println("Hello Thread");
			try {
				//현재 스레드 1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		}
		
		
		
	}
}
