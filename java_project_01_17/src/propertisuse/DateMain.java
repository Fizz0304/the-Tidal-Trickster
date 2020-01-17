package propertisuse;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateMain {

	public static void main(String[] args) {
		Date date = new Date(2020, 1, 17);
		System.out.println(date);
		
		//java.util.Date는 1900년도 이후 지나온 년도고, 월은 0부터 시작한다.
		Date date1 = new Date(120, 0, 17);
		System.out.println(date1);
		
		//Calendar클래스의 인스턴스 생성하기
		//근데 Calendar는 추상 클래스라서 인스턴스 생성 안 됨
		Calendar cal = Calendar.getInstance();
		//Calendar 클래스의 인스턴스를 만드는 것이 아니고, Calendar 클래스를
		//상속 받은 클래스의 Anonymous Class를 생성해 인스턴스를 만든 후 리턴
		//자바에서 인터페이스나 추상 클래스를 리턴 타입으로 하는 모든 메소드는
		//이 원리가 적용된다.
		System.out.println(cal);
		//toString 출력이 많아 어렵다. 그래서 이렇게 안 봄ㅋ
		System.out.println(cal.get(Calendar.MONTH) + 1);
		//월은 0부터 시작하기 때문에 1을 + 해줘야 한다.
		
		//1월부터 12월까지 날 수를 배열에 저장하기
		//프로그래밍의 편리성을 위해서 첫 번째 위치에 의미 없는 값을 삽입해
		//인덱스와 데이터이의 위치를 맞추는 경우가 있다. 
		
		Date today = new Date();
		//생성할 때 서식을 입력.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String msg = sdf.format(msg);
		
		
		
		
		
	}

}
