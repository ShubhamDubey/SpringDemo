package com.niit.a.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try {
			ApplicationContext appCon = new ClassPathXmlApplicationContext("StudentConfig.xml");
			StudentBean factory = (StudentBean) appCon.getBean("studentbean");
			factory.displayInfo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
