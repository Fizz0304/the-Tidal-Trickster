package listoflist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		//롤 챔피언
		ArrayList<String> ad = new ArrayList<String>();
		ad.add("트리스타나");
		ad.add("이즈리얼");
		ad.add("카이사");
		ad.add("코그모");
		ad.add("루시안");
		
		ArrayList<String> ap = new ArrayList<String>();
		ap.add("아리");
		ap.add("카사딘");
		ap.add("벨코즈");
		ap.add("제라스");
		ap.add("에코");
		
		ArrayList<String> sp = new ArrayList<String>();
		sp.add("소나");
		sp.add("소라카");
		sp.add("나미");
		sp.add("쓰레쉬");
		sp.add("베이가");
		
		//챔피언별로 다시 List만들기
		ArrayList<ArrayList<String>> players = new ArrayList<ArrayList<String>>();
		
		players.add(ad);
		players.add(ap);
		players.add(sp);		//팀이 추가되면 출력 로직도 수정해야 한다.
		
		//데이터 출력하기
		//전체 리스트를 하나하나의 리스트로 imsi에 대입되고
		for(int i = 0; i < players.size(); i = i + 1) {
			if(i == 0) {
				System.out.print("원딜 - ");
			}else {
				System.out.print("미드 - ");
			}
			
			ArrayList<String> imsi = players.get(i);
			for(String temp : imsi) {
		//imsi의 데이터를 하나씩 temp에 대입한다. 
				System.out.print(temp + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		
		//앞 로직의 문제는 List의 List를 만들 때 각 List의 특징을 같이 저장하지
		//못 한다. 팀 이름은 문자열이고 팀의 선수 명단은 배열이라서 같이 List에 
		//저장 할 수 없다. 이 부분을 Map이나 Class로 해결해야 한다. 
		
		//이럴 땐 List와 팀 이름을 갖는 Map을 형성하면 된다
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("champ",  "원딜");
		map1.put("player", ad);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("champ",  "미드");
		map2.put("player", ap);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("champ",  "서폿");
		map3.put("player", sp);
		
		//Map에 List를 생성
		ArrayList<Map<String, Object>> lol = new ArrayList<Map<String, Object>>();
		lol.add(map1);
		lol.add(map2);
		lol.add(map3);
		
		//출력하는 부분
		for(Map<String, Object> map : lol) {
			System.out.print(map.get("champ") + ":");
			ArrayList<String> p = (ArrayList<String>)map.get("player");
			//Map은 항상 형 변환을 해야 한다.
			for(String temp : p) {
				System.out.print(temp + "\t");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
