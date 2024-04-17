package string_handling;

public class Test4 {

	public static void main(String[] args) {
		// literal vs no literal strings
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = new String("Hello");
		String s4 = "hello";
		String s5 = "hello";
		String s6 = "HELLO";
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s4));//t
		System.out.println(s4==s5);//t
		System.out.println(s4.equals(s5));//t
		System.out.println(s4==s6);//f
		System.out.println(s4.equals(s6));//f
		System.out.println(s4.equalsIgnoreCase(s6));//t
		/*
		 * When is SCP marked for GC ?
		 * Upon  un loading of String class(typically when JVM terminates)
		 */
		
//		System.out.println(s1 == s2);// f
//		System.out.println(s1 == s3);// f
//		System.out.println(s1.equals(s2));// t
//		System.out.println(s1.equals(s3));// f
//		System.out.println(s1.equalsIgnoreCase(s3));// t
	}

}
