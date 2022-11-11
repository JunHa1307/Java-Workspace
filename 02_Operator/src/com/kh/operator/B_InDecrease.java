package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감연산자 (단항연산자) ++ -- 
	 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
	 * 		++변수(전위연산자) 변수++(후위연산자)
	 * -- : 변수에 담긴 값을 1 감소시키는 연산자
	 * 		--변수(전위연산자) 변수--(후위연산자)
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선 증감 후 처리
	 * 변수(증감연산자) : 후위연산 -> 선 처리 후 증감
	 * 
	 * 
	 */
	
	
	public void method1() {
		
		//전위 연산 테스트
		int num =10;
		System.out.println("전위 연산 적용 전 num : "+ num);
		System.out.println("1회 수행 후 결과 : "+ ++num);//+++하면 오류
		//10에서 증감연산자를 실행하여 num값을 증가시키고 최종적으로 11이 출력됨
		System.out.println("2회 수행 후 결과 : "+ ++num);//현재 num에 11이 담겨있기 때문에 12가 출력됨
		System.out.println("3회 수행 후 결과 : "+ ++num);//13
		
		System.out.println("마지막 num의 값은: "+ num);
		
		System.out.println("===================================");
		
		
		//후위 연산 테스트
		int num2 = 10;
		System.out.println("후위 연산 적용 전 num2: "+ num2);//10
		System.out.println("1회 수행 후 결과 : "+ num2++);//10출력 후 1 증가
		//즉, 출력 당시에는 10이 출력되고, 출력 처리가 끝난 후 11로 증감처리됨
		System.out.println("2회 수행 후 결과 : "+ num2++);//11출력 후 1증가 num =12
		System.out.println("3회 수행 후 결과 : "+ num2++);//12 출력 후 1 증가 num =13
		
		System.out.println("최종 num2의 값  : "+ num2);
		
	}
	
	public void method2() {
		//전위연산
		int a = 10;
		int b = ++a;//b =11 a =11
		System.out.println("a : "+ a +", b : "+ b);//11 11
		
		//후위연산
		int c = 10;
		int d = c++;// d = 10 c = 11
		System.out.printf("c : %d, d : %d\n",c,d);//11 10
		
		int num =20;
		System.out.println("현재 num :"+ num);//20
		System.out.println("++num ? :"+ ++num);//21
		System.out.println("num++ ? :"+ num++);//21
		System.out.println("--num ? :"+ --num);//21
		System.out.println("num-- ? :"+ num--);//21
		
		System.out.println("최종 num :"+ num);//20
		
	}
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ *3;// result1 = 20 *3 연산 후 num1 =num1 + 1 (21)
		
		System.out.println("num1 : "+ num1);
		System.out.println("result1 : "+ result1);
		
		int num2 = 20;
		int result2 = ++num2 *3; //num2 = num2 +1 연산 후 result2 = 21 * 3 (63)
		System.out.println("num2 : "+ num2);
		System.out.println("result2 : "+ result2);
	}
	
	public void method4() {
		int a =10;
		int b = 20;
		int c = 30;
		
		//주석으로 어떤 값이 출력될지 예상해보기
		
		System.out.println(a++);//10
		System.out.println((++a) + (b++));//32
		System.out.println((a++) +(--b)+(--c));//61
		System.out.println("a : "+ a +", b : "+ b + ", c : "+ c);// 13 20 29 
	}
	
	public void quiz() {
		
		int a= 5;
		int b= 10;
		int c = ++a +b; // a : 6 b : 10 c : 16
		int d = c/a; // d : 2
		int e = c%a; // e : 4
		int f = e++; // e : 5 f : 4
		int g = (--b) + (d--); //b : 9 d : 1 g : 11
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);// 6 + 9 / (15/4) * 10 % 8 = 12
		
		System.out.println("a : "+ a);//7
		System.out.println("b : "+ b);//9
		System.out.println("c : "+ c);//15
		System.out.println("d : "+ d);//1
		System.out.println("e : "+ e);//6
		System.out.println("f : "+ f);//4
		System.out.println("g : "+ g);//10
		System.out.println("h : "+ h);//2
		System.out.println("i : "+ i);//12

	}
	
	
	
}
