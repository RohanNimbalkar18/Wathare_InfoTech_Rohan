package func_prog;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> intList=List.of(10,1,2,3,4,512,34);
		intList.forEach(i -> System.out.print(i+"  "));

	}

}
