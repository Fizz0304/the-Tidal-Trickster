package java_project_01_06;

public class Test_4 {

	public static void main(String[] args) {
		//초기 데이터를 가지고 2차원 배열 생성
		String [][] champ = {{"브라움","노틸러스",  "벨코즈"}, {"시비르", "코그모", "자야"}};
		
		//인덱스를 이용해 배열의 모든 데이터 접근하기
		int rowCnt = champ.length;
		for(int i = 0; i < rowCnt; i = i + 1) {
			int colCnt = champ[i].length;
			for(int j = 0; j < colCnt; j = j + 1) {
				System.out.print(champ[i][j] + "\t");
			}
			System.out.print("\n");
		}
//====================================================================
		//빠른 열거를 이용한 접근
		//2차원 배열을 1차원 배열로 접근
		for(String [] row : champ) {
			//1차원 배열 내 데이터를 열 단위로 접근
			for(String col : row) {
				System.out.print(col + "\t");
				}
			System.out.print("\n");
		}
//=====================================================================
		//2차원 배열 중 모든 행의 열 개수가 동일하다면 하나의 반복문으로 모든 데이터에 접근 가능.
		//champ 배열처럼 모든 행의 열 개수가 3개로 동일하다면 하나의 반복문으로 접근이 가능.
		
		//전체 데이터 개수를 구한 뒤 열의 개수를 이용하면 된다.
		//전체 데이터 개수를 구하는 방법
		int tot = champ.length * champ[0].length;
		//하나의 행에 해당하는 열의 개수
		int colCnt = champ[0].length;
		//하나의 반복문으로 전체 데이터 접근
		for(int i = 0; i < tot; i = i + 1) {
			System.out.print(champ[i/colCnt][i%colCnt] + "\t");
			if(i % colCnt == colCnt - 1) {
				System.out.print("\n");
			}
		}

		
	}

}
