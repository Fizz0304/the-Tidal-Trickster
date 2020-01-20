package gui;

import java.awt.Frame;
import java.awt.Label;

public class MoveFrame extends Frame {
	public MoveFrame() {
		//레이아웃을 null로 설정
		setLayout(null);
		
		//레이아웃이 null이라서 좌표/크기를 모두 설정
		Label lbl = new Label("☜ ◎_◎ ☞");
		lbl.setLocation(20,100);
		lbl.setSize(20, 20);
		add(lbl);
		
		setTitle("~컴포넌트 이동~");
		setLocation(100, 100);
		setSize(300, 500);
		setResizable(false);		//크기 변경X
		setVisible(true);
		
		//lbl 움직이기
		int sign = 20;
		while(true) {
			int x = lbl.getLocation().x;
			int y = lbl.getLocation().y;
			if(x == 300) {
				sign = -20;
			}else if(x == 0) {
				sign = +20;
			}
			x = x + sign;
			try {
				Thread.sleep(1000);
				lbl.setLocation(x, y);
			}catch(Exception e) {}
		}
	}
}
