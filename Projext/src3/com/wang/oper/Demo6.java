package com.wang.oper;

/**
 * 条件运算符。
 * 
 */
public class Demo6 {

	/*
	 * 条件运算符： ? :
	 */

	/**
	 * 
	 */
	public void test1() {
		
		int x = 70;
		
		char ch = x >= 60 ? 'A' : 'B'; 
		System.out.println("ch=" + ch);
		
		boolean b = x >= 60 ? true : false; 
		System.out.println("b=" + b);
		
		int i = x >= 60 ? 1 : 0; 
		System.out.println("i=" + i);
		
		String s = x >= 60 ? "yes" : "no"; 
		System.out.println("s=" + s);
	}
	
	
	/**
	 * 
	 */
	public void test2() {
		
		int x = 70;
		char ch = x >= 80 ? 'A' : (x > 60 ? 'B' : 'C');
		System.out.println("ch=" + ch);
	}

}







