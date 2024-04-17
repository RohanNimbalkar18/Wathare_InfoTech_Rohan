package test_iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		int[] data = { 10, 1, 4, 45, -20, 12, 3, 6, 7, 8 };
		for (int i : data)
			list.add(i);
		// display the list contents using ListIterator , in reverse order
		ListIterator<Integer> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious())
			System.out.print(listItr.previous() + " ");
		

	}

}
