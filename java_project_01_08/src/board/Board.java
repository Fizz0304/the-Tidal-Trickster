package board;

public class Board {
	//저장할 항목(글 번호, 제목, 내용)을 private 변수로 생성한다.
	private int num;
	private String title;
	private String content;
	
	//일련번호 생성을 위한 static변수 1개 생성
	private static int sequence;
	
	//생성자 만들기
	public Board() {
		sequence = sequence + 1;
		num = sequence;
	}
	
	//인스턴스 변수 사용을 위한 접근자 메소드
	public int getNuml() {
		return num;
	}
	public void setNuml(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

//디버깅을 위한 메소드. 출력하는 메소드에 인스턴스르 대입했을 때 호출된다.
//자바는 인스턴스를 출력하는 메소드에 대입하면 toString이라는 메소드가 호출
	@Override
	public String toString() {
		return "Board [numl=" + num + ", title=" + title + ", content=" + content + "]";
	}
//인스턴스 변수의 값을 전부 확인하고자 할 때 매 번 get메소드를 부르는 것은 낭비
//이런 경우 toString()을 호출해서 한 번에 확인한다.
	
	
	
	
	
	
	
}
