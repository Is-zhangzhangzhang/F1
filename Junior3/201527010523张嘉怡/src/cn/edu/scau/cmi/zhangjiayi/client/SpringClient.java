package cn.edu.scau.cmi.zhangjiayi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.cmi.zhangjiayi.spring.domain.Student;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ApplicationContext test = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) test.getBean("zhangjiayi");
		System.out.println("你的教师是："+student.getTutor().getName());
	}
}
