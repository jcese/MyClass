package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	public Student student() {
		Student student = new Student();
		student.setName("张三");
		student.setAge(18);
		student.setId(001);
		return student;
	}
	//签到。从student()中获取name，对比，如果存在的话，返回true；
	@Bean
	public boolean signIn(String name) {
		boolean isok = false ;
		if (name.equals(student().getName())) {
			isok = true;
		} 
		return isok;
	}
	//查询,从student()中获取id，对比，如果存在的话，返回student；
	@Bean
	public Student lookId(int id) {
		Student student=null;
		if (id==student().getId()) {
			student =student();
		} 
		return student();
	}
}
