package com.wang.oper;

/**
 * 位运算。 移位，按位逻辑运算。
 */
public class Demo4 {

	/**
	 * 移位运算。 （1）左移 （2）右移
	 */
	public void test1(int i) {

		int a = 1; // 1=0000 0001
		int b = 2; // 2=0000 0010
		int c = 0; // 0=0000 0000

		// 左移1位
		c = a << 1;
		System.out.println(a + "<<1:" + c);
		/* 0000 0001 左移1位：0000 0010, 0000 0010=2 */

		// 右移1位
		c = b >> 1;
		System.out.println(b + ">>1:" + c);
		/* 0000 0010 右移1位：0000 0001, 0000 0001=1 */

		// 按位与
		c = a & b;
		System.out.println("a & b:" + c);

		// 按位或
		c = a | b;
		System.out.println("a | b:" + c);

		// 按位取反
		c = ~a;
		System.out.println("~a:" + c);
	}
}


