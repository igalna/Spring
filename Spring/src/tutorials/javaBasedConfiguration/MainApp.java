package tutorials.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tutorials.helloWorld.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = context.getBean(HelloWorld.class);
	
		helloWorld.setMessage1("Hello World!");
		helloWorld.getMessage1();
	}

}
