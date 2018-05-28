package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class DoBean {
	@Autowired
	private StudentDao studentDao;
	@Bean
	public String onClass() {
		Scanner scanner = new Scanner(System.in);
		int sc,add;
		add=0;
		while (true) {

			System.out.println("1.签到");

			System.out.println("2.查询");

			System.out.println("3.统计");
			System.out.println("0.退出");

			System.out.println("请输入你要选择服务的数字");

			sc = scanner.nextInt();

			while (sc == 1) {

				System.out.println("请输入签到姓名：");

				String name = scanner.next();

				if (studentDao.signIn(name)) {
					System.out.println("恭喜你，签到成功！");
					add++;
				} else {
					System.out.println("对不起，签到失败！");
				}

				System.out.println("输入n退出签到");

				String what = scanner.next();

				if (what.equals("n")) {

					break;

				}

			}

			while (sc == 2) {

				System.out.println("请输入要查询的学生姓名：");

				int id = scanner.nextInt();scanner.nextLine();
				Student student = new Student();
				student= studentDao.queryId(id);

				System.out.println("输入n退出查询");

				String what = scanner.next();

				if (what.equals("n")) {

					break;

				}

			}

			if (sc == 3) {

				int i=add;

				System.out.println("已签到人数："+i);

			}
			
		}
	}
}
