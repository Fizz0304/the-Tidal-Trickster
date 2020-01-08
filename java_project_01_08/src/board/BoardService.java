package board;
//게시판 작업을 위한 메소드
public class BoardService {
	//Board 100개를 저장할 수 있는 공간 생성
	Board [] list = new Board[100];
	
	//전체 목록이나 일부 목록을 리턴하는 메소드
	//리턴 타입은 배열이나 List이다.
	//일부 목록을 가져올 땐 매개변수로 페이지 번호를 갖는 경우가 많다.
	public Board[] getList() {
		return list;
	}
	
	//페이지 번호에 해당하는 데이터를 가져오는 메소드
	public Board[] getList(int pageNo) {
		//한 페이지에 10개씩 있다고 가정
		Board [] r = new Board[10];
		//pageNo가 1일 때 0과 9, pageNo가 2일 때는 10과 19
		int start = (pageNo - 1);
		int end = (pageNo * 10) - 1;
		
		for(int i = 0; i < 10; i = i + 1) {
			r[i] = list[start + i];
		}
		
		return r;
	}
	
	//글 번호에 해당하는 데이터를 1개 가져오는 메소드
	//기본키를 매개변수로 받아 처리한다.
	//상세보기를 처리하는 메소드 
	public Board getBoard(int num) {
		//list에서 num이라는 글 번호를 가진 데이터를 찾아 리턴
		Board board = null;
		
		//list를 순회하면서 num과 같은 글 번호를 가진 데이터를 board에 대입
		for(Board temp : list) {
			if(temp != null) {
				//동일한 글 번호를 찾으면 더 이상 반복문을 수행할 필요X
				if(temp.getNuml() == num) {
					board = temp;
					break;
				}
			}
		}
		//동일한 글 번호가 없으면 null이 출력
		return board;
	}
	
	//글쓰기를 처리하는 메소드 
	//데이터 삽입을 처리하는 메소드 -> 거의 boolean을 리턴
	//수행 결과를 알려주고자 할 땐 boolean이나 int로 리턴
	//수행 결과를 알려주지 않고자 할 땐 void(절대 실패는 없다는 가정)
	//매개변수는 데이터 1개
	
	//현재 작성된 글의 개수를 저장하기 위한 변수 - List를 사용하게 되면 필요없다.
	public int cnt;
	public boolean insertBoard(Board board) {
		//맨 마지막 위치에 데이터를 대입
		list[cnt] = board;
		cnt = cnt + 1;
		return true;
	}
	
	//글 수정을 처리하는 메소드
	//리턴 타입은 삽입고 동일
	//매개변수도 삽입과 동일
	public boolean updateBoard(Board board) {
		//글 번호에 해당하는 데이터를 찾으면 board로 대체
		for(int i = 0; i < cnt; i = i + 1) {
			Board imsi = list[i];
			//글번호 비교
			if(imsi != null) {
				if(imsi.getNuml() == board.getNuml()) {
					list[i] = board;
					break;
				}
			}
		}
		return true;
	}
	//수정을 할 땐 기본키(글 번호)의 값이 자동으로 설정된다. 
	
	//삭제를 처리하는 메소드
	//삭제를 할 땐 데이터 전체가 필요하지 않고 일반적으로 기본키만 필요
	public boolean deleteBoard(int num) {
		//list에 모든 데이터를 순회해서 글 번호가 num인 데이터를 찾아서
		//그 위치에 null을 대입
		for(int i = 0; i < cnt; i = i + 1) {
			Board imsi = list[i];
			if(imsi != null) {
				if(imsi.getNuml() == num) {
					list[i] = null;
					break;
				}
			}
		}
		return true;
	}
	
	
	
	
}
