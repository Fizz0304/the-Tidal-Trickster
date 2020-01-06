package java_project_01_06;

public class Test_6 {

	public static void main(String[] args) {
		int [] ar = {40, 37, 51, 65, 29};
		
		//합계구하기
		int sum = 0;    //초기값이 무조건 0은 아니다.
		for(int data : ar){
			sum = sum + data;
		}
		System.out.print("합계 = " + sum + "\n");
		
		//조건에 맞는 데이터 개수 구하기
		int count = 0;
		for(int data : ar){
			if(data > 50){
				count = count + 1;
			}
		}
		System.out.print("50이 넘는 데이터 개수 = " + count +" 개" +  "\n");
		
		//조건에 맞는 데이터의 평균을 구하기
		//30보다 큰 숫자들의 평균을 소수 첫 번째 자리에서 반올림하기
		int count1 = 0;
		int sum1 = 0;
		for(int data : ar){
			if(data >30){
				count1 = count1 + 1;
				sum1 = sum1 + data;
			}
		}
		if(count1 == 0){
			System.out.print("조건을 만족하는 데이터가 없습니다.");
		}else{
			double avg = (double) sum1 / count1;
			int result = (int) (avg + 0.5);
			System.out.print("평균 = " + result + "\n");
		}	

		//최대값 구하기
		int max = ar[0];
				for(int data : ar){
					if(max < data){
						max = data;
					}
				}
				System.out.print("최대값 = " + max + "\n");
		//최소값 구하기
			int min = ar[0];
			for(int data : ar){
				if(min > data){
					min = data;
				}
			}
			System.out.print("최소값 = " + min);
			
		//50에서 가장 가까운 수 찾기

			
			
		
		
		
	}

}
