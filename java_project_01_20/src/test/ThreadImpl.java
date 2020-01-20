package test;
//Runnable : 스레드로 동작할 수 있게 해주는 인터페이스
public class ThreadImpl implements Runnable {
	//인덱스 변수와 합계를 저장할 변수 만들기
	private int idx;
	private int result;
	
	//result를 리턴하는 메소드. 메소드 이름과 블록 안의 내용을 잘 인지해야 한다.
	public int getResult() {
		return result;
	}
	//idx값을 1씩 증가시키면서 result에 추가하는 메소드. 10000번을 수행
	private  void sum() {
//메소드 앞에 synchronized가 붙으면 멀티 스레드 환경이어도 메소드의 수행이 
//종료될 때 까지 다른 작업은 수행할 수 없다.
		for(int i = 0; i < 10000; i = i + 1) {
			synchronized(this) {
			idx = idx + 1;
			try {
				Thread.sleep(1);
			}catch(Exception e) {}
				result = result + idx;
			}
		}
	}
	
	@Override
	public void run() {
		// 스레드로 동작할 내용을 작성하는 메소드. 다른 블록에서는 스레드가 실행되지 않는다.
		sum();
	}
}
