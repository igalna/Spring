package tutorials.helloWorld;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		context.start();
		
		HelloWorld object = (HelloWorld) context.getBean("helloWorld");
	
		object.getMessage1();
		
		context.stop();
	}
}
