package string_handling;

public class Test1 {

	public static void main(String[] args) {
		// immutability of strings
		String s1=new String ("hello");
		s1.concat("hi");
		System.out.println(s1);//hello
		s1 += "abcd";//s1 =s1.concat("abcd");
		System.out.println(s1);//helloabcd
		String s3=s1.toUpperCase();
		System.out.println(s1);//lower : helloabcd
		System.out.println(s3);//upper cased
		String s4=s3.replace('L', 'P');
		System.out.println(s4);//replaced
		System.out.println(s3);//orig

	}

}
