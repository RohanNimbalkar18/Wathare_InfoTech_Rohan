package wrappers;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Integer i1=new Integer(100);
		Integer i1 = Integer.valueOf(100); 
		Integer i2 = Integer.valueOf("12345");
		int data = i1.intValue();
		Integer i3 = 12345;
		System.out.println(i3.getClass()); 
		Double d1 = 34.56;
		String s = "2345";
		 s++;
		i1++;		 
		System.out.println(i1);
		i1 *= 20;
		System.out.println(i1);
		double d2 = 123.45f;
		 Double d3=123.456f;
		Double d3 = (double) 123.456f;
		 Double d4=12345;
		Number n1 = 123.456f;
		System.out.println(n1.getClass());
		n1 = 100;
		System.out.println(n1.getClass());
		 n1=true;
		Object o = 100;
		o = 123.456F;
		o = 12.456;
		o = false;
		System.out.println(o.getClass());
		o = new Date();
		o = "dfgfdgdf";
		/*
		 * Java is not pure OOP based language.(since it 
		 * supports primitive types , for the efficiency purpose)
		 * BUT Object type of a ref(Object o) can DIRECTLY
		 * refer to any prim type(auto boxing, up casting) as well as
		 * ref type(up casting)
		 * 
		 */

	}

}
