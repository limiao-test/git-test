package com.wang.method;

/**
 * 方法重载。
 * 方法递归。
 * 
 */
public class Demo3 {
	
	/*
	 * 方法重载。
	 * 
	 * 可不可以定义两个名字相同的函数？
	 * 在java中，允许定义两个名字相同，参数不同的方法，这种方式称为方法重载。
	 */
	
	public int sum(int a, int b){
		
		return a + b;
	}
	
	public double sum(double a, double b){
		
		return a + b;
	}
	
	public String sum(String a, String b){
		
		return a + b;
	}
	
	
	
	
	/*
	 * 方法递归。
	 * 
	 * 方法可不可以自己调用自己？
	 * 
	 */
	
	

	
	public void sub(int count){
		
		count--;
		System.out.println("count:" + count);
		
		sub(count);
		
	}
	
	
	

}


