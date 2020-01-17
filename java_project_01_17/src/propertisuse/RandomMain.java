package propertisuse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		//seed 설정 없이 랜덤 인스턴스 생성 -> seed가 현재 시간을 설정
		Random r1 = new Random();
		//seed를 1번으로 설정
		Random r2 = new Random(1);
		
		//실행할 때마다 다르게 나옴
		int result1 = r1.nextInt();
		//실행할 때마다 동일하게 나옴
		int result2 = r2.nextInt();
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

//복원추출--------------------------------------------------		
		//빨, 파, 녹을 랜덤하게 출력하기
		String [] colors = {"빨강", "파랑", "녹색"};
		//배열에서 배열 안의 인덱스가 랜덤하게 나오도록 r1.nextInt(colors, length)
		//배열의 인덱스에 적용
		String color = colors[r1.nextInt(colors.length)];
																//r1.nextInt(4) % 3
		System.out.println("color = " + color);
		
//비복원추출--------------------------------------------------
		List<Integer> list = new ArrayList<Integer>();
		
		//1~45까지 저장
		for(int i = 1; i < 45; i = i+1) {
			list.add(i);
		}
		//20개 숫자를 비복원 추출 하기
		for(int i = 0; i < 20; i = i + 1) {
			//list 사이즈 내에서 데이터를 추출
			Integer x = list.get(r1.nextInt(list.size()));
			//데이터 제거
			list.remove(x);
			System.out.print(x + "\t");
		}
		//로또, 훈련/테스트 데이터, 고스톱, 포커 등
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
