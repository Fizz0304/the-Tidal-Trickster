package java_project_01_07;

public class Main {

	public static void main(String[] args) {
		Sample obj = new Sample();  //이 부분에서 static초기화 블럭이 실행된다.
		
		//final int x = 10;		//final변수는 생성과 동시에 값을 할당한다. 이는 값을 변경할 수 없기 때문
											//final변수의 이름은 모두 대문자로 만드는 것이 관례
		//final int TEN = 10;
		//TEN = 11;					//이 문장은 에러

		Sample ob1 = new Sample();
		Sample ob2 = new Sample();
		
		ob1.name = "첫 번째 인스턴스!";
		ob2.name = "두 번째 인스턴스!";
		//static이 붙지 않은 멤버는 클래스에서 호출할 수 없다.
		//Sample.name은 안 됌
		
		//인스턴스 변수는 각각 소유하기 때문에 서로 다른 값이 출력
		System.out.println(ob1.name);
		System.out.println(ob2.name);
		
		//static변수에 값 대입
		//클래스와 인스턴스 모두 접근 가능
		ob1.share = 100;
		Sample.share = 200;
		//static변수는 하나만 만들어 공유
		//출력을 해보면 동일한 값을 출력
		System.out.println(ob1.share);
		System.out.println(ob2.share);
		System.out.println(ob1.name);
		System.out.println(Sample.share);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}	
