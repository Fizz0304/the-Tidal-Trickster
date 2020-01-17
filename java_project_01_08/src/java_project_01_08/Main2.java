package java_project_01_08;

public class Main2 {

	public static void main(String[] args) {
		/*인스턴스 생성, 대부분 개발자들은 인스턴스 1개만 만들 땐 클래스 이름의
		첫 글자만 소문자로 변환해서 이름을 생성.*/
		/*자바 개발 시 인스턴스를 자동으로 생성해주는 스프링 프레임워크를 많이 
		사용하는데 스프링이 이 규칙을 적용*/
		Member mem1 = new Member();
		
		System.out.println("id = " + mem1.getId() + " pw = " + mem1.getPw());
		
		//Member 인스턴스의 참조를 저장할 수 있는 공간 5개를 생성
		Member [] ar = new Member[5];
		//출력해 보면 null 5개가 들어있다.
		for(Member imsi : ar) {
			System.out.println(imsi);
		}
		ar[0] = new Member();
		ar[2] = new Member();
		ar[4] = new Member();
		
		for(Member imsi : ar) {
			System.out.println(imsi);
		}
		
		Member origin = new Member();
		origin.setId("G");
		origin.setPw("1212");
		
		//참조형 사이의 대입.
		//origin이 가리키고 있는 인스턴스를 weak도 가리킨다. 
		Member weak = origin;
		
		weak.setId("it");
		
		//origin을 복제해서 대입
		Member deep = origin.clone();
		System.out.println(deep.getId());
		System.out.println(origin.getId());
		deep.setId("CHOONGANG");
		//복제해서 deep에 대입했기 때문에 변경하기 전 같은 내용을 가지지만
		//한 쪽에서 내용을 변경해도 영향이 없기 때문에 deep의 내용을 변경해도 
		//origin은 그대로 보존된다.
		System.out.println(deep.getId());
		System.out.println(origin.getId());
		
	}

}
