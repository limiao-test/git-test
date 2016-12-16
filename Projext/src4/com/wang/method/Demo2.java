package com.wang.method;

/**
 * 函数参数。
 * 函数返回值。
 */
public class Demo2 {
	
	/*
	 *  函数参数问题：
	 *  （1）参数类型
	 *  （2）参数个数
	 *  （3）书写方式
	 */
	
	/**
	 * 无参数。
	 */
	public void fun1(){
		
		int a = 1;
		int b = 2;
		System.out.println(a + "+" + b + "=" + (a+b));
		
	}
	
	/**
	 * 1个参数，int类型。
	 */
	public void fun2(int a){
		System.out.println("您传递进来的参数是：" + a);
	}
	
	/**
	 * 1个参数，float类型。
	 */
	public void fun3(float a){
		System.out.println("您传递进来的参数是：" + a);
	}
	
	/**
	 * 1个参数，String类型。
	 */
	public void fun4(String a){
		System.out.println("您传递进来的参数是：" + a);
	}
	
	/**
	 * 3个参数，2个int类型，1个String类型。
	 * 
	 */
	public void fun5(int a, int b, String s){
		System.out.println("您传递进来的参数是：" + a + "," + b + "," + s);
	}
	
	
	
	/*
	 *  返回值问题：
	 *  （1）返回值类型
	 *  （2）返回值个数
	 *  （3）书写方式
	 *  （4）void和return
	 */
	
	/**
	 * 无返回值，用void声明。
	 * 
	 */
	public void fun10(){
		System.out.println("此函数无返回值");
	}
	
	/**
	 * 有返回值，必须声明返回值类型。
	 * 
	 * 此函数返回值int型。
	 * 
	 */
	public int fun11(int a, int b){
		int c = 0;
		c = a + b;
		
		return c;
	}
	
	/**
	 * 有返回值。float型。
	 *
	 */
	public float fun12(float a, float b){
		float c = a + b;
		
		return c;
	}
	
	/**
	 * 有返回值。String型。
	 * 
	 */
	public String fun13(String s1, String s2){
		
		return s1 + s2;
	}
	
	/**
	 * 利用return结束程序。
	 * 
	 */
	public int fun14(int a, int b){

		int c = 0;
		
		//被除数为0
		if (a == 0) {
			System.out.println("被除数为0");
			return 0;
		}
		
		//除数为0
		if (b == 0) {
			System.out.println("除数为0");
			return 0;
		}
		
		//正常计算
		System.out.println("正常计算");
		c = a / b;
		return c;
	}
	
}
