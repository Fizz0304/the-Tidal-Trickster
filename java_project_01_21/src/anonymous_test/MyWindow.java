package anonymous_test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class MyWindow extends Frame {
	private Button btn;
	private TextField tf;
	
	private Button btn1, btn2;
	//private Button [] buttons = new Button(2);
	
	public MyWindow() {
		Panel p = new Panel();			//여러 개의 컴포넌트
		btn = new Button("클릭");	//컴포넌트들 생성
		tf = new TextField(30);
		
		//버튼 이벤트 처리를 위해 Anonymous class 사용
		ActionListener listener = new ActionListener() {
			//버튼 이벤트 처리 메소드
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//입력한 내용 가져오기
				String msg = tf.getText();
				//출력하기
				System.out.println(msg);
				
			}			
		};//마지막에 꼭 세미콜론 붙여!
		
/*		btn에서 Action이벤트가 발생하면 listener가 대신 처리하도록 위임(delegation)
		btn.addActionListener(listener);
		
		java에서 listener는 이벤트를 처리하는 인터페이스!														*/
		
		EventHandler handler = new EventHandler(tf);
		btn.addActionListener(listener);
		
		
		p.add(btn);								//컨테이너에 컴포넌트들 배치
		p.add(tf);


		//버튼을 생성해서 패널에 추가하기
		btn1 = new Button("버튼1");
		p.add(btn1);
		btn2 = new Button("버튼2");
		p.add(btn2);
		
/*		//버튼 이벤트 처리
		ActionListener event1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1을 클릭하셨습니당~");
			}
		};
		btn1.addActionListener(event1);
		
		ActionListener event2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2을 클릭하셨습니당~");
			}
		};
		btn2.addActionListener(event2);
															//많으면 많이 만들어야 한다.									*/	
	
		//이벤트 라우팅 사용하기 
		ActionListener eventRouting = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0.getActionCommand() + " 예약");
			}
		};						
		
		btn1.addActionListener(eventRouting);
		btn2.addActionListener(eventRouting);
																																						
		
		//텍스트 필드나 텍스트 에어리어의 문자열이 변경될 때 처리를 위한 인스턴스
		TextListener t1 = new TextListener() {
			@Override
			public void textValueChanged(TextEvent arg0) {
				//텍스트 필드에 입력된 문자열 가져오기
				String msg = tf.getText();
				//대소문자 숫자 특수문자 개수를 저장할 변수 생성
				int dae = 0;
				int so = 0;
				int su = 0;
				int etc = 0;
				//문자열을 문자단위로 접근
				for(int i = 0; i < msg.length(); i = i + 1) {
					char ch = msg.charAt(i);
					//System.out.println(ch);
					if(ch >= 'A' && ch <= 'Z') {
						dae = dae + 1;
					}else if(ch >= 'a' && ch <= 'z') {
						so = so + 1;
					}else if(ch >='0' && ch <= '9') {
						su = su + 1;
					}else {
						etc = etc + 1;
					}
				}
				if(dae > 0 && so > 0 && su > 0 && etc > 0) {
					System.out.println("강함");
				}else {
					System.out.println("약함");
				}
		}
		};		
		tf.addTextListener(t1);
		
		
		add(p);										//윈도우에 컴포넌트들 배치
		
		//기본적인 프레임
		setTitle("이벤트 처리하기");
		setLocation(100, 100);
		setSize(200, 200);
		setVisible(true);
		
	}
}
