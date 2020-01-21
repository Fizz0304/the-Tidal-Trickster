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
		
		setLayout(null);				//������Ʈ���� ũ��, ��ġ ������ �����ϵ��� ����
					
		lbl = new Label("��");	//���̺��� �����ϰ� ��ġ�Ѵ�.
		lbl.setLocation(20, 30);
		lbl.setSize(15, 15);
		add(lbl);
/*									���� ������ ����
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
		
		//Ű���� �̺�Ʈ ó���� ���� �ν��Ͻ��� ����
		KeyListener listener = new KeyListener() {
			//�޼ҵ尡 �� 3���� ���´�
			@Override
			public void keyPressed(KeyEvent arg0) {		//Ű���带 ������ �� ȣ��Ǵ� �޼ҵ�
				//System.out.println("�ƹ� Ű�� ������ ȣ��ȴ�");
				//System.out.println(arg0.getKeyChar());	//KeyChar�� ��ҹ��� ����O
				//System.out.println(arg0.getKeyCode());	//KeyCode�� ��ҹ��� ����X
				
				//���� ���̺� ��ġ ��������
				int x = lbl.getLocation().x;
				int y = lbl.getLocation().y;
				
				//���� Ű���� �� ��������
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
			public void keyReleased(KeyEvent arg0) {	//Ű���忡�� ���� �� �� ȣ��Ǵ� �޼ҵ�
				//System.out.println("Ű���忡�� ���� ���� ������ ȣ��");
				int modifiers = arg0.getModifiers();
				System.out.println(modifiers);
				//control + x �� ����
				if((modifiers & 2) != 0) {
					int key = arg0.getKeyCode();		//��ҹ��ڸ� �����Ϸ��� getKeyChar()�� ���
					if(key == KeyEvent.VK_X) {
						System.exit(0);
					}
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {	//����Ű�� ������ �� ȣ��Ǵ� �޼ҵ�
				//System.out.println("���� Ű�� ������ �� ȣ��");
				
			}
			
		};
		this.addKeyListener(listener); 			//�����쿡 Ű���� �̺�Ʈ �����ʸ� ����
		
		//�⺻���� ������
		setTitle("��Ű���� �̺�Ʈ��");
		setLocation(100, 100);
		setSize(200, 200);
		setVisible(true);
		
		WindowAdapter windowListener = new WindowAdapter() {

			@Override  //�����ư�� ���� �� ȣ��Ǵ� �޼ҵ�
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				
			}
		};
		this.addWindowListener(windowListener);
		
	}
}
