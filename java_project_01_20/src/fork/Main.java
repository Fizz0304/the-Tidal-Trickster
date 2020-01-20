package fork;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		Test1 p = new Test1(1, 100);
		
		//위의 작업을 나누어 할 수 있는 Pool을 생성
		ForkJoinPool pool = new ForkJoinPool();
		
		//Pool에 작업을 대입해 실행
		System.out.println(pool.invoke(p));

	}

}
