package july11thqaautomation;

public class StringsSession {
	
	public static void main(String[] args) {
		
//		Primitive  --> int, float, char, long, short, double
//		non - primitive data types --> String, 
//		String is immutable in java
//		String is nothing but array of characters
		
//		Literal way
		String s = "Hello world welCOME to java";
//		String batch = "July 22";
		
//		Object way
//		String session = new String("Java advanced");
		
//		String s1 = "Java";
//		String s2 = "Java";
//		String s3 = new String("Java");
//		String s4 = new String("JavA");
		
//		System.out.println(s1==s2); // true
//		System.out.println(s1==s3); // false
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
//		
//		String fullName = name.concat("Goyal");
		
//		System.out.println(fullName);
		
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("java"));
		System.out.println(s.equals("hello world welCOME to java"));
		System.out.println(s.endsWith("thon"));
		System.out.println(s.replace("java", "python"));
		
		String[] sArray = s.split("w");
		
		char[] c = s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--) {
			System.out.print(c[i]+"");
		}
		
		System.out.println();
		char[] name = {'M', 'I', 'T', 'H', 'U', 'N'};
		
		System.out.println(name);
		
		
	}

}
