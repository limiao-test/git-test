package com.wang.oper;

/**
 * 逻辑运算。
 * 与，或，非。
 */
public class Demo3 {
	
	/*
	 * 逻辑运算符：
	 * （1）与：&&
	 * （2）或：||
	 * （3）非：！
	 * 
	 */
	
	/**
	 * 与运算规则。
	 */
	public void testAnd1(){
		//测试
		boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && false;
		System.out.println("true and true:" + b1);
		System.out.println("true and false:" + b2);
		System.out.println("false and false:" + b3);
	}
	
	/**
	 * 与运算案例。
	 */
	public void testAnd2(){
		
		/*
		 * 学生成绩x：
		 * （1）0-100表示数字合格无误。
		 * （2）85-100表示优秀。
		 */
		
		//定义变量
		int x = 65;
		
		//逻辑运算
		boolean b1 = x > 0 && x < 100;
		
		boolean b2 = x > 85 && x < 100;
		
		//输出结果
		System.out.println("分数是否正确：" + b1);
		System.out.println("分数是否优秀：" + b2);
	}
	
	/**
	 * 或运算规则。
	 */
	public void testOr1(){
		//测试
		boolean b1 = true || true;
		boolean b2 = true || false;
		boolean b3 = false || false;
		
		//自己输出计算结果
		System.out.println("true or true:" + b1);
		System.out.println("true or false:" + b2);
		System.out.println("false or false:" + b3);
	}
	
	
	/**
	 * 或运算案例。
	 */
	public void testOr2(){
		/*
		 * 学生有两科成绩：语文，数学。优秀条件如下。
		 * （1）单科高于90分。
		 * （2）或平均分高于80;
		 */
		
		int x = 91;
		int y = 60;
		int avg = (x + y) / 2;
		
		boolean b1 = x > 90 || y > 90;
		boolean b2 = avg > 80;
		
		System.out.println(">90:" + b1);
		System.out.println("avg>60:" + b2);
	}
	
	/**
	 * 非运算（取反）。
	 */
	public void testNot1(){
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1:" + b1);
		System.out.println("b2:" + b2);
		
		//取反
		System.out.println("!b2:" + !b1);
		System.out.println("!b2:" + !b2);
	}
	
	/**
	 * 非运算案例。
	 */
	public void testNot2(){
		/*
		 * 学生成绩：60分以下都算不及格。
		 * 
		 */
		
		int x = 59;
		boolean b1 = !(x >= 60);
		System.out.println(x + ":是否及格？" + b1);
	}
}
