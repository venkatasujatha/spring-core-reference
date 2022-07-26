package com.example.demo.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		A bean = (A) context.getBean("aref");
		System.out.println(bean);
		System.out.println(bean.getX());
		System.out.println(bean.getObject().getY());

	}

}
