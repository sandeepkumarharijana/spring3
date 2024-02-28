package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartCallCenter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_demo/NewFile.xml");

		System.out.println(context.getBean(Mobile.class));
		System.out.println(context.getBean(Mobile.class));
		System.out.println(context.getBean(Mobile.class));
		System.out.println(context.getBean(Mobile.class));
		System.out.println(context.getBean(Mobile.class));
	}
}
