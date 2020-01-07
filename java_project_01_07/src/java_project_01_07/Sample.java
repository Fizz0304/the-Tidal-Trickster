package java_project_01_07;

public class Sample {
	//main메소드가 없기 때문에 실행할 수 없고, 보조적인 역할을 수행한다.
	//static변수 : 클래스로 접근 가능하고 인스턴스로도 접근이 가능하다. 모든 인스턴스가 공유한다.
	static int share = 1;			
	
	//인스턴스 변수(멤버 변수) - 인스턴스만 접근이 가능하고 각 인스턴스가 별도로 소유
	String name;
	
	//static 초기화 블럭
	static {
		System.out.println("클래스가 처음 호출될 때 1번만 실행");
	}
	
	
	
	
	
	
	
	
}
