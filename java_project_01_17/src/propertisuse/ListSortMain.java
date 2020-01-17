package propertisuse;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("야구");
		list.add("농구");
		list.add("배구");
		list.add("축구");
		
		//데이터 정렬하기 - Comparator인터페이스를 implements 한 클래스의
		//인스턴스를 만들어 정렬
		StringComp comp = new StringComp();
		list.sort(comp);
		
		//Comparator의 Anonymous Class 만들기
/*		Comparator c = new Comparator(); 이건 에러야~~*/
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		list.sort(c);
		
		

		
		
		//데이터 출력하기
		for(String temp : list) {
			System.out.print(temp + "\t");
		}
		
	}

}
