package tutorials.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objectA = (HelloWorld) context.getBean("helloWorld");
		objectA.getMessage1();
		objectA.getMessage2();
		
		HelloIndia objectB = (HelloIndia) context.getBean("helloIndia");
		objectB.getMessage1();
		objectB.getMessage2();
		objectB.getMessage3();
		
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
