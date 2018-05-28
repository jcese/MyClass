package com.example.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//写Spring Framework Reference 和Spring Boot Reference的读书笔记，以md文件格式存放到GitHub上
//新建Spring Boot项目(模拟一个上课的场景，写服务(签到、查询，统计等)，不用存库，不用web界面，使用命令行界面就可以，要有单元测试，要github提交)。

@SpringBootApplication
public class MyClassApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyClassApplication.class, args);
	}
}
