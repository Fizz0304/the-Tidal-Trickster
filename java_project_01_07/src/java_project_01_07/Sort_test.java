package java_project_01_07;

public class Sort_test {

	public static void main(String[] args) {
// 선택 정렬은 첫 번째부터 마지막 바로 앞까지 자신의 뒤에 있는 모든 위치의 데이터와 비교해 정렬한다.
// 오른차순은 부등호의 방향이 >, 내림차순은 부등호의 방향이 < 이 된다.
		int [] ar = {20, 30, 40, 50, 10};
		int len = ar.length;
		boolean flag = false;
		for(int i = 0; i < len - 1; i = i + 1){
			for(int j = 0; j < len - 1; j = j + 1){
				if(ar[j] > ar[j + 1]){
					int temp = ar[j];
					ar[j] = ar[i + 1];
					ar[j + 1] = temp;
					flag = true;
				}
			}
		}
		for(int data : ar) {
			System.out.print(data);
		}
	}

}
