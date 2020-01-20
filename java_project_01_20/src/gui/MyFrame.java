package gui;

import java.awt.Dialog;
import java.awt.Frame;

public class MyFrame extends Frame {
	public MyFrame() {
		setTitle("프레임 상속");
		setLocation(20, 20);
		setSize(400, 400);
		
		//대화상자를 만들어서 출력 - 모달로 생성
		//대화상자가 모달로 출력 되면 출력 이후 문장은 대기 상태
		Dialog dialog = new Dialog(this, "대화상자");
		dialog.setLocation(10, 10);
		dialog.setSize(100, 100);
		
		setVisible(true);
		
		dialog.setVisible(true);
	}
}
