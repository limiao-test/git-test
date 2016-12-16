package com.wang.array;

import java.util.Arrays;

/**
 * 数组格式。
 */
public class Demo1 {

	/**
	 * 引入问题
	 */
	public void array1() {
		// 定义一个整数
		int a = 10;
		System.out.println("a=" + a);

		// 定义多个整数
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);

		// 定义一个整型数组
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("arr:" + Arrays.toString(arr));
	}

	/**
	 * 数组定义
	 */
	public void array2() {

		// 定义整型数组
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr1));

		// 定义float型数组
		double[] arr2 = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println(Arrays.toString(arr2));

		// 定义字符串数组
		String[] arr3 = { "aaa", "bbb", "ccc" };
		System.out.println(Arrays.toString(arr3));

		/*
		 * 数组的定义用[]。数组的赋值用{}。
		 */

		/*
		 * 数组的转化为字符串用Arrays类的toString()方法。
		 */
	}

	/**
	 * 数组长度
	 */
	public void array3() {
		// double型数组
		double[] arr1 = { 1.1, 2.2, 3.3, 4.4, 5.5, };
		int len1 = arr1.length;
		System.out.println("arr1 length:" + len1);

		// 字符串型数组
		String[] arr2 = { "aaa", "bbb", "ccc" };
		System.out.println("arr2 length:" + arr2.length);
	}

	/**
	 * 访问数组元素。
	 */
	public void array4(int i) {
		// 定义整型数组
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// 提取数组元素
		int a = arr1[0];
		int b = arr1[2];
		// 输出
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		/*
		 * 访问数组元素通过name[i]方式。 name：数组名。 i:下标，从0开始计数。
		 */

		// 定义字符串数组
		String[] arr2 = { "aaa", "bbb", "ccc", "ddd" };
		// 访问数组元素
		String s1 = arr2[0];
		String s2 = arr2[1];
		String s3 = arr2[2];
		String s4 = arr2[3];
		// 输出
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
		System.out.println("s4:" + s4);

		// 下标问题
		// String s = arr2[4];
		// System.out.println("s:" + s);

		// 自己定义float型数组

		// 自己定义boolean型数组

		// 自己定义char型数组
	}
	
	/**
	 * 数组遍历。
	 */
	public void array5() {
		// 定义数组
		String[] arr1 = { "we", "are", "the", "world" };
		
		//遍历每个元素
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
		
		//自己定义并遍历其他类型数组
	}
	
	/**
	 * 修改数组元素。
	 */
	public void array6(){
		//定义数组
		int[] arr1 = {65, 75, 72, 80, -70};
		System.out.println("arr1:" + Arrays.toString(arr1));
		
		//修改
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				arr1[i] = 0;
			}
		}
		
		//输出
		System.out.println("arr1:" + Arrays.toString(arr1));
	}
}




