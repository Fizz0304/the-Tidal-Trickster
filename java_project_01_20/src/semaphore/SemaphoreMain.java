package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		Semaphore sem = new Semaphore(3);
		//몬스터 생성이 3개까지만 출력된다.
		for(int i = 0; i < 20; i =  i + 1) {
			ThreadEx th = new ThreadEx(sem);
			th.start();
		}

		
		
	}

}
