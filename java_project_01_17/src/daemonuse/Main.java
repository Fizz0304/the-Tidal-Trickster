package daemonuse;
//인스턴스를 2개 이상 만들려고 클래스를 만든다.
class Threadext extends Thread{
	public void run() {
		//이것만 잘 만들어 ㅇㅋ?
		for(int i = 0; i < 10; i = i + 1) {
			try {
				Thread.sleep(1000);
				System.out.println(getName());
			}catch(InterruptedException e) {
				return;		//InterruptedException이 발생했을 때 return 하도록 만들어주면 스레드가 강제로 종료될 수 밖에 없다.
			}
		}
	}
}

public class Main{
	public static void main(String[] args) {
		//System.out.println(Thread.MAX_PRIORITY);
		Threadext th1 = new Threadext();
		Threadext th2 = new Threadext();
		Threadext th3 = new Threadext();
		Threadext th4 = new Threadext();
		
		//우선순위 설정하기
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		try {
			Thread.sleep(3000);
			th2.interrupt();
		}catch(Exception e) {
		
		 }
		}
		
	}


