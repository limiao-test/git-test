package com.wang.oper;


/**
 * 关系运算。
 * 
 * 大于，小于，等于，不等于 ，大于等于，小于等于
 * 
 */
public class Demo2 {
	
	/*
	 * 关系运算符：
	 * （1）大于：>
	 * （2）小于：<
	 * （3）等于：==
	 * （4）不等于：!=
	 * （5）大于等于：>=
	 * （6）小于等于：<=
	 */
	
	/**
	 * 关系运算。
	 */
	public void test1(){
		//定义变量
		int x = 5;
		int y = 3;
		
		//关系运算
		boolean b1 = x > y; 
		boolean b2 = x < y; 
		boolean b3 = x == y; 
		boolean b4 = x != y; 
		boolean b5 = x >= y; 
		boolean b6 = x <= y; 
		
		//输出结果
		System.out.println(x + ">" + y + ":" + b1);
		System.out.println(x + "<" + y + ":" + b2);
		System.out.println(x + "==" + y + ":" + b3);
		System.out.println(x + "!=" + y + ":" + b4);
		System.out.println(x + ">=" + y + ":" + b5);
		System.out.println(x + "<=" + y + ":" + b6);
	}
	
	/**
	 * 关系运算符能否连续运算？
	 */
	public void test2(){
		int a = 1;
		int b = 2;
		int c = 3;
		
//		boolean bool = a < b < c;   不可以
		
	}
	
	/**
	 * 表达式的值。
	 */
	public void test3(){
		//表达式的值1
		int a = 1;
		int b = 2;
		int c = 3;
		
		boolean bool1 = a + b < c;
		System.out.println(a + "+" + b + "<" + c + ":" + bool1);
		
		//表达式的值2
		boolean bool2 = a + b + c < c + 2 + 3;
		System.out.println(a+"+"+b+"+"+c+"<"+c+"+"+"2+3:" + bool2);		
	}
	
}


