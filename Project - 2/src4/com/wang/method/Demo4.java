package com.wang.method;

/**
 * 变量的作用域。
 * 变量能够正常工作的范围。
 * 全局变量和局部变量。
 * 
 */
public class Demo4 {
	
	/*
	 * 全局变量：定义在类范围级别的变量。
	 * 
	 */
	
	//定义全局变量
	int a = 10;
	int b = 5;
	
	/**
	 * 加法。
	 * 使用全局变量。
	 */
	public int sum(){
		
		return a + b;
	}
	
	/**
	 * 减法。
	 * 使用全局变量。
	 */
	public int sub(){
		
		return a - b;
	}
	
	/*
	 * 局部变量：定义在函数内的变量。
	 */
	
	/**
	 * 乘法。
	 * 自定义局部变量。 
	 */
	public int mul(){
		//定义局部变量
		int a = 5;
		int b = 6;
		return a * b;
	} 
	
	/**
	 * 除法。
	 * 参数变量。
	 */
	public int div(int a, int b){
		int c = 0;
		c = a + b;
		
		return c;
		
		//思考：函数的参数，是局部变量？还是全局变量？
        //局部 变量		
	}
	
	/*
	 * if中的局部变量
	 */
	public int test1(int a,int b){
		int c = a + b;
		System.out.println("c:" + c);
		if (c > 5){	    
		}
		return c;
	}
	
	/*
	 * for中的局部变量
	 */
	public void test2(){
		
		
		
	}
	
	
}



















