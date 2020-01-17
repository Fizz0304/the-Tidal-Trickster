package java_project_01_08;

public class Member {
	private String id;
	private String pw;
	//static{}은 클래스를 처음 사용할 때 1번 만 호출
	
	
	//클래스 안에 {}를 만들고 내용을 작성하면 생성자를 호출할 때 생성자 보다
	//먼저 호출되어 내용 수행
	{
		System.out.println("객체를 생성한다.");
	}
	
	//Member클래스 생성 - 생성자는 리턴 타입없이 클래스 이름을 그대로 사용
	//매개변수가 없는 생성자를 Default Constructor라고 한다.
	public Member() {
		id = "root";
		pw = "1234";
	}
	
	//매개변수가 2개인 생성자
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	//인스턴스를 복제해주는 메소드
	public Member clone() {
		//인스턴스를 생성
		Member other = new Member();
		//참조형 데이터도 clone해 주어야 하지만 String은 예외.
		//데이터를 복제
		other.id = this.id;
		other.pw = this.pw;
		//복제된 데이터를 갖는 객체를 리턴
		return other;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
