package method;

public class MethodClass {
	//매개변수가 없고 리턴 타입이 void인 메소드
	public void  disp(int n){
		for(int i = 0; i < n; i = i + 1) {
		
			System.out.println("Hello Java");
		}		
	}	
	
	//정수 1개를 매개변수로 받아 1증가시키고 출력하는 메소드 : call by value
	public void inc(int n) {
		n = n + 1;
		System.out.println("n =" + n);
	}
	//배열 1개를 매개변수로 받아서 첫 번째 데이터를 1 감소시키고 출력하는 메소드
	//call by reference
	public void dec(int [] ar) {
		ar[0] = ar[0] - 1;
		System.out.println("ar[0] = " + ar[0]);
	}
	//정수 데이터를 여러개 받아 합계를 출력하는 메소드
	public void sum(int ... ar) {	//..... 이름 을 사용하면 내부에선 배열로 취급
		int sum = 0;
		for(int data : ar) {			//배열의 모든 데이터를 순차적으로 sum에 추가
			sum = sum + data;
		}
		System.out.println("합계 = " + sum);
	}
	
	//2개 정수를 매개변수로 받아서 더한 후 결과를 출력하는 메소드
	public void addDisplay(int a, int b) {
		System.out.println("a + b = " + (a + b));
	}
	
	//2개의 정수를 매개변수로 받아 더한 후 결과를 리턴하는 메소드
	public int addReturn(int a, int b) {
		return (a + b); 	//메소드 이름 앞의 자료형과 return하는 데이터의 자료형이 일치
	}
	
	
	
}
	

