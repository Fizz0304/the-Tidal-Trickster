package gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ButtonWindow extends Frame {
	private Button btn;
	private Checkbox man, woman;
	public ButtonWindow() {
		
		setTitle("버튼 윈도우");
		setLocation(100, 100);
		setSize(300, 300);

		Panel p = new Panel();
		
		btn = new Button("버튼");
		//btn.setLabel("버튼1);
		//버튼을 패널에 추가
		p.add(btn);
		
		Label label = new Label("안녕하세용~");
		p.add(label);					//패널을 윈도우에 추가

		for(int i = 0; i < 10; i = i + 1) {
			Button button = new Button("버튼" + i);
			p.add(button);
		}
		//출력할 내용이 부모보다 큰 경우, 스크롤이 가능한 컴포넌트에 배치를 하고
		//스크롤이 가능한 컴포넌트를 부모에 배치한다. 
		//add(p);
		
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		sp.add(p);
		
		add(sp);
		
		//메뉴바 생성
		MenuBar menuBar = new MenuBar();
		//메뉴 샟성
		Menu menu = new Menu("파일");
		//메뉴 아이템 생성
		MenuItem item = new MenuItem("열기");
		//
		menu.add(item);
		//메뉴바에 부착
		menuBar.add(menu);
		//프레임에 메뉴바 부착
		setMenuBar(menuBar);
		
		FileDialog open = new FileDialog(this, "열기", FileDialog.LOAD);
		open.setDirectory("c:\\");
		open.setVisible(true);
		
		System.out.println(open.getDirectory() + open.getFile());
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(open.getDirectory() + open.getFile())));
		
		
		
		
		setVisible(true);
		
		
		
		String [] lbls = {"안녕하세요d", "녕하세요안", "하세요안녕d", "세요안녕하", "요안녕하세d"};
		
		int j = 0;
		while(true) {
			try {
				Thread.sleep(1000);
				j = j + 1;
				label.setText(lbls[j % lbls.length]);
			}catch(Exception e) {}
		}
		
/*		
		//5초 후에 버튼의 레이블 변경하기
		try {
			Thread.sleep(5000);
			btn.setLabel("버튼 글자 변경");
		}catch(Exception e) {}							*/
		
/*		Color [] colors = {Color.RED, Color.BLUE, Color.GREEN};
		
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
				btn.setBackground(colors[i%colors.length]);
				i = i + 1;
			}catch(Exception e) {}
		}																												*/
		
		
	}
}
