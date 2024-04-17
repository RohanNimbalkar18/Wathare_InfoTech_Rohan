package generics;
import static generics.GenericUtils.*;

public class Test3 {

	public static void main(String[] args) {
		// int[]
		Integer[] ints= {12,4,5,6,7123,45};//auto boxing
		displayArrayElems(ints);
		System.out.println("-------------------");
		String[] strings= {"one","two","three"};
		displayArrayElems(strings);

	}

}
