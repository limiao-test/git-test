package com.wang.array;

import java.util.Arrays;

/**
 * 二维数组。
 */
public class Demo3 {

	/**
	 * 二维数组定义
	 */
	public void array1() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 打印数组
		System.out.println("arr1:" + Arrays.toString(arr1[0]));
		System.out.println("arr1:" + Arrays.toString(arr1[1]));
		System.out.println("arr1:" + Arrays.toString(arr1[2]));
	}

	/**
	 * 长度
	 */
	public void array2() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 输出长度
		System.out.println("arr1 length:" + arr1.length);
	}

	/**
	 * 访问元素
	 */
	public void array3() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 下标操作
		int a = arr1[0][0];
		int b = arr1[1][1];
		int c = arr1[2][2];

		// 输出元素
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

	/**
	 * 修改元素
	 */
	public void array4() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 下标操作
		arr1[1][1] = 0;

		// 输出元素
		System.out.println("arr1:" + arr1[0]);
		System.out.println("arr1:" + arr1[1]);
		System.out.println("arr1:" + arr1[2]);
	}

	/**
	 * 遍历
	 */
	public void array5() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 遍历
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public void array6(){
		//自己定义其他类型二维数组？
		
		//遍历之？
		
		//修改二维数组元素？
		
	}
}












