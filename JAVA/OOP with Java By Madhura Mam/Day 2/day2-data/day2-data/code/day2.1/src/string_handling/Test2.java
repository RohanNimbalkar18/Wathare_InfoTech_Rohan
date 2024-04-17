package string_handling;

import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		// mutability of StringBuilder
		StringBuilder sb1 = new StringBuilder("12345");
		System.out.println(sb1);// 12345
		System.out.println(sb1.length() + " " + sb1.capacity());// 5 21
		StringBuilder sb2 = sb1.append(123.4567);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1 == sb2);// t
		sb2=sb1.append(false).append("abcd").append(new Date());
		System.out.println(sb1==sb2);//t
		System.out.println(sb1.length()+" "+sb1.capacity());
		System.out.println(sb1);
		sb1.insert(0,new char[] {'z','y','x'});
		System.out.println(sb1);
		sb1.delete(0, sb1.length());
		System.out.println("sb after delete "+sb1);
		System.out.println(sb1.length()+" "+sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.length()+" "+sb1.capacity());
	}

}
