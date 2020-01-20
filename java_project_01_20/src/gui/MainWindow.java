package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class MainWindow extends Frame {
	public MainWindow() {
		//여러 개의 컴포넌트들을 올려 놓을 수 있는 패널 생성
		Panel northPanel = new Panel();
		//레이블과 텍스트 필드를 만들어서 패널에 배치
		//패널은 FlowLayout이라서 순서대로 배치된다.
		Label lblTitle = new Label("제목");
		TextField txtTitle = new TextField(30);
		
		northPanel.add(lblTitle);
		northPanel.add(txtTitle);
		
		//프레임은 BorderLayout이라서 방향과 함께 배치
		//패널을 북쪽에 배치
		add("North", northPanel);
		
		Panel centerPanel = new Panel();
		Label lblContent = new Label("내용");
		TextArea txtContent = new TextArea(5, 30);
		
		centerPanel.add(lblContent);
		centerPanel.add(txtContent);
		
		add("Center", centerPanel);
		
		Panel southPanel = new Panel();
		southPanel.setLayout(new GridLayout(2, 2));
		//셀의 개수가 부족하면 행/열의 개수를 늘려 배치
		for(int i = 0; i < 50; i = i + 1) {
			Button button = new Button("버튼" + i);
			southPanel.add(button);
		}
		add("South", southPanel);
		
		
		
		
		setTitle("게시물 입력~");
		setLocation(100, 100);
		setSize(300, 500);
		setResizable(false);		//크기 변경X
		setVisible(true);
	}
}
