package gui;

import java.awt.Color;
import java.awt.Frame;

public class Main {

	public static void main(String[] args) {
		Frame f = new Frame();
		//좌표 바꾸기
		f.setLocation(100, 100);
		//윈도우 크기 조정, 기본 크기가 0, 0이므로 크기를 설정해야 출력
		f.setSize(300, 500);
		f.setBackground(Color.PINK);
		//윈도우 화면에 출력
		f.setVisible(true);	//기본적으로 보이지 않도록 설정 -> 메소드를 호출해야
		//볼 수 있다.
		
	}

}
