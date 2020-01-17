package java_project_01_06;

import java.util.Scanner;

public class Test_8 {

	private static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합을 구할 항의 번호 : ");
		int su = sc.nextInt();
		
		if(su == 1){
			System.out.print("합은 1 \n");
		}else if(su == 2){
			System.out.print("합은 2 \n");
		}else{
			sum = 2;  		
			int f1 = 1;	
			int f2 = 1;	
			int f = 2;		
			for(int i = 3; i <= su; i = i + 1){
				sum = sum + f;
				f2 = f1;
				f1 = f;
				f = f1 + f2;
			}
			System.out.print("합은 " + sum + "입니다.");
		}

	}

}
