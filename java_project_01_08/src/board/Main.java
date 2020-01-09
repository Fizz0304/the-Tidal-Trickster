package board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int 전체보기 = 1;
		final int 상세보기 = 2;
		final int 삽입하기 = 3;
		final int 수정하기 = 4;
		final int 삭제하기 = 5;
		final int 종료하기 = 6;
		
		//키보드로부터 입력받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		//게시판 작업을 수행할 인스턴스를 생성
		BoardService  boardService = new BoardService();
		
		while(true) {
			System.out.println("1.전체보기 2.상세보기 3.삽입하기 4. 수정하기.5.삭제하기 6.종료하기");
			System.out.print("메뉴 입력");
			int menu = sc.nextInt();
			//메뉴에 따른 분기
			switch(menu) {
				case 전체보기:
					//BoardService클래스의 getList메소드가 처리할 수 있다.
					//static이 아니기 때문에 인스턴스를 생성
					//BoardService는 클래스 이름, new 다음은 생성자 이름 
					
					Board [] boards = boardService.getList();
					
					//배열의 데이터 출력
					for(Board board : boards) {
						if(board != null) {
							System.out.println(board);
						}
					}
					break;
				case 상세보기:
					//글 번호를 입력받아서 상세보기 메소드를 호출
					//상세보기는 글 번호에 해당하는 데이터가 있으면 데이터가 리턴, 없으면 null				
					System.out.println("상세보기 할 번호 : ");
					int num = sc.nextInt();
					
					Board board1= boardService.getBoard(num);
					if(board1 == null) {
						System.out.println("글번호에 해당하는 번호가 없습니다.");
					}
					
					break;
				case 삽입하기:
					//삽입하기는 BoardService클래스의 insertBoard가 처리해준다.
					//인스턴스 메소드, 매개변수 Board이고 리턴 타입은 boolean이다.					
					Board board = new Board();
					
					System.out.print("제목 입력 : ");
					//이전에 정수 입력을 받고 엔터가 남아 있기 때문에 명령이 실행되지 않는다.
					sc.nextLine();
					String temp = sc.nextLine();
					board.setTitle(temp);
					
					System.out.print("내용 입력 : ");
					temp = sc.nextLine();
					board.setContent(temp);
					
					boolean r =boardService.insertBoard(board);
					
					break;
				case 수정하기:
					//수정할 글 번호를 입력 받아야 한다.
					System.out.println("수정할 글 번호 : ");
					int n = sc.nextInt();
					
					//글 번호가 n인 데이터 찾기
					Board b = boardService.getBoard(n);
					if(b == null) {
						System.out.println("글 번호에 해당하는 데이터가 없습니다.");
						continue;
					}else {
						System.out.print("수정할 제목 :");
						sc.nextLine();
						b.setTitle(sc.nextLine());
						
						System.out.print("수정할 내용 : ");
						b.setContent(sc.nextLine());
					}
					break;
				case 삭제하기:
					//삭제할 글 번호를 입력 받고 해당하는 데이터가 있는지 확인
					//정말로 삭제할 것인지 물어보고 삭제
					System.out.println("삭제할 글 번호");
					int x = sc.nextInt();
					
					Board y = boardService.getBoard(x);
					if(y== null) {
						System.out.println("글 번호에 해당하는 글이 없습니다.");
						continue;
					}else {
						System.out.print("정말로 삭제? 1. 삭제  2. 안 삭제");
						int del = sc.nextInt();
						if(del == 1) {
							boardService.deleteBoard(x);
						}
					}
					break;			
				case 종료하기:
					sc.close();
					System.out.println("종료하기 선택");
					System.exit(0);	//프로그램 종료
					break;
				default:
					System.out.println("메뉴 확인!");
					break;
			
			
			}
			
			
		}
		

	}

}
