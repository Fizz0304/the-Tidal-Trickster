package anonymous_test;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyFrame extends JFrame {			//JFrame을 상속 받는다.
	JLabel lbl;
	ImageIcon icon;
	JButton btn;
	Thread th;
	public MyFrame() {
/*		//단순한 메시지를 출력할 땐 리턴값이 없다!
		JOptionPane.showMessageDialog(this, "메시지", "제목", JOptionPane.ERROR_MESSAGE);
		*/
/*8		
		//2개 이상의 버튼을 배치해 confirm을 받는 메소드
		int result = JOptionPane.showConfirmDialog(this,  "정말로 삭제~?", "삭제", JOptionPane.WARNING_MESSAGE);
		if(result == JOptionPane.YES_OPTION) {
			
		}else if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.CANCEL_OPTION) {
			
		}
		*/
		
		//한 줄의 텍스트를 입력 받는 대화상자를 출력.
		//입력 값이 없는 상태에서 확인은 "", 그냥 취소는 null이 된다.
		String name = JOptionPane.showInputDialog(this, "이름을 입력", "");
		System.out.println(name);
		
		
		
		JPanel p = new JPanel();
		//JLabel lbl = new JLabel("문자열");
		
		//ImageIcon icon = new ImageIcon("C:/image/fizz10.jpg");
		JLabel lbl = new JLabel(icon);
		
		p.add(lbl);
		
		btn = new JButton("시작 ");		//버튼을 만들어 패널에 추가
		p.add(btn);
		
		ActionListener listener = new ActionListener() {		//버튼을 누를 때 이벤트 처리를 위한 인스턴스 생성
	
			@Override
			public void actionPerformed(ActionEvent e) {
				//Thread th = null;			꼭 초기화해야한다
				switch(e.getActionCommand()) {
					case "시작":
						btn.setText("중지");
						//스레드를 생성해서 시작
						th = new Thread() {
							String [] images = {"fizz1.jpg", "fizz2.jpg", "fizz3.jpg", "fizz4.jpg", "fizz5.jpg", "fizz6.jpg"};
							public void run() {
								try {
									int i = 1;
									while(true) {
										Thread.sleep(1000);
										icon = new ImageIcon("C:/image/fizz" + images[i%images.length]);
										lbl.setIcon(icon);
										i = i + 1;
									}
								}catch(InterruptedException e) {
									return;
								}
							}
						};
						th.start();
						break;
					case "중지":
						btn.setText("시작");
						//스레드를 중지
						th.interrupt();
						break;
						
					}
			}
			
		};
		btn.addActionListener(listener);
		

		
		//테이블에 출력할 컬럼 이름 배열
		String [] columnNames = {"이름", "전화번호", "주소"};
		String [][] data = {{"이즈리얼", "0/3/1", "바텀"}, {"칼리스타", "0/5/3", "바텀"}, {"트리스타나", "0/0/1", "바텀"}};  
		//데이터를 가지고 테이블 모델을 생성
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		//테이블은 항상 데이터가 무한히 늘어날 수 있기 때문에 상위 컨테이너의 크기를 넘어설 수 있다.
		//그러니 바로 패널/프레임에 배치하지 말고 JScrollPane에 배치해보고 실행해라!
		JScrollPane sp = new JScrollPane(table);
		p.add(sp);
		
		add(p);
		
		//메뉴바 - 메뉴 - 메뉴아이템  순으로 코딩한다 
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("메뉴(T)");
		//ALT + t 를 별도의 단축키로 설정을 하면 단축키는 동작하지 않는다.
		//단축키 설정
		menu.setMnemonic('t');
		//메뉴 항목 만들기
		JMenuItem item = new JMenuItem("메시지 출력");
		//메뉴 아이템의 이벤트 처리는 버튼과 같다. ActionListener이용!
		ActionListener itemListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyFrame.this, "메뉴 부름");
				//Anonymous Class의 this는 자기 자신으로 JFrame을 쓸 수 없다.
				//내부 클래스에서 외부 클래스의 인스턴스를 호출할 땐 외부클래스 이름.this로 해야 한다
				//안드로이드에서는 이벤트 처리를 많이 하고, 메모리 절약을 위해 anonymous를 많이 사용하기 때문에
				//외부 클래스의 인스턴스를 호출해야 하는 상황이 많아 이 문법을 기억해야 한다.
			}
			
		};
		item.addActionListener(itemListener);
		item.setToolTipText("메시지 박스 출력: ");
		
		
		menu.add(item);
		bar.add(menu);
		this.setJMenuBar(bar);
		
		
		setTitle("이미지 레이블");
		setLocation(100, 100);
		setSize(500, 500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 기능 부여

		
		
		
	}
}
