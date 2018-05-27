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
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		context.refresh();
		//StudentDao studentDao = new StudentDao();
		Scanner scanner = new Scanner(System.in);
		int add = 0 ;
		System.out.println("上课：1.签到       2.查询      3.统计     0.退出");
		System.out.println("请输入你想要进行的操作：");
		int m = scanner.nextInt();scanner.nextLine();
		
		/*switch (m) {
		case 1:
			System.out.println("请输入你的名字");
			String name = scanner.nextLine();
			if (studentDao.signIn(name)) {
				System.out.println("恭喜你，签到成功！");
				add++;
			} else {
				System.out.println("对不起，签到失败！");
			}
			break;
		case 2:
			System.out.println("请输入你的学号");
			int id = scanner.nextInt();scanner.nextLine();
			Student student = studentDao.queryId(id);
			System.out.println(student.toString());
			break;
		case 3:
			System.out.println("已经签到人数是："+add);
			break;
		}*/
		/*if (m==1) {
			System.out.println("请输入你的名字");
			String name = scanner.nextLine();
			if (studentDao.signIn(name)) {
				System.out.println("恭喜你，签到成功！");
				add++;
			} else {
				System.out.println("对不起，签到失败！");
			}
		} else if (m==2) {
			System.out.println("请输入你的学号");
			int id = scanner.nextInt();scanner.nextLine();
			Student student = studentDao.queryId(id);
			System.out.println(student.toString());
		}else if (m==3) {
			System.out.println("已经签到人数是："+add);
		} */

		switch (m) {
		case 1:
			System.out.println("请输入你的名字");
			String name = scanner.nextLine();
			if (context.containsBean(name)) {
				System.out.println("恭喜你，签到成功！");
				add++;
			} else {
				System.out.println("对不起，签到失败！");
			}
			break;
		case 2:
			System.out.println("请输入你的学号");
			int id = scanner.nextInt();scanner.nextLine();
			if (context.containsBean(String.valueOf(id))) {
				Student student =new StudentConfig().student();
				System.out.println(student.toString());
			}
			System.out.println("对不起，没有此人");
			break;
		case 3:
			System.out.println("已经签到人数是："+add);
			break;
		}
	}
}
