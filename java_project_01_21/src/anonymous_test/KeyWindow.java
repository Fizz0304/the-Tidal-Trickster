package anonymous_test;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class KeyWindow extends Frame {
	
	private Label lbl;
	
	
	public KeyWindow() {
		
		setLayout(null);				//컴포넌트들의 크기, 위치 변경이 가능하도록 설정
					
		lbl = new Label("㈜");	//레이블을 생성하고 배치한다.
		lbl.setLocation(20, 30);
		lbl.setSize(15, 15);
		add(lbl);
/*									따로 스레드 실행
		Thread th = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
						int x = lbl.getLocation().x;
						int y = lbl.getLocation().y;
						y = y + 5;
						lbl.setLocation(x, y);
					}catch(Exception e) {}
				}
			}
		};
		th.start();																			*/
		
		//키보드 이벤트 처리를 위한 인스턴스를 생성
		KeyListener listener = new KeyListener() {
			//메소드가 총 3개가 나온다
			@Override
			public void keyPressed(KeyEvent arg0) {		//키보드를 눌렀을 때 호출되는 메소드
				//System.out.println("아무 키나 누르면 호출된다");
				//System.out.println(arg0.getKeyChar());	//KeyChar는 대소문자 구분O
				//System.out.println(arg0.getKeyCode());	//KeyCode는 대소문자 구분X
				
				//현재 레이블 위치 가져오기
				int x = lbl.getLocation().x;
				int y = lbl.getLocation().y;
				
				//누른 키보드 값 가져오기
				int code = arg0.getKeyCode();
				
				switch(code) {
				case KeyEvent.VK_UP:
					y = y - 5;
					break;
				case KeyEvent.VK_DOWN:
					y = y + 5;
					break;
				case KeyEvent.VK_LEFT:
					x = x - 5;
					break;
				case KeyEvent.VK_RIGHT:
					x = x + 5;
					break;
				}
				lbl.setLocation(x, y);
			}

			@Override
			public void keyReleased(KeyEvent arg0) {	//키보드에서 손을 뗄 때 호출되는 메소드
				//System.out.println("키보드에서 손을 떼면 무조건 호출");
				int modifiers = arg0.getModifiers();
				System.out.println(modifiers);
				//control + x 면 종료
				if((modifiers & 2) != 0) {
					int key = arg0.getKeyCode();		//대소문자를 구분하려면 getKeyChar()를 사용
					if(key == KeyEvent.VK_X) {
						System.exit(0);
					}
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {	//문자키를 눌렀을 때 호출되는 메소드
				//System.out.println("문자 키를 눌렀을 때 호출");
				
			}
			
		};
		this.addKeyListener(listener); 			//윈도우에 키보드 이벤트 리스너를 연결
		
		//기본적인 프레임
		setTitle("※키보드 이벤트※");
		setLocation(100, 100);
		setSize(200, 200);
		setVisible(true);
		
		WindowAdapter windowListener = new WindowAdapter() {

			@Override  //종료버튼을 누를 때 호출되는 메소드
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				
			}
		};
		this.addWindowListener(windowListener);
		
	}
}
