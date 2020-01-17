package propertisuse;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Properties props = new Properties();
		
		props.setProperty("name", "ㅎ");
		props.setProperty("nation", "한글");
		
		String name = props.getProperty("name");
		String nation = props.getProperty("nation");
		//자바는 없는 key를 사용하면 null
		String age = props.getProperty("age");
		
		System.out.println(name);
		System.out.println(nation);
		System.out.println(age);
		
		//props를 현재 디렉토리에 temp.xml파일로 내보내기
		try {
			props.storeToXML(new FileOutputStream("temp.xml"), "주석");			
		}catch(Exception e){
			System.out.println("예외 발생 : " + e.getMessage());	
		}
		
		String path = System.getProperty("user.dir");
	     System.out.println("Working Directory = " + path);
		
	}

}
