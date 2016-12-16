package com.wang.demo;


public class Demo3
{
	
	public static void main(String[] args)
	{
		System.out.println("this is my Demo3");
		
		Calculator1 cal = new Calculator1();
		System.out.println("num1:" + cal.num1);
		System.out.println("num2:" + cal.num2);
		
		cal.sum1();
		
		cal.sum2(30, 40);
	}	
}




