package semaphore;

import java.util.concurrent.Semaphore;

public class ThreadEx extends Thread {
	//semaphore변수 만들기
	private Semaphore sem;
	//외부에서 받아야 한다.
	public ThreadEx(Semaphore sem) {
		this.sem = sem;
	}
	
	public void run() {
		try {
			sem.acquire();	//Lock을 취득 -> 사용 개수 -1
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("몬스터 생성");
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		
		System.out.println("몬스터 소멸");
		
		sem.release();	//Lock을 해제 -> 사용 개수 +1
	}
}
