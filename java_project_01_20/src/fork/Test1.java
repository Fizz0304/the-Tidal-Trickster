package fork;

import java.util.concurrent.RecursiveTask;

//1~60까지 합계를 분할해서 수행하는 클래스
public class Test1 extends RecursiveTask<Integer>{
	//합계를 시작할 값과 끝나는 값을 저장할 인스턴스 변수
	public int start;
	public int end;
	
	//생성자를 이용해서 start와 end를 주입 받기
	public Test1(int start, int end) {
			this.start = start;
			this.end = end;
	}
	
	//start부터 end까지 합계를 구해서 리턴하는 메소드
	private int sum() {
		int r =0;
		for(int i = start; i <= end; i = i + 1) {
			r = r + i;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		return r;
	}
	
	@Override
	protected Integer compute() {
		if(end - start < 10) {
			return sum();
		}
		
		int half = (end + start) / 2;
		
		Test1 p1 = new Test1(start, half);
		Test1 p2 = new Test1(half, end);
		
		//첫 번째 작업 실행
		p1.fork();
		//첫 번째 작업 결과에 두 번째 작업 결과를 더해서 리턴한다.
		return p2.compute() + p1.join();
	}
}
