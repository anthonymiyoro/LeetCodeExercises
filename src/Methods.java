
public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		whatever is below will call  the sayHelloWorld method
		sayHelloWorld();
		
//		assignes Charlie to the String name
		sayHelloTo("Charlie");
	
	}
	
	static void sayHelloTo (String name) {
		System.out.println("Hello , " + name);
	}
//	created a method that will print Hello World
    static void sayHelloWorld(){
    	System.out.println("Hello world!!");
    }
}
