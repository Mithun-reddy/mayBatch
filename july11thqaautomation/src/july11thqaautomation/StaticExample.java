package july11thqaautomation;

public class StaticExample {

//	Static keyword can be used to variables, methods, block
//	You can not make a non static reference inside a static block
//	You can access non-static variable inside a static method by creating the object of the class
//	You can call static variables inside a non-static method
//	Static block will get executed even before the main method gets called
//	Static variable is a class variable

	static int a = 10;
	static int b = 15;
	int c = 0;
	static int result = 0;
	
//	static block
	static {
		System.out.println("Hello world");
		System.out.println("This is a static block");
	}
	
	static void add() {
		
		result = a + b;
		System.out.println("The result is: "+result);
	}
	

	public static void main(String[] args) {

		System.out.println(a);
		
//		CTRL+SHIFT+L  --> Master for shortcuts
		
//		Ctrl + space
		System.out.println();
		System.out.println();
		
		StaticExample sd = new StaticExample();

//		System.out.println("The value of c: " + sd.c);

//		System.out.println("The result is : " + sd.result);
		
		add();
		
	}

}
