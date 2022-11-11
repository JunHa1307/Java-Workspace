package com.kh.run;

import com.kh.variable.*;

public class Run {

		public static void main(String[]args) {
			
			A_Variable av = new A_Variable();
			
			//av.PrintVariable();
			//av.declareVariable();
			//av.initVariable();
			//av.constantVariable();
			B_KeyboardInput bk = new B_KeyboardInput();
			//bk.inputTest1();
			//bk.inputTest2();
			
			C_Cast cc = new C_Cast();
			//cc.autocasting();
			//cc.forcecasting();
			
			D_printf dp =new D_printf();
			dp.printfTest();
		}
}