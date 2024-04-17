package functional_strms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		// Create IntStream from 1-100 n display it
		IntStream.rangeClosed(1, 100) // IntStream nums 1-100
				.forEach(i -> System.out.print(i + " "));
		System.out.println("\n------------------------");
		// can u attach the intstrm to the array
		int[] ints = { 2, 3, 12, 45, 6, 89, -10 };
		Arrays.stream(ints) // IntStream
				.forEach(i -> System.out.print(i + " "));
		System.out.println("\n-----------------");
		// Create IntStream from 1-100 n display odd nos
		IntStream.range(1, 101) // IntStream nums 1-100
				.filter(i -> i % 2 != 0)// IntStream of odd
				.forEach(i -> System.out.print(i + " "));
		System.out.println("\n-----------------");
		// 2,3,12,45,6,89,10 --> display all even nos sorted as per asc order
		IntStream.of(2, 3, 12, 45, 6, 89, 10, 48, 16, 13, 9).filter(i -> i % 2 == 0) // IntStream : even nos
				.sorted()// sorted int strm : N.O
				.forEach(i -> System.out.print(i + " "));
		// display squares of all odd nos from 1-50
		System.out.println("\n-----------------");
		IntStream.rangeClosed(1, 50) // IntStream 1---50
				.filter(i -> i % 2 != 0) // odd nos
				.map(i -> i * i)// new IntStream : sq of odd nos
				.forEach(i -> System.out.print(i + " "));
		// display sum of squares of odd nos from 1-50
		System.out.println("\n-----------------");
		int sum = IntStream.rangeClosed(1, 50) // IntStream 1---50
				.filter(i -> i % 2 != 0) // odd nos
				.map(i -> i * i)// new IntStream : sq of odd nos
				.sum();
		System.out.println("sum=" + sum);
		// display count of elems > 10
		System.out.println("\n-----------------");
		long count = IntStream.of(2, 3, 12, 45, 6, 89, 10, 48, 16, 13, 9).filter(i -> i > 10).count();
		System.out.println("no of elems > 10 " + count);
		// check if given nos contain an odd no
		boolean contains = IntStream.of(2, 3, 12, 45, 6, 89, 10, 48, 16, 13, 9).anyMatch(i -> i % 2 != 0);
		System.out.println("Odd no " + (contains ? "Exists" : "Doesn't exist"));
		// display 1st odd elem from the IntStream , if exists ,
		//o.w throw the system exc
		int firstOdd = IntStream.of(2,  12, 46, 6)
		.filter(i -> i % 2 !=0) //odd no
		.findFirst() //OptionalInt : 1st odd
		.orElseThrow();//rets elem or throws the exc
		System.out.println("1st odd no "+firstOdd);

	}

}
