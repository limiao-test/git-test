package com.wang.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * File类实践。
 *
 */
public class Demo2 {

	/*
	 * 文件结构：
	 * 
	 * 1级：文件夹：d。
	 * 
	 * 2级：文件夹：d1,d2。
	 * 
	 * 3级：文件夹：d11,d12,d21,d22。
	 * 
	 * 4级：文件：f1,f2,f3,f4,f5,f6,f7,f8。
	 */

	public static final String ROOT = "E:/d";
	public static final String D1 = ROOT + File.separator + "d1";
	public static final String D2 = ROOT + File.separator + "d2";
	
	public static final String D11 = D1 + File.separator + "d11";
	public static final String D12 = D1 + File.separator + "d12";
	public static final String D21 = D2 + File.separator + "d21";
	public static final String D22 = D2 + File.separator + "d22";

	public static final String PATH1 = D11 + File.separator + "f1.txt";
	public static final String PATH2 = D11 + File.separator + "f2.txt";
	public static final String PATH3 = D12 + File.separator + "f3.txt";
	public static final String PATH4 = D12 + File.separator + "f4.txt";
	public static final String PATH5 = D21 + File.separator + "f5.txt";
	public static final String PATH6 = D21 + File.separator + "f6.txt";
	public static final String PATH7 = D22 + File.separator + "f7.txt";
	public static final String PATH8 = D22 + File.separator + "f8.txt";

	private String[] dirs = { D11, D12, D21, D22 };
	private String[] paths = { PATH1, PATH2, PATH3, PATH4, PATH5, PATH6, PATH7,
			PATH8 };

	/**
	 * 整体创建。
	 */
	public void myFile1() {
		// 先创建文件夹
		
		for (String d : dirs) {
			File file = new File(d);
			boolean b = file.mkdirs();
			System.out.println("dir:" + b);
		}

		// 再创建文件
		for (String p : paths) {
			// File
			File file = new File(p);

			// 方法
			try {
				boolean b = file.createNewFile();
				System.out.println("file:" + b);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("create file exception!");
			}
		}
	}

	/**
	 * 整体遍历。
	 */
	public void myFile2(File f, String div) {
		// 参数检查
		if (!f.exists()) {
			System.out.println("文件不存在");
			return;
		}

		// 打印名字
		System.out.println(div + f.getName());
		div += "--";

		// 如果是文件夹，更近一层
		if (f.isDirectory()) {
			File[] children = f.listFiles();
			for (File child : children) {
				// 递归
				myFile2(child, div);
			}
		}
	}

	/**
	 * 整体删除。
	 */
	public void myFile3(String path) {
		// File
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("文件不存在");
			return;
		}

		// 如果是文件夹，更进一层
		if (file.isDirectory()) {
			File[] children = file.listFiles();
			for (File child : children) {
				String p = child.getPath();
				// 递归
				myFile3(p);
			}
		}

		// 如果是文件，直接删除
		boolean b = file.delete();
		System.out.println("del:" + file.getName() + ":" + b);
	}

	/**
	 * 条件过滤。
	 */

	public ArrayList<File> list = new ArrayList<File>();

	public void myFile4(String path, String key) {

		File file = new File(path);
		System.out.println("name:" + file.getName());

		// 如果是文件夹
		if (file.isDirectory()) {

			MyFileFilter filter = new MyFileFilter(key);
			File[] children = file.listFiles(filter);
			System.out.println("children length:" + children.length);
			for (File child : children) {
				// 递归
				myFile4(child.getPath(), key);
			}
			return;
		}

		// 如果是文件
		list.add(file);
	}

	class MyFileFilter implements FileFilter {

		private String key = "";

		public MyFileFilter(String key) {
			this.key = key;
		}

		@Override
		public boolean accept(File file) {

			if (file.isDirectory()) {
				return true;
			}
			String name = file.getName();
			boolean b = name.startsWith(key);
			System.out.println("filter:" + name + ",b:" + b);
			return b;
		}

	}
}
