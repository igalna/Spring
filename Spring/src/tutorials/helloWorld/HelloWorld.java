package tutorials.helloWorld;

public class HelloWorld {

	private String message;
	
	public void getMessage() {
		System.out.println("You're message : " + message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is initializing");
	}
	
	public void destroy() {
		System.out.println("Bean is being destroyed");
	}
	
}
