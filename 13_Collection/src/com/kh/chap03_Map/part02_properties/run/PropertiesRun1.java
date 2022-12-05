package com.kh.chap03_Map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {

		// Properties : Map 계열 => Key, Value세트로 저장
		// 				단, key, value값 모두 String 으로 제한되어있음
		
		Properties prop =new Properties();
		
		// String이 아닌 값을 넣게 될 경우
		// Map계열이기 때문에 put메서드 활용가능
		
//		prop.put("다이제", new Snack("초코맛", 1000));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		// 단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 Key + Value값 세트들을 파일로 기록하기 위해 사용됨
//		try {
//			prop.store(new FileOutputStream("Test.properties"), "Properties Test");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Properties에 값을 추가할 때는 보통
		// 1. setProperty(String key, String value);
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);//저장순서 유지 X, Key값 중복 X
		
		// 값 가져오기
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("Set"));
		
		// 3. store(OutputStream, String Comment) : Properties에 담긴 key - value값들을 파일로 출력
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
		// 4. storeToXML(OutputStream os, Stirng Comments) : Properties에 담긴 Key - value값들을 xml 문서로 출력	
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
