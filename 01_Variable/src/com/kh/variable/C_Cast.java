package com.kh.variable;

public class C_Cast {
	/*
	 * 형 변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서의 값 처리 규칙 1. 대입 연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다. 
	 * => 즉, 같은 자료형에 해당하는 값만 대입이 가능하다. 
	 * => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수. 
	 * [표현법]자료형 변수명 = (바꿀 자료형) 값;
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능하다. => 즉, 다른 자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야한다. 
	 * [표현법] 값+ (바꿀자료형) 값;
	 * 
	 * 형 변환의 종류: 1. 자동 형 변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 형변환할 필요가 없음. => 작은바이트의 자료형
	 * => 큰바이트의 자료형 
	 * 2. 강제(명시적) 형변환 => 자동형변환이 되지 않아 내가 직접 강제로 형변환을 해야하는 경우 
	 * 큰바이트의 자료형=> 작은 바이트의 자료형
	 * 
	 * [표현법] (바꿀자료형) 값;
	 * 
	 * (바꿀자료형) == 형변환연산자 ==cast 연산자
	 * 
	 * **boolean은 형변환 불가
	 */
	// 자동형변환 : 작은바이트의 자료형이 큰 바이트의 자료형으로 변환되는 경우
	public void autocasting() {
		// 1. int (4byte) -> double (8byte)
		int i1 = 10;
		double d1 = (double) i1; // 자동으로 형변환
									// 컴퓨터 포장용 상자에 휴대폰을 담은 모양새
									// int는 정수, double은 실수형임 -> d1은 10.0으로 형변환이 된다.
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 +d2;
		System.out.println("result : "+ result);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3; //1000
		
		long l4 = 2000L; //long은 L이 필수가 아니다 (자동형변환이 되기 때문) 
						//float는 실수 기본형 double에서 더 작게 형변환되어야 하기 때문에 필수로 f 가 온다
		
		//3. 특이 케이스 long(8byte) -> float(4byte)
		// 정수가 실수로 담길 때에는 큰사이즈의 정수여도 작은사이즈의 실수변수에 대입 가능.
		// 아무리 4byte float라고 해도 long형보다 담을 수 있는 값의 범위가 더 크기 때문
		// float형이 실수이기 때문에 표현가능한 범위의 수가 더 커서 자동형변환이 이루어짐
		
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5;
		System.out.println("f5 : "+ f5);
		
		//4. 특이케이스 char(2byte) <-> int(4byte) :양방향 형변환 가능
		char ch = 65;
		System.out.println("ch : "+ch);
		
		int num ='A';
		System.out.println("num : "+ num);
		/*
		 * char 범위는 0~ 65xxx :각 문자마다 고유의 정수값이 정해져 있다. 따라서 쌍방향 변환이 가능
		 * 음수값은 오류가 난다.
		 * 참고 : ascii코드 (0~127,영문자 대소문자, 숫자, 특수문자)
		 * 		 uni코드 (0~65xxx , 영어 , 숫자, 특수문자, 한글,그외 언어) 
		 */
		System.out.println((int)'ㄱ');
		
		char sum = 'A'+10; //65+10 =75 문자와 정수 사이에 연산이 가능하다.
		System.out.println(sum);
		
		
		//5.특이 케이스 byte 와 short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		//byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다.
		byte b3 = (byte)(b1 + b2);//강제로 형변환 해줘야한다.
		
	}
	//강제(명시적) 형 변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우
	public void forcecasting() {
		//1. double(8byte) -> float(4byte)
		float f1 = 4.0f;//반드시 f를 붙여줘야 한다.
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		//2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3;
		System.out.println("i3 : " + i3);
		
		int iNum = 10;
		double dNum =5.89;
		
		//iNum이 double형으로 우선 변환이 됨. 10 -> 10.0
		//10.0 +5.89 = 15.89 실수값이 반환됨.
		//연산결과가 실수(double)자료형이므로 int형에 대입이 불가능함.
		// 해결방법 1.연산결과를 int형으로 맞춰서 강제 형변환
		int iSum = (int)(iNum + dNum);  
		
		// 해결방법 2. 덧셈 연산 전에 dNum변수를 미리 int형으로 강제 형변환
		//			자동형변환은 작은 바이트 변수가 큰 바이트 변수로 형변환되기 때문에
		//			큰바이트인 dNum변수를 강제로 int형으로 변환시킨다.
		int iSum2 = iNum + (int)dNum;
		
		//실수값을 정수형으로 강제형변환시 소수점아래 부분은 버려짐 (^데이터손실 발생)
		
		// 해결방법 3. 애초에 결과값을 double형 변수에 담기. (v데이터 손실 없이 정확한 값에 담김.)
		double dSum = iNum + dNum;
		System.out.println("iSum : "+ iSum + ", iSum2 : "+ iSum2 + ", dSum : "+ dSum);
		
		/* 데이터 손실 테스트 */
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		//byte(-128 ~ 127)
		//290 - 34 = 256 데이터 손실
		System.out.println("bNum2 : "+ bNum2);
		
	}

}
