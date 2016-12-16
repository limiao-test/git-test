package com.wang.array;

/**
 * 二维数组实践。
 *
 */
public class Demo4 {

	/**
	 * 打印整型二维数组。
	 */
	private void printArray(int[][] arr) {
		// 遍历输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 反转数组
	 */
	public void array1() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		printArray(arr1);

		// 反转
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr2[i][j] = arr1[j][i];
			}
		}

		// 输出
		printArray(arr2);

		// 自己增加数组元素数量二次研究？

	}

	/**
	 * 对角线之和
	 */
	public void array2() {
		// 定义数组
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printArray(arr1);

		// 求和
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (i == j) {
					sum += arr1[i][j];
				}
			}
		}

		// 输出
		System.out.println("sum:" + sum);

		// 自己增加数组元素数量二次研究？
	}

	/**
	 * 一个专业3个班，每班10人。 （1）计算专业平均成绩？ （2）计算每班平均成绩？ （3）计算专业最高分？ （4）计算专业最低分？
	 */
	public void array3() {
		// 定义数组
		int[][] arr1 = { { 61, 70, 71, 74, 50, 90, 80, 82, 79, 62 },
				{ 62, 77, 71, 84, 50, 90, 86, 92, 99, 42 },
				{ 63, 76, 70, 74, 55, 95, 80, 82, 69, 22 } };

		// 计算专业总分
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j];
			}
		}
		System.out.println("sum:" + sum);

		// 计算专业平均分
		int avg = sum / 30;
		System.out.println("avg:" + avg);

		// 计算专业最高分，最低分
		int max = arr1[0][0];
		int min = arr1[0][0];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (max < arr1[i][j]) {
					max = arr1[i][j];
				}

				if (min > arr1[i][j]) {
					min = arr1[i][j];
				}
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);

		// 计算班级总分
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 0; i < arr1[0].length; i++) {
			sum1 += arr1[0][i];
		}

		for (int i = 0; i < arr1[1].length; i++) {
			sum2 += arr1[1][i];
		}

		for (int i = 0; i < arr1[2].length; i++) {
			sum3 += arr1[2][i];
		}
		System.out.println("sum1:" + sum1);
		System.out.println("sum2:" + sum2);
		System.out.println("sum3:" + sum3);

		// 计算班级平均分
		int avg1 = 0, avg2 = 0, avg3 = 0;
		avg1 = sum1 / 10;
		avg2 = sum2 / 10;
		avg3 = sum3 / 10;
		System.out.println("avg1:" + avg1);
		System.out.println("avg2:" + avg2);
		System.out.println("avg3:" + avg3);

		// 计算班级最高分，最低分
		int max1 = arr1[0][0], min1 = arr1[0][0];
		int max2 = arr1[1][0], min2 = arr1[1][0];
		int max3 = arr1[2][0], min3 = arr1[2][0];

		for (int i = 0; i < arr1[0].length; i++) {
			if (max1 < arr1[0][i]) {
				max1 = arr1[0][i];
			}
			if (min1 > arr1[0][i]) {
				min1 = arr1[0][i];
			}
		}

		for (int i = 0; i < arr1[1].length; i++) {
			if (max2 < arr1[1][i]) {
				max2 = arr1[1][i];
			}
			if (min2 > arr1[1][i]) {
				min2 = arr1[1][i];
			}
		}

		for (int i = 0; i < arr1[2].length; i++) {
			if (max3 < arr1[2][i]) {
				max3 = arr1[2][i];
			}
			if (min3 > arr1[2][i]) {
				min3 = arr1[2][i];
			}
		}
		System.out.println("max1:" + max1 + ",min1:" + min1);
		System.out.println("max2:" + max2 + ",min2:" + min2);
		System.out.println("max3:" + max3 + ",min3:" + min3);
	}

	/**
	 * 优化
	 */
	public void array4() {
		// 定义数组
		int[][] arr1 = { { 61, 70, 71, 74, 50, 90, 80, 82, 79, 62 },
				{ 62, 77, 71, 84, 50, 90, 86, 92, 99, 42 },
				{ 63, 76, 70, 74, 55, 95, 80, 82, 69, 22 } };
		// 我们需要的结果
		// 总分
		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		// 平均分
		int avg = 0, avg1 = 0, avg2 = 0, avg3 = 0;
		// 最高分
		int max = 0, max1 = 0, max2 = 0, max3 = 0;
		// 最低分
		int min = arr1[0][0], min1 = arr1[0][0], min2 = arr1[1][0], min3 = arr1[2][0];

		// 计算过程
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				// 总分
				sum += arr1[i][j];
				//最高分
				if (max < arr1[i][j]) {
					max = arr1[i][j];
				}
				//最低分
				if (min > arr1[i][j]) {
					min = arr1[i][j];
				}

				// 班级总分
				switch (i) {
				case 0:	//1班
					sum1 += arr1[i][j];
					if (max1 < arr1[i][j]) {
						max1 = arr1[i][j];
					}
					//最低分
					if (min1 > arr1[i][j]) {
						min1 = arr1[i][j];
					}
					
					break;
				case 1:	//2班
					sum2 += arr1[i][j];
					if (max2 < arr1[i][j]) {
						max2 = arr1[i][j];
					}
					//最低分
					if (min2 > arr1[i][j]) {
						min2 = arr1[i][j];
					}
					break;
				case 2:	//3班
					sum3 += arr1[i][j];
					if (max3 < arr1[i][j]) {
						max3 = arr1[i][j];
					}
					//最低分
					if (min3 > arr1[i][j]) {
						min3 = arr1[i][j];
					}
					break;
				}
			}
		}
		
		//平均分
		avg = sum / 30;
		avg1 = sum1 / 10;
		avg2 = sum2 / 10;
		avg3 = sum3 / 10;

		// 输出结果
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		
		System.out.println("sum1:" + sum1);
		System.out.println("avg1:" + avg1);
		System.out.println("max1:" + max1);
		System.out.println("min1:" + min1);
		
		System.out.println("sum2:" + sum2);
		System.out.println("avg2:" + avg2);
		System.out.println("max2:" + max2);
		System.out.println("min2:" + min2);
		
		System.out.println("sum3:" + sum3);
		System.out.println("avg3:" + avg3);
		System.out.println("max3:" + max3);
		System.out.println("min3:" + min3);
	}
}
















