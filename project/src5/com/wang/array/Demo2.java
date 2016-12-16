package com.wang.array;

/**
 * 数组实践
 * 
 */
public class Demo2 {

	/**
	 * 求数组的和
	 */
	public void array1() {
		// 定义数组
		int[] arr1 = { 1, 2, 3, 5, 7, 11, 20, 50, 55, 22 };
		System.out.println("arr1 length:" + arr1.length);

		// 计算
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}

		// 输出结果
		System.out.println("sum:" + sum);
	}

	/**
	 * 一个班10个学生。计算数学成绩。 （1）计算全班学生平均成绩 （2）最高分 （3）最低分
	 */
	public void array2() {
		// 定义数组
		int[] arr1 = { 60, 66, 75, 82, 65, 70, 76, 30, 98, 90 };

		// 计算和
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("sum:" + sum);
		
		// 计算平均成绩
		float avg = 0.0f;
		avg = sum / arr1.length;
		System.out.println("avg:" + avg);
		
		// 计算最高分
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("max:" + max);

		// 计算最低分
		int min = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("min:" + min);
	}
}


