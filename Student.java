package com.miao.demo1;

  /*
   * ���ࣺ
   * ����:id
   * ����:ѧϰ
   */
public class Student extends Person{
	
	//����
	public String name1="1";
	private String id;
	//����
//	public Student(String name,int age){
//		super(name, age);
//	}
//	
//	public Student(String name,int age,String id){
//		super(name, age);
//		this.id = id;
//	}
	//����
	public void play() {
		
		System.out.println(getName() +"ѧϰ��");
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
