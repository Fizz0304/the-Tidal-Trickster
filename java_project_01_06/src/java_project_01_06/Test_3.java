package java_project_01_06;

public class Test_3 {

	public static void main(String[] args) {
		//초기값을 가지고 문자열 배열을 생성하기
		String [] strAr = {"피즈", "노틸러스", "리 신", "루시안", "카이사"};
		
		//데이터 1개만 출력해보기
		System.out.println(strAr);      //주소값이 출력되어버린다.
		System.out.println(strAr[0]);  //인덱스를 붙여야 내가 원하는 값인 피즈가 출력된다.

		//데이터 전체를 출력하기, 배열 이름.length는 배열의 데이터 개수를 정수로 리턴한다.
		for(int i = 0; i < strAr.length; i = i + 1) {
			System.out.println(strAr[i]);
		}
		
		System.out.println("===================================================");
		
		//배열을 기본 값으로 만들고 나중에 데이터를 채우기
		//참조형 변수가 생성된 것이지 데이터가 만들어진 것은 아니기 때문에 NullPointerException
		/*String [] homerunHitters = null;
		System.out.println(homerunHitters[0]); */
		
		//크기 이상으로 데이터를 넣는다면 ArrayIndexOutOfBoundsException가 발생한다.
		String [] champ  = new String[3];
		champ[0] = "가렌";
		champ[1] = "갈리오";
		champ[2] = "나르";
		//champ[3] = "누누"; 
		
		//참조형 내부 데이터를 기본형으로 저장해서 반복문 안에선 기본형 데이터로 접근 -> 두 번째 접근부터 메모리 접근 횟수가 감소
		int len = champ.length;
		for(int i = 0; i < len; i = i + 1) {
			System.out.println(champ[i]);
		}
		
		//빠른 열거를 이용한 접근, 데이터의 시작과 끝을 직접 작성하지 않기 때문에 Index오류를 일으키지 않는다.
		for(String temp : champ) {
			System.out.println(temp);
		}
		
		
		
	}

}
