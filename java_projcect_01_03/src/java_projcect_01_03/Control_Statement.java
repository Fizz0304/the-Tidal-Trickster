package java_projcect_01_03;

import java.util.Scanner;

public class Control_Statement {

	public static void main(String[] args) {
		
		//점수를 입력받아서 60점이 넘으면 합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		//점수가 60 이상이면 합격이라고 출력
		if (score >= 60){
			System.out.println("합격입니다.");
			}

		// 점수가 60이상이면 합격, 아니면 불합격
		Scanner sc1 = new Scanner(System.in);
		
		
		System.out.print("점수 입력 : ");
		int score1 = sc1.nextInt();
		
		//점수가 60 이상이면 합격이라고 출력
		if (score1 >= 60){
			System.out.print("합격입니다.");
			}else {
				System.out.print("불합격입니다.");
			}
		
		//90 -100 : A, 80 - 90 : B, 70 - 80 : C, 60 - 70 : D, 0 - 60 : F
		if(score >= 90 && score <= 100) {
			System.out.print("A");
		}else if(score >= 80 && score < 90){
			System.out.print("B");
		}else if(score >= 70 && score < 80){
			System.out.print("C");
		}else if(score >= 60 && score < 70){
			System.out.print("D");
		}else if(score >= 0 && score < 60) {
				System.out.print("F");
		}else {
			System.out.println("잘못된 점수 입력");
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("메뉴 번호 입력 : ");
		int menu_num = sc2.nextInt();
		
		switch(menu_num){
		case 1:
			System.out.print("한식 ");
			break;
		case 2:
			System.out.print("중식 ");
			break;
		case 3:
			System.out.print("분식 ");
			break;
		default:
			System.out.print("일식 ");
			break;
		}
			
		
		
		sc.close();  //자동으로 import된다.
		
	}

}
