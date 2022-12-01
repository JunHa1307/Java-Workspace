package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// 프로그램 ---> 외부매체(파일)
	
	public void fileSave() {
		
		//FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("b_char.txt");
			fw.write("WOW!, 아이오재밌당 \n");
			fw.write('A');
			fw.write(" ");
			char[] cArr = {'a', 'p' ,'p', 'l','e'};
			fw.write(cArr);
			
			fw.flush();//지금 출력문자가 너무 적어서 버퍼에 남아있기때문에 강제로 모두 출력
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//프로그램 <--- 외부매체(파일)
	public void fileRead() {
		
		//FileReader : 파일로부터 데이터를 2byte단위로 입력받는 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			int value = 0;
			
			while((value = fr.read())!= -1) {
				System.out.print((char)value);	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
