package com.example.demo;

public class StudentDao {
	Student stu = new Student("张三", "男", 18, 001);
	
	//签到
	public boolean signIn(String name) {
		boolean isok = false ;
		if (name.equals("张三")) {
			isok = true;
		} 
		return isok;
	}
	//查询
	public Student queryId(int id) {
		Student student =null;
		if (id==001) {
			student = stu;
		}
		return student;
	}
	
}
