package quick;

public class Test {
	
	public static void ballCount(int left, int right, String [] data) {
		for(String e : data) {
			System.out.print(e + "\t");
		}
		System.out.print("\n");
		
//------------------------------------------------------		
		int pivot = left;

		int j = pivot;
		
		int count = 0;
		
		for(int i=pivot+1; i <= right; i=i+1) {
				if(data[pivot] == data[i]) {
					j = j + 1;
					String temp = data[j];
					data[j] = data[i];
					data[i] = temp;
					count = count + 1;
				}
			}
		
		System.out.println("이동 횟수 : " + count);
		
		
/* 	String temp = data[pivot];
		data[pivot] = data[j];
		data[j] = temp;
		//pivot 의 값을 j로 변경
		pivot = j; */
//--------------------------------------------------------		
		}
	}
