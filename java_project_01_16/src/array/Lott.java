package array;

import java.util.Scanner;
import java.util.TreeSet;

public class Lott {

	public static void main(String[] args) {
		//자료구조 생성
		TreeSet<Integer> lott = new TreeSet<Integer>();
		//키보드로부터 입력 받기 위한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		while(lott.size() < 6) {
			try {
			System.out.print("1~45까지 중복되지 않은 숫자 = ");
			int su = sc.nextInt();
			
			//1부터 45사이의 숫자인지 검사하기
			if(su < 1 || su > 45) {
				System.out.println("1~45사이의 숫자만 입력");
				continue;
			}
			
			//입력 받은 숫자를 set에 추가하기, 중복되면 false
			boolean result = lott.add(su);
			if(result == false) {
				System.out.println("중복된 숫자");
			}
		}
		catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
				
		sc.close();

	}

	}
}
