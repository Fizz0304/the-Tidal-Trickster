package java_project_01_08;

public class Main {
	//재귀를 이용하지 않은 피보나치 수열
	public static int fibo1(int n) {
		if(n == 1|| n == 2) {
			return 1;
		}else {
			int result = -1;
			int f2 = 1;
			int f1 = 1;
			for(int i = 3; i <= n; i = i + 1) {
				result = f2 + f1;
				f2 = f1;
				f1 = result;
			}
			return result;
		}
	}
	
	//재귀를 이용한 피보나치 수열
	public static int fibo2(int n) {
		if(n == 1|| n == 2) {
			return 1;
		}else {
			return fibo2(n-1) + fibo2(n-2);
		}
	}
	
	
	public static void main(String[] args) {
		Student student = new Student();
		//인스턴스 변수에 값을 설정
		student.setNum(1);
		student.setName("LEE");
		student.setMajor("cs");
		//인스턴스 변수 가져오기
		System.out.println("번호 = " + student.getNum());
		System.out.println("이름 = " + student.getName());
		System.out.println("전공 = " + student.getMajor());
		
		//현재 클래스 내부에 있는 메소드를 호출할 땐 이름만 기재한다.
		int r1 = fibo1(50);
		System.out.println("r1 = " + r1);
		
		int r2 = fibo2(50);
		System.out.println("r2 = " + r2);
	}

}
