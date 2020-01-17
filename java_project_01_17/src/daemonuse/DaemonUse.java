package daemonuse;

public class DaemonUse {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				try {
					for(int i = 0; i < 10; i = i + 1) {
						Thread.sleep(100);
						System.out.println("데몬! 스레드!");
					}
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
			}
		};
		//th를 데몬으로 설정 -> 다른 작업이 없으면 자동으로 종료!
		//프로그램에서는 데몬 스레드가 더 많이 사용된다.
		th.setDaemon(true);
		
		th.start();
		
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("메인 종료");
		
	}

}
