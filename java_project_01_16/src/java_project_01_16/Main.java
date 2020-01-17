package java_project_01_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
/*	
		//정수 데이터를 저장하는ArrayList만들기
		//제너릭에서는 기본형은 사용할 수 없기 때문에
		//기본형을 대체하는 wrapper 클래스 사용
		ArrayList<Integer> al = new ArrayList<>();
		
		//데이터 삽입하기
		al.add(10);
		al.add(30);
		
		//데이터 1개 가져오기
		Integer e = al.get(0);
		System.out.println(e);
		
		//데이터 1개 삭제하기
		al.remove(0);
		
		//데이터 전체 출력
		for(Integer imsi : al) {
			System.out.println(imsi);		
		}																												
		
		//10과 30을 갖는 ArrayList 만들기
		al = new ArrayList<>();

		al.add(10);
		al.add(30);
		
		//현재시간 저장
		long start = System.currentTimeMillis();
		
		//20이라는 데이터를 10만 번 2번째 칸에 삽입
		for(int i = 0; i < al.size(); i = i + 1) {
			System.out.println(al.get(i));
		}
		
		//현재시간 저장
		long end = System.currentTimeMillis();
		
		System.out.println("al = " + (end - start));
		//10만 번 삽입하는데 걸리는 시간 출력
		
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(30);
		
		//현재시간 저장
		long start1 = System.currentTimeMillis();
		
		//모든 데이터 읽기
		for(int i = 0; i < li.size(); i = i + 1) {
			System.out.println(li.get(i));
		}
		
		//현재시간 저장
		long end1 = System.currentTimeMillis();
		
		System.out.println("li = " + (end1 - start1));
		//10만 번 삽입하는데 걸리는 시간 출력													*/
		
		
		//문자열을 저장하는 스택 생성하기
		Stack <String> stack = new Stack<>();
		//데이터 저장은 push
		stack.push("노틸러스");
		stack.push("쓰레쉬");
		stack.push("레오나");
		
		//마지막 데이터 가져오기
		String human = stack.pop();		//레오나가 출력, 그렇지만 레오나는 삭제
		System.out.println(human);
		
		//마지막 데이터를 제거하지 않고 가져오기
		human = stack.peek();
		System.out.println(human);
		human = stack.peek();
		System.out.println(human);
		
		
		
		
	}

}
