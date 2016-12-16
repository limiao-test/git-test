package com.wang.oper;

/**
 * 赋值运算符。
 * 
 */
public class Demo5 {

	/*
	 * 赋值运算符： （1）= （2）+= （3）-= （4）*= （5）/= （6）%=
	 */

	/**
	 * =
	 */
	public void test1() {
		// 赋值=
		int a = 3; /* 常量赋值 */
		System.out.println("a=" + a);

		int b = a; /* 变量赋值 */
		System.out.println("b=" + b);

		int c = a++; /* 表达式赋值 */
		System.out.println("c=" + c);

		int d = a + b + c;	/* 表达式赋值 */
		System.out.println("d=" + d);
		
		boolean b1 = a > b;
		System.out.println("b1=" + b1);
		
		boolean b2 = a > b && a > c;
		System.out.println("b2=" + b2);
	}
	
	
	/**
	 * =
	 */
	public void test2() {
		// +=
		int a = 0; 
		a += 3;
		System.out.println("a=" + a);

		//-=
		int b = 4;
		b -= 3;
		System.out.println("b=" + b);

		//*= 
		int c = 2; 
		c *= 3;
		System.out.println("c=" + c);

		// /=
		int d = 6;
		d /= 2;
		System.out.println("d=" + d);
		
		// %=
		int e = 10;
		e %= 3;
		System.out.println("e=" + e);
	}

}







