package com.miao.demo1;

  /*
   * 子类：
   * 属性:id
   * 方法:学习
   */
public class Student extends Person{
	
	//属性
	public String name1="1";
	private String id;
	//构造
//	public Student(String name,int age){
//		super(name, age);
//	}
//	
//	public Student(String name,int age,String id){
//		super(name, age);
//		this.id = id;
//	}
	//方法
	public void play() {
		
		System.out.println(getName() +"学习中");
	}
	
	//getter setter
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
		
	}

	public String getName() {
		return name1;
	}

	public void setName(String name1) {
		this.name1 = name1;
	}
}
