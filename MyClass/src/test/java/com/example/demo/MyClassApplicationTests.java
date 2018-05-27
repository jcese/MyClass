package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyClassApplicationTests {

	@Test
	public void contextLoads() {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		String name = "张三";
		if (context.containsBean(name)) {
			System.out.println("恭喜你，签到成功！");
		} else {
			System.out.println("对不起，签到失败！");
		}
	}

}
