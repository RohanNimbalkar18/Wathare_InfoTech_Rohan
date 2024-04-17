package generics;

import java.util.Arrays;
import java.util.LinkedList;

import com.app.core.TempWorker;
import static generics.GenericUtils.*;

public class Test5 {

	public static void main(String[] args) {
		// LL<TempWorker> , Vector<SM>
		LinkedList<TempWorker> tempWorkers = new LinkedList<>(
				Arrays.asList(new TempWorker(1000), new TempWorker(1100)));
		double sum = computeSumOfSalary(tempWorkers);
		System.out.println(sum);
		//try it out for : Vector<SM>
	}

}
