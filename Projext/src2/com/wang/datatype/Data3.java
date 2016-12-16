package com.wang.datatype;

/**
 * 字符型变量。
 * 单个字符（char）
 * 多个字符（String）（String属于复杂类型，此处仅了解）
 */
public class Data3 {
	
	/**
	 * 单个字符变量（char）
	 * 
	 * 2个字节。
	 * 
	 */
	public void testChar(){
		//定义变量
		char c1 = 'a';
		char c2 = 'b';
		
		//字符型变量的值用''。
		
		//访问变量
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
	/**
	 * 多个字符（String）
	 * 
	 */
	public void testString(){
		//定义变量
		String s1 = "hello";
		String s2 = "world";
		
		//字符串变量的值用""。
		
		//访问变量
		System.out.println(s1);
		System.out.println(s2);
	}
}






