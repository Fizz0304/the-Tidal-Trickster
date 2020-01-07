package java_project_01_06;

public class Main {

	public static void main(String[] args) {
		SampleClass obj = new Sample();
		
		final int x = 10;		//final변수는 생성과 동시에 값을 할당한다. 이는 값을 변경할 수 없기 때문
											//final변수의 이름은 모두 대문자로 만드는 것이 관례
		final int TEN = 10;
		TEN = 11;
		
	}

}
