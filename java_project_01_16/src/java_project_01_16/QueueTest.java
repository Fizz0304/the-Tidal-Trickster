package java_project_01_16;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("미스포츈");
		pq.add("케이틀린");
		pq.add("바루스");
		pq.add("루시안");
		pq.add("트리스타나");
		
		//빠른 열거를 이용, 데이터를 1개씩 꺼내와 출력
		for(String city : pq) {
			System.out.print(city + "\n");
		}
		System.out.print("\n");
		
		//데이터를 poll을 이용, 1개씩 꺼내와 출력
		for(int i = 0;i < 5; i = i + 1) {
			System.out.print(pq.poll() + "\t");
		}
	}
}
