package quicktest;

import java.io.File;

public class File_test {

	public static void main(String[] args) {
		File f = new File("C:\\image\\fizz6.jpg");
		System.out.println(f);
		f.delete();
		System.out.println(f);
	}

}
