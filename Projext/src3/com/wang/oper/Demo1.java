package com.wang.oper;

/**
 * 算术运算。
 * 
 * 加，减，乘，除，求模，自增，自减。
 * 
 */
public class Demo1 {

	/**
	 * 简单加法。
	 * 
	 */
	public void add1() {
		// 整数加
		int a1 = 1;
		int b1 = 2;
		int c1 = 0;
		c1 = a1 + b1;
		System.out.println("c1=" + c1);

		// 小数加
		float a2 = 3.14f;
		float b2 = 3.14f;
		float c2 = a2 + b2;
		System.out.println("c2=" + c2);
	}

	/**
	 * 连续加法
	 */
	public void add2() {
		// 整数
		int a1 = 1;
		int b1 = 2;
		int c1 = 3;
		int d1 = 4;
		int e1 = 0;
		e1 = a1 + b1 + c1 + d1;
		System.out.println("e1=" + e1);

		// 变量，常量混加
		e1 = a1 + 10 + b1 + c1 + 20 + d1 + 30;
		System.out.println("e1=" + e1);

		// 小数
		double a2 = 0.1, b2 = 0.2, c2 = 0.3, d2 = 0.4;
		double e2 = a2 + b2 + c2 + d2;
		System.out.println("e2=" + e2);

		// 变量，常量混加
		e2 = a2 + 0.1;
		System.out.println("e2=" + e2);
	}

	/**
	 * 简单减法
	 */
	public void sub1() {
		//整数减法
		int a = 10;
		int b = 3;
		int c = a - b;
		System.out.println("c=" + c);
	}
	public void  sub12(){	
		//小数减法
		float d = 1.6f;
		float e = 1.5f;
		float f = d - e;
		System.out.println("f=" + f);//为什么输出的是0.100000024？
	}
		//自己完成小数减法？
		
	
	
	/**
	 * 连续减法
	 */
	public void sub2() {
		//自己完成 10-8-6-4-2？
		int x = 10;
		int y = 8;
		int z = 6;
		int p = 4;
		int q = 2;
		int h = x - y - z - p - q ;
		System.out.println( "h=" + h );
		//自己完成5.5-1.2-2.3-3.4-4.5?
		float x1 = 5.5f;
		float y1 = 1.2f;
		float z1 = 2.3f;
		float p1 = 3.4f;
		float q1 = 4.5f;
		float h1 = x1 - y1 - z1 - p1 - q1;	
		System.out.println("h1=" + h1);//为什么输出是h1=-5.8999996？
	}
	
	/**
	 * 乘法
	 */
	public void mul() {
		//自己完成 10-8-6-4-2？
		int x2 = 10;
		int y2 = 8;
		int z2 = 6;
		int p2 = 4;
		int q2 = 2;
		int h2 = x2 * y2 * z2 * p2 * q2;
		System.out.println("h2=" + h2);
		//自己完成5.5-1.2-2.3-3.4-4.5?
		double x3 = 5.5;
		double y3 = 1.2;
		double z3 = 2.3;
		double p3 = 3.4;
		double q3 = 4.5;
		double h3 = x3 * y3 * z3 * p3 * q3;
        System.out.println("h3=" + h3); 		
		
	}
	
	/**
	 * 除法
	 */
	public void div() {
		//整数除法
		int a = 3;
		int b = 2;
		int c = a / b;
		System.out.println("c=" + c);
		
		/*
		 * 3除以2，正常结果为1.5。程序结果c为1，是因为c是一个整数，无法表示小数点以后的位数。  
		 * 注：为什么换为double后结果是1.0而不是1.5？
		 */
		
		//自己完成16/2/4/2?
		int a1 = 16;
		int b1 = 2;
		int c1 = 4;
		int d1 = a1/b1/c1/b1;
		System.out.println("d1=" + d1);
	}
	
	/**
	 * 求模（求余数）
	 */
	public void mode(){
		//10除以3的余数是1
		int a1 = 10;
		int b1 = 3;
		int c1 = a1 % b1;
		System.out.println(a1 + "%" + b1 + "=" + c1);
		
		//7除以4的余数是3
		int a2 = 7;
		int b2 = 4;
		int c2 = a2 % b2;
		System.out.println(a2 + "%" + b2 + "=" + c2);
	}
	
	/**
	 * 自增，自减。
	 * ++放后面，先执行代码，
	 */
	public void test1(){
		
		// 先运算，后自增1
		int a1 = 3;
		a1++;
		System.out.println("a1++:" + a1);
		
		// 先运算，后自减1
		int a2 = 4;
		a2--;
		System.out.println("a2--:" + a2);
		
		// 先自增1，后运算
		int a3 = 5;
		++a3;
		System.out.println("++a3:" + a3);
		
		// 先自减1，后运算
		int a4 = 6;
		--a4;
		System.out.println("--a4:" + a4);
	}
	
	/**
	 * 自增，自减。
	 */
	public void test2(){
		
		//查看结果，试解释为什么？
		
		int a1 = 3;
		System.out.println("a1++:" + a1++);
		//a1++:3 先运算  输出结果3
		
		int a2 = 4;
		System.out.println("a2--:" + a2--);
		//a2--:4先运算 输出结果4
		
		int a3 = 5;
		System.out.println("++a3:" + ++a3);
		//++a3:6 先自增  5+1=6 后输出结果6
		
		int a4 = 6;
		System.out.println("--a4:" + --a4);
		//--a4:5先自减  6-1=5 后输出结果5
		
	}
	  public void test3(){
		  //？；测试 
		  //用法
//		 int a = 80;
//		 int b = 60;
//		 
//		 int max = a > b ? a : b
//		 System.out.println("max:" + max);		 
//		 
//		 //不同类型
//		 
//		 int x = 50 
				 
	  }
}
