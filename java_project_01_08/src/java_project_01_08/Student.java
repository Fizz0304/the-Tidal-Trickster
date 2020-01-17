package java_project_01_08;

public class Student {
	//인스턴스 변수 선언하기
	private int num;
	private String name;
	private String major;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;			//구분을 위해 this가 붙었다.
	}											//this가 붙으면 메소드 외부에서 먼저 찾는다.
	//this.num은 메소드 외부의 인스턴스 num이고 num은 메소드의 매개변수 num이다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

}
