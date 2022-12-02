package com.kh.chap05_assist2.run;

import com.kh.chap05_assist2.model.dao.ObjectDao;
import com.kh.chap05_assist2.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		ObjectDao od = new ObjectDao();
		
//		od.fileSave("Phone.txt");//객체 단위로 기록되어 있기 대문에 깨져서보이지만, 재대로 기록된 것
//		od.fileRead();
		
		ObjectsDao ods = new ObjectsDao();
//		ods.fileSave("PhoneList.txt");
		ods.fileRead();
	}

}
