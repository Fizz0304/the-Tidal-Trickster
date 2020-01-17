package java_project_01_06;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수인지 판별할 정수를 입력하세요 : ");
		int su = sc.nextInt();
			
		boolean flag = false;  //소수 판별을 위한 flag변수를 생성
			
		for(int i = 2; i <= su/2; i = i + 1) {
			if(su % i == 0) {
				flag = true;
				break;
			}			
			
		}	
		
		if(flag == false) {
			System.out.println(su + "는 소수");
		}else {
			System.out.println(su + "는 소수가 아니다.");
		}
		
		sc.close();

	}

}
