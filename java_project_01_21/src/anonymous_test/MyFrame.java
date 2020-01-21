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

public class MyFrame extends JFrame {			//JFrame�� ��� �޴´�.
	JLabel lbl;
	ImageIcon icon;
	JButton btn;
	Thread th;
	public MyFrame() {
/*		//�ܼ��� �޽����� ����� �� ���ϰ��� ����!
		JOptionPane.showMessageDialog(this, "�޽���", "����", JOptionPane.ERROR_MESSAGE);
		*/
/*8		
		//2�� �̻��� ��ư�� ��ġ�� confirm�� �޴� �޼ҵ�
		int result = JOptionPane.showConfirmDialog(this,  "������ ����~?", "����", JOptionPane.WARNING_MESSAGE);
		if(result == JOptionPane.YES_OPTION) {
			
		}else if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.CANCEL_OPTION) {
			
		}
		*/
		
		//�� ���� �ؽ�Ʈ�� �Է� �޴� ��ȭ���ڸ� ���.
		//�Է� ���� ���� ���¿��� Ȯ���� "", �׳� ��Ҵ� null�� �ȴ�.
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է�", "");
		System.out.println(name);
		
		
		
		JPanel p = new JPanel();
		//JLabel lbl = new JLabel("���ڿ�");
		
		//ImageIcon icon = new ImageIcon("C:/image/fizz10.jpg");
		JLabel lbl = new JLabel(icon);
		
		p.add(lbl);
		
		btn = new JButton("���� ");		//��ư�� ����� �гο� �߰�
		p.add(btn);
		
		ActionListener listener = new ActionListener() {		//��ư�� ���� �� �̺�Ʈ ó���� ���� �ν��Ͻ� ����
	
			@Override
			public void actionPerformed(ActionEvent e) {
				//Thread th = null;			�� �ʱ�ȭ�ؾ��Ѵ�
				switch(e.getActionCommand()) {
					case "����":
						btn.setText("����");
						//�����带 �����ؼ� ����
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
					case "����":
						btn.setText("����");
						//�����带 ����
						th.interrupt();
						break;
						
					}
			}
			
		};
		btn.addActionListener(listener);
		

		
		//���̺� ����� �÷� �̸� �迭
		String [] columnNames = {"�̸�", "��ȭ��ȣ", "�ּ�"};
		String [][] data = {{"�����", "0/3/1", "����"}, {"Į����Ÿ", "0/5/3", "����"}, {"Ʈ����Ÿ��", "0/0/1", "����"}};  
		//�����͸� ������ ���̺� ���� ����
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		//���̺��� �׻� �����Ͱ� ������ �þ �� �ֱ� ������ ���� �����̳��� ũ�⸦ �Ѿ �� �ִ�.
		//�׷��� �ٷ� �г�/�����ӿ� ��ġ���� ���� JScrollPane�� ��ġ�غ��� �����ض�!
		JScrollPane sp = new JScrollPane(table);
		p.add(sp);
		
		add(p);
		
		//�޴��� - �޴� - �޴�������  ������ �ڵ��Ѵ� 
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("�޴�(T)");
		//ALT + t �� ������ ����Ű�� ������ �ϸ� ����Ű�� �������� �ʴ´�.
		//����Ű ����
		menu.setMnemonic('t');
		//�޴� �׸� �����
		JMenuItem item = new JMenuItem("�޽��� ���");
		//�޴� �������� �̺�Ʈ ó���� ��ư�� ����. ActionListener�̿�!
		ActionListener itemListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyFrame.this, "�޴� �θ�");
				//Anonymous Class�� this�� �ڱ� �ڽ����� JFrame�� �� �� ����.
				//���� Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ��� ȣ���� �� �ܺ�Ŭ���� �̸�.this�� �ؾ� �Ѵ�
				//�ȵ���̵忡���� �̺�Ʈ ó���� ���� �ϰ�, �޸� ������ ���� anonymous�� ���� ����ϱ� ������
				//�ܺ� Ŭ������ �ν��Ͻ��� ȣ���ؾ� �ϴ� ��Ȳ�� ���� �� ������ ����ؾ� �Ѵ�.
			}
			
		};
		item.addActionListener(itemListener);
		item.setToolTipText("�޽��� �ڽ� ���: ");
		
		
		menu.add(item);
		bar.add(menu);
		this.setJMenuBar(bar);
		
		
		setTitle("�̹��� ���̺�");
		setLocation(100, 100);
		setSize(500, 500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���� ��� �ο�

		
		
		
	}
}
