package generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import static generics.GenericUtils.*;

public class Test4 {

	public static void main(String[] args) {
		// Vector<Integer>
		Vector<Integer> v1 = new Vector<>(Arrays.asList(10, 2, 3, 4, 5, 6, 0));
		displayCollectionElems(v1);
		// Javac error since even though Integer IS A Object ,
		// Collection<Object>
		// IS NOT a super type of Vector<Integer>
		// HS : Double
		System.out.println("-------------------------");
		HashSet<Double> hs = new HashSet<>
		(Arrays.asList(10.0, 2.1, 3.7, 4.0, 2.4));
		displayCollectionElems(hs);
		System.out.println("------------------");
		//shuffle a list of Integer
		List<Integer> list=Arrays.asList(10,2,3,45,11);
		Collections.shuffle(list);
		System.out.println(list);
		Object o=100;
		o="gfjgf";
		o=LocalDate.now();
	}

}
