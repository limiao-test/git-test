package com.wang.io;

import java.io.File;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
//		demo1.myFile1();
//		demo1.myFile2();
//		demo1.myFile3();
//		demo1.myFile4();
//		demo1.myFile5();
//		demo1.myFile6();
//		demo1.myFile7();
		demo1.myFile8();
		
		Demo2 demo2 = new Demo2();
//		demo2.myFile1();
		demo2.myFile2(new File(Demo2.ROOT), "");
		
//		demo2.myFile3(Demo2.ROOT);
//		demo2.myFile4(Demo2.ROOT,"f");
//		System.out.println("size:" + demo2.list.size());
//		for (File f : demo2.list) {
//			System.out.println(f.getName());
//		}
		
		Demo3 demo3 = new Demo3();
//		demo3.myIO1();
//		demo3.myIO2();
//		demo3.myIO3();
//		demo3.myIO4();
//		demo3.myIO5();
//		demo3.myIO6();
//		String src = "G:/aaa.txt";
//		String dst = "G:/bbb.txt";
//		demo3.myIO7(src, dst);
	}

}

















