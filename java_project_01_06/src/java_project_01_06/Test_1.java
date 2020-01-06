package java_project_01_06;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
//1부터 10까지를 출력하는 반복문
		for(int i = 1; i < 11; i = i + 1) {
			//4의 배수에서 종료시킨다.
			if (i % 4 == 0) {
				break;
			}
			
			System.out.println("i = " + i);
		}
		System.out.println("======================================================== =" );
		for(int i = 1; i < 11; i = i + 1) {
			//4의 배수만 뺀다.
			if (i % 4 == 0) {
				continue;
			}
			
			System.out.println("i = " + i);
		}
//일정한 패턴 반복과 나머지 연산자 이용 -> ON과 OFF를 교대로 10번 출력하기
		for(int j = 0; j < 10; j = j + 1) {
			if(j % 2 == 0) {
				System.out.println("ON");
			}else {
				System.out.println("OFF");
			}
			
		}
//페이지 개수를 만들 땐 나누어 떨어지지 않는다면 몫에 +1을 해야 한다.
		int total = 1164;
		int  pagesu =  (1164 / 15) + 1;
		for(int i = 0; i < pagesu; i = i + 1) {
			int p = 15 * i + 1;
			System.out.println("URL" + p + "URL");
		}
//정수를 입력받아서 소수 판별하기
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판별할 정수를 입력하세요 : ");
		int su = sc.nextInt();
		
		boolean flag = false;  //소수 판별을 위한 flag변수를 생성
		
		for(int h = 2; h <= su/2; h = h + 1) {
			if(su % h == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag = false) {
			System.out.println(su + "는 소수");
		}else {
			System.out.println(su + "는 소수가 아니다.");
		}
		
		sc.close();
		
		for(int a = 0; a < 5; a = a + 1){
			for(int d = 0; d < 5; d = d + 1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int a = 0; a < 5; a = a + 1){
			for(int d = 0; d < d + 1; d = d + 1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int a = 0; a < 5; a = a + 1){
			for(int d = 0; d < 5 - d; d = d + 1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}

}
