package java_projcect_01_03;

public class Loop {

	public static void main(String[] args) {
		int i = 0;														
		while(i < 3) {
			System.out.println("Hello Java");
			i = i + 1;
		}

		i = 0;
		do {
			System.out.println("Hello Java");
			i = i + 1;
		}while(i < 3);
		
		for(i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
		
	}

}
