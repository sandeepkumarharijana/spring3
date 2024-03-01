package spring_demo_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
public class ShowRoom {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
	context.getBean("car");
	context.getBean("car");
	context.getBean("car");
	context.getBean("car");
	
}
}
