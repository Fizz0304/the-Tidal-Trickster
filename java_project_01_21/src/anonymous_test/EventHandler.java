package anonymous_test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	private TextField tf;									//가지고 오고 싶은 필드
	
	public EventHandler(TextField tf) {		//생성자 : TextField 1개를 주입받는 생성자
		this.tf = tf;
	}
		

	@Override	//이벤트 처리 메소드의 매개변수는 이벤트가 발생한 객체에 대한 정보와 
							//이벤트 처리에 필요한 정보를 소유하고 있다.
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0.getModifiers());
		
		if((arg0.getModifiers() & 512) == 512) {
			System.out.println("ALT와 함께 눌렸쇼");
		}else {
			System.out.println("ALT와 함께 안 눌렸쇼");
		}
		
		String msg = tf.getText();
		System.out.println(msg);

	}

}
