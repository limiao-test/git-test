package com.wang.demo;


public class Demo2
{
	
	int a = 10;
	int b = 20;
	
	public void sum(int x, int y)
	{
		int z = x + y;
		System.out.println(z);
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("this is my Demo2");
		
		Demo2 demo = new Demo2();
		System.out.println(demo);
		
		System.out.println(demo.a);
		System.out.println(demo.b);
		
		
		demo.sum(10, 20);
		
	}	
}




