package com.example.demo;

public class Student {
	
	private String name,sex;
	private int age, id;
	public Student() {}
	public Student(String name, String sex, int age, int id) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", id=" + id + "]";
	}
	
	
}
