package labda;
//매개변수X, 리턴타입X인 메소드를 가진 인터페이스
interface NoArgNoReturn{
	public void method1();
}
//매개변수O, 리턴타입X인 메소드를 가진 인터페이스 (원본에 작업을 해서 원본을 변환시키는 인터페이스)
interface ArgNoReturn{
	public void method2(int x);
}
//매개변수X, 리턴타입O인 메소드를 가진 인터페이스 - 많이 볼 순 없다.
interface NoArgReturn{
	public double method3();
}
//매개변수O, 리턴타입O인 메소드를 가진 인터페이스 - 데이터를 가공해서 리턴하는 함수, 제일 많이 볼 수 있다.
interface ArgReturn{
	public int method4(String str);
}

public class Lambda {

	public static void main(String[] args) {
		
		NoArgNoReturn ob1 = () -> {System.out.println("매개변수도 없고, 리턴도 없다. 이 안에 배신자가 있다. 이게 내 결론");};
		ob1.method1();

		ArgNoReturn ob2 = (x) -> {System.out.println(x + 10);};
		ob2.method2(100);		//매개변수 자료형은 생략 가능하며, 매개변수가 1개라면 ()없이 x만 써도 된다.
		
		NoArgReturn ob3 = () -> {return 10.3;};
		double d = ob3.method3();
		System.out.println(d);
		
		ArgReturn ob4 = (str) -> {return Integer.parseInt(str);};
		int i = ob4.method4("12345");
		System.out.println(i);
		
	}

}
