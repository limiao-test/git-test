package com.wang.method;

/**
 * 函数（方法）的基本格式
 * 
 */
public class Demo1 {
	
	/*
	 * 函数格式。（1）函数头。（2）函数体。
	 * 函数头：修饰符，返回值，方法名，参数列表（）。
	 * 函数体：｛｝
	 * 
	 */
	public void test(){
		//函数功能
		System.out.println("hello world");
	}
	
	
	/**
	 * 两个整数的和。
	 * 
	 * 无参数，无返回值。 
	 */
	public void add1(){
		//函数功能
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("c=" + c);
	}
	
	/**
	 * 两个整数的和。
	 * 
	 * 有参数，无返回值。 
	 */
	public void add2(int x, int y){
		
		int z = x + y;
		System.out.println("z=" + z);
	}
	
	/**
	 * 两个整数的和。
	 * 
	 * 有参数，有返回值。 
	 */
	public int add3(int x, int y){
		
		int z = x + y;
		
		return z;
	}
}













