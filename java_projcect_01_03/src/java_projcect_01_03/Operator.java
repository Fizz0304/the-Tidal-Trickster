package java_projcect_01_03;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int a = 20;
		int b = 13;
		System.out.println("a&b : " + (a&b));
		System.out.println("a|b : " + (a|b));
		System.out.println("a^b : " + (a^ b));
		
		int c = 10;															//a > 5이기 때문에 true가 되고 a++은  10보다 작다(아직 수행하지 않아서 10)
		boolean result = c > 5 && (c++ > 10);
		System.out.println("결과 : " + result);
		System.out.println("c : " + c);
		
		 result = c
				 < 5 && (c++ > 10);						//a < 5는 false기 때문에 뒤 문장을 수행하지 않아 a의 값은 증가하지 않는다. 
		System.out.println("결과 : " + result);
		System.out.println("c: " +c);
		
		int x = 10;   //x가 4의 배수인지 판별해 보기
		boolean result1= (x % 4 == 0) && (x != 2);
		System.out.println("결과 : " + result1);
		
		int year = 2020;  //윤년은 4의 배수이고 100의 배수가 아닌 경우이거나 400의 배수인 경우
		boolean result2 = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		System.out.println("결과 : " + result2);
		
		
		int second = 309209;                                   
		int sec = second % 60;
		int minute = 309209 / 60;
		int min = minute % 60;          // minute = (second - (day * 86400) - (hour * 3600))/60 
		int hour = minute / 60;
 		int ho = hour % 24;                // hour = (second - (day * 86400))/3600;
 		int day = hour / 24;               // day = second / 86400;
 		
 		//초는 분까지 가져간 것을 모두 빼면 되지만, 일, 시간, 분은 전부 60의 배수이기 때문에 60으로 나눈 나머지가 모두 뺀 값이 된다.
 		System.out.println(day);
 		System.out.println(ho);
 		System.out.println(min);
 		System.out.println(sec);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		
		System.out.println("이름은"  + name + "나이는" + age);
		
		
		
		
		
		
		
		
	}

}
