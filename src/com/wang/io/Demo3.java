package com.wang.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流。
 *
 */
public class Demo3 {

	private void myIO() {

//		 OutputStream os = null;
//		 os.write(b);
//		 os.write([]b);
//		 os.write(b, off, len);
//		 os.flush();
//		 os.close();

		// InputStream is = null;
		// is.read();
		// is.read(b);
		// is.read(b, off, len);
		// is.available();
		// is.close();
	}

	/**
	 * 一次输出。
	 */
	public void myIO1() {
		// String str1 = "hello";
		String str1 = "你好";

		// 路径
		String path = "G:/aaa.txt";

		// File
		File file = new File(path);

		// 输出
		try {
			FileOutputStream fos = new FileOutputStream(file);

			// 写数据
			fos.write(str1.getBytes());

			fos.close();
			System.out.println("输出完成");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 一次输入。
	 */
	public void myIO2() {
		// 输入的内容
		String str = "";

		// 路径
		String path = "G:/aaa.txt";

		// File
		File file = new File(path);

		// 输入
		try {
			// 创建流
			FileInputStream fis = new FileInputStream(file);
			// 读数据
			System.out.println("available:" + fis.available());
			byte[] b = new byte[fis.available()];
			fis.read(b);

			// 收编数据
			str = new String(b);

			// 关闭
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 显示输入的内容
		System.out.println("str:" + str);
	}

	/**
	 * 多次输出。
	 */
	public void myIO3() {
		// 数据
		String[] data = { "白日依山尽", "黄河入海流", "欲穷千里目", "更上一层楼" };

		// 路径
		String path = "G:/aaa.txt";

		// File
		File file = new File(path);

		// IO流
		try {
			// 创建流
			FileOutputStream fos = new FileOutputStream(file);

			// 写出
			for (String s : data) {
				fos.write(s.getBytes());
				System.out.println("写出：" + s);
			}

			// 关闭流
			fos.close();
			System.out.println("写出完成");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 多次输入。
	 */
	public void myIO4() {
		// 数据
		StringBuilder sb = new StringBuilder();
		// 读入
		String path = "G:/aaa.txt";

		File file = new File(path);

		try {
			FileInputStream fis = new FileInputStream(file);

			byte[] buf = new byte[3];

			while (fis.read(buf) != -1) {
				String s = new String(buf);
				System.out.println("read:" + s);
				sb.append(s);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 显示数据
		System.out.println("result:" + sb.toString());
	}

	/**
	 * 写研究。
	 */
	public void myIO5() {

		// 路径
		String path = "G:/bbb.txt";

		// File
		File file = new File(path);

		// IO
		try {
			FileOutputStream fos = new FileOutputStream(file);

			/* 把1个字节写到流中，int是4个字节，只取低位1个字节。 */
			// fos.write(0);
			// fos.write(256);

			/*
			 * 把b中的多个字节写到流中。
			 */
			// byte[] b = {97, 98, 99};
			// byte[] b = "hello".getBytes();
			// byte[] b = "你好".getBytes();
			// fos.write(b);

			/*
			 * 把b中多个字节写到流中。可控制起始位置和个数。
			 */
			// byte[] b = {97, 98, 99, 100};
			// fos.write(b, 0, 2);
			// fos.write(b, 0, b.length);

			fos.close();
			System.out.println("操作完成");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读写研究。
	 */
	public void myIO6() {
		String path = "G:/bbb.txt";

		File file = new File(path);

		try {
			FileInputStream fis = new FileInputStream(file);

			/* 从流中读取1个字节 */
			// fis.read();

			/* 从流中读取多个字节,放在b中，把b装满为止 */
			// fis.read(b);

			/* 从流中读取多个字节，放在b中，可控制起始位置和个数 */
//			fis.read(b, off, len);

			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 复制。
	 */
	public void myIO7(String src, String dst) {
		//参数检查
		if (src == null || dst == null) {
			System.out.println("路径为空");
			return;
		}
		
		//复制过程
		//File
		File fileSrc = new File(src);
		File fileDst = new File(dst);
		
		//IO流
		try {
			//创建
			FileInputStream fis = new FileInputStream(fileSrc);
			FileOutputStream fos = new FileOutputStream(fileDst);
			
			//读写
			byte[] b = new byte[4];
			int len = 0;
			int i = 0;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
				i++;
				System.out.println(i + "次：" + len + "," + new String(b));
			}
			
			//关闭
			fis.close();
			fos.close();
			System.out.println("复制完成");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




