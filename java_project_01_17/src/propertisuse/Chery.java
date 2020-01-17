package propertisuse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Chery {

	public static void main(String[] args) {
		String[] image = {"!", "@", "#", "$", "%", "^"};
		
		Random r = new Random();
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < 3; i = i + 1) {
			String temp = image[r.nextInt(image.length)];
			System.out.println(temp);
			list.add(temp);
		}
		System.out.print("\n");

		if(list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
			System.out.println("3개가 모두 일치");
		}else if(list.get(0) == list.get(1)) {
			System.out.println("앞의 2개가 일치");
		}else {
			System.out.println("꽝꽝");
		}
		
		//랜덤한 문자열 만들기
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		//이미지 파일 등을 업로드 했을 때 파일 이름, 유저 구분을 위한 이름 등을
		//만들 때 이용한다.
		
		
	}

}
