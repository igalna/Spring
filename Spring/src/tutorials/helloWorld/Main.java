package tutorials.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objectA = (HelloWorld) context.getBean("helloWorld");
		objectA.setMessage("I am Object A");
		objectA.getMessage();
		
		HelloWorld objectB = (HelloWorld) context.getBean("helloWorld");
		objectB.getMessage();
	}
}
