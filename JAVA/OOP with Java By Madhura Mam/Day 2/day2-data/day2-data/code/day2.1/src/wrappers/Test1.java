package wrappers;

public class Test1 {

	public static void main(String[] args) {
		Integer i1 = 100;// javac auto invokes : Integer.valueOf(100)
		Integer i2 = 200;
		System.out.println(i1.compareTo(i2));// < 0
		if (i1 < i2) //auto un boxing --i1.intValue() < i2.intValue()
			System.out.println("lesser");
		else
			System.out.println("greater or equal");
//		String s1="hello";
//		String s2="hi";
//		if(s1 < s2)
//			System.out.println("lesser");

	}

}
