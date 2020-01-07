package method;

public class Main {

	public static void main(String[] args) {
		//methodclass의 인스턴스를 생성
		MethodClass obj = new MethodClass();
		obj.disp(5);
		
		System.out.println("Hello Python");
		
		obj.disp(6);
		
		int x = 100;
		int [] br = {100, 200, 300};
		obj.inc(x);
		//x값은 직접 호출해서 변경하지 않는 이상 절대 변경X
		System.out.println("x = " + x);
		//참조형의 경우 메소드의 매개변수로 대입되면 데이터가 변경될 수 있다.
		obj.dec(br);
		System.out.println("br[0] =  " + br[0]);
		
		obj.sum(5,4,4,6,8,4,2,4,8,1,55);
		
		obj.addDisplay(100,  200);
		
		//return이 있는 메소드
		int r = obj.addReturn(200,  300);	//결과가 r에 저장된다.
		System.out.println("결과 = " + r);
		r = obj.addReturn(r,  800);
		System.out.println("결과 = " + r);
		//return값이 있으면 매개변수가 될 수 있다.
		r = obj.addReturn(700,  obj.addReturn(100, 200));
		System.out.println("결과 = " + r);
	}

}
