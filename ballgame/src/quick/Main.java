package quick;

public class Main {

	public static void main(String[] args) {
		String [] ar = {"R", "B", "B", "B", "R", "B", "R", "R", "R"};
		int len = ar.length;
		
		Test.ballCount(0, len-1,  ar);
				
		for(String e : ar) {
			System.out.print(e + "\t");
		}

	}
}