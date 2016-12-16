package com.wang.datatype;


/**
 * 数字型变量。
 * 整数（byte，short，int，long）
 * 小数（float，double）
 * 
 */
public class Data2 {
	
	/**
	 * 字节型整数变量（byte）。
	 * 
	 * 变量长度：1个字节。
	 * 
	 */
	public void testByte(){
		
		//定义变量
		byte a = 1;
		byte b = -1;
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究变量数值范围
//		byte c1 = 256;
		byte c1 = -128;
//		byte c2 = 128;
		byte c2 = 127;
		
		System.out.println(c1);
		System.out.println(c2);
		
		/*
		 * byte变量占1个字节，1个字节是8个二进制位，1个二进制位能存两个中状态0和1。
		 * 8个二进制位能存2的8次方个状态，2的8次方是256。
		 * 所以1个字节能存的数字范围是：0-255。
		 * 正数和负数各分一半，应该是-128-128。
		 * 但是0还会占一个数字位，所以byte变量的数值范围：-128-127。
		 * 
		 */
	}
	
	/**
	 * 短整型（short）。
	 * 
	 * 2个字节。
	 */
	public void testShort(){
		//定义变量
		short a = 32767;
		short b = -32768;
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究short型变量取值范围？
		/*shout变量占两个字节  2字节是16个二进制位
		 * 16个二进制位存在2的16次方个状态 即65536。
		 * 同理，short型变量的取值范围是-32768~32767。
		*/
	}
	
	/**
	 * 整型（int）
	 * 
	 * 4个字节。
	 * 
	 */
	public void testInt(){
		//定义变量
		int a = 2147483647;
		int b = -2147483648;
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究int型变量取值范围？
		/*范围：-2147483648~2147483647*/
	}
	
	/**
	 * 长整型（long）
	 * 
	 * 8个字节。
	 * 
	 */
	public void testLong(){
		//定义变量
		long a = 1000;
		long b = -1000;
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究long型变量取值范围？
		/*
		 * 存在2的64次方个状态
		 * 取值范围各取一半 0占一个数字位*/
		
	}
	
	/**
	 * 浮点型小数（float）。
	 * 浮点型小数，也叫单精度小数。
	 * 
	 * 4个字节。
	 * 
	 */
	public void testFloat(){
		//定义变量
		float a = 3.14f;
		float b = -3.14F;
		
		//书写float型数字时，必须给数字后面添加f或者F，表示这个数字是float型数字。
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究float型变量取值范围？
		/*2的32次方个状态 
		 */
		
	}
	
	/**
	 * 双精度小数（double）。
	 * 
	 * 8个字节。
	 * 
	 */
	public void testDouble(){
		//定义变量
		double a = 10.5;
		double b = -10.5;
		
		//访问变量
		System.out.println(a);
		System.out.println(b);
		
		//研究double型变量取值范围？
		/*2的64次方个状态
		 */
	}

}
