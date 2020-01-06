package java_project_01_06;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		for(int a = 0; a < 5; a = a + 1){
			for(int d = 0; d < 5 - d; d = d + 1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int a = 0; a < 5; a = a + 1){
			for(int d = 0; d < 2*a+1; d = d + 1){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int a = 0; a < 5; a = a + 1){
			if(a <= 2) {
				for(int d = 0; d < a + 1; d = d + 1){
					System.out.print("*");
			}
			}else {
				for(int d = 0; d < 5 - a; d = d + 1) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 라인 수 : ");
		int line = sc.nextInt();
		

		sc.close();
		
		
	}
}
