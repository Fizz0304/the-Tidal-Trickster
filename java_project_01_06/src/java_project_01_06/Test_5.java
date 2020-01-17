package java_project_01_06;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		// 키보드로부터 데이터를 입력바기 위한 객체 생성
		Scanner sc = new Scanner(System.in);

		// 1~45까지의 정수 6개를 저장할 자료구조를 생성
		int[] lotto = new int[6];

		// 6번 반복
		for (int i = 0; i < 6; i = i + 1) {
			// 정수를 입력 받아서 su에 저장한다.
			System.out.print(i + "번째 숫자 : ");
			int su = sc.nextInt();
			// 1~45 중 숫자만 저장하고 그 이외에는 다시 입력
			if (su < 1 || su > 45) {
				System.out.print("1~45까지만 입력하세요\n");
				// 이대로 진행하면 빈 값이 되기 때문에 입력을 무효화 해야한다
				i = i - 1;
				continue;
			}
			lotto[i] = su;
			// 데이터 중복 검사
			if (i > 0) {
				boolean flag = false;

				// 첫 번째 데이터부터 현재 입력할 데이터의 앞까지 비교
				for (int j = 0; j < i; j = j + 1) {
					// 현재 입력받은 데이터와 같은 지 비교
					if (lotto[j] == su) {
						flag = true;
						System.out.print("중복된 데이터, 다시 입력\n");
						// 더 이상 비교할 필요가 없다
						break;
					}
				}
				// 이전 데이터와 동일한 데이터를 만나면 다시 입력받도록 작성.
				if (flag == true) {
					i = i - 1;
					continue;
				}
			}
		}
		int len = lotto.length;
		for(int i = 0; i < len - 1; i = i + 1){
			for(int j = i + 1; j < len; j = j + 1){
				if(lotto[i] > lotto[j]){
					int temp = lotto[i];	//swap을 발생
					lotto[i] =lotto[j];
					lotto[j] = temp;
				}
			}
		}
			// 입력 받은 데이터 출력
			for (int temp : lotto) {
				System.out.print(temp + "\t");
			}

			sc.close();

		
	}
}

//컨트롤 + 쉬프트 + F4

