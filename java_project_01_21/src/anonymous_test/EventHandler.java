package anonymous_test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	private TextField tf;									//������ ���� ���� �ʵ�
	
	public EventHandler(TextField tf) {		//������ : TextField 1���� ���Թ޴� ������
		this.tf = tf;
	}
		

	@Override	//�̺�Ʈ ó�� �޼ҵ��� �Ű������� �̺�Ʈ�� �߻��� ��ü�� ���� ������ 
							//�̺�Ʈ ó���� �ʿ��� ������ �����ϰ� �ִ�.
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0.getModifiers());
		
		if((arg0.getModifiers() & 512) == 512) {
			System.out.println("ALT�� �Բ� ���ȼ�");
		}else {
			System.out.println("ALT�� �Բ� �� ���ȼ�");
		}
		
		String msg = tf.getText();
		System.out.println(msg);

	}

}
