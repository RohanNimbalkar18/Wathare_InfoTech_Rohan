package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// test generic method
		// Class : java.util.Arrays
		// public static <T> List<T> asList(T... t)
		List<String> stringList = 
				new LinkedList<>(Arrays.asList("one", "two", "three", "four"));
		System.out.println(stringList);
		 stringList.add(0,"zero");//exc : unsupported op exc: fixed size list
		 stringList.remove(4);
		stringList.set(0, "AAAA");
		System.out.println(stringList);

	}

}
