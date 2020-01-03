package java_projcect_01_03;

public class Datatype_2 {
	
	public static void main(String[] args) { // 자바 애플리케이션의 시작 메소드로 이 안에 코딩을 해야 실행된다.
		short s = (short)32768;
		// short 데이터 형은 32767보다 큰 숫자는 강제 형 변환을 통해 저장할 수 있다. 그러나 저장 시 16비트 앞쪽의 비트는 생략되는데
		// 이런 변수는 가장 작은 숫자인 음수 -32768부터 다시 시작하게 되고 이런 현상을 overflow라고 한다.
		System.out.println(s);
		
		// 3개의 정수 정수를 저장할 수 있는 변수를 만들고 2개에는 동일한 값을, 다른 1개에는 다른 값을 넣어 해쉬코드를 확인
		int a = 10;
		int b = 10;
		int c = 11;
		
		System.out.println("a : " + System.identityHashCode(a));
		System.out.println("b : " + System.identityHashCode(b));
		System.out.println("c : " + System.identityHashCode(c));
		
		// 빨강-노랑-파랑을 순서대로 1초마다 출력. 다양하게 적용이 가능하다.
		int i = 0;
		for(;;) {
			try {
				i =  i % 3;
				if (i == 0)
					System.out.println("빨강");
				else if (i == 1)
					System.out.println("노랑");
				else
					System.out.println("파랑");
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
