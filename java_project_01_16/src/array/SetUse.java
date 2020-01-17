package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUse {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(100);
		set.add(300);
		set.add(200);
		set.add(500);
		set.add(400);
		
		for(Integer temp : set) {
			System.out.println(temp);
		}

	}

}
