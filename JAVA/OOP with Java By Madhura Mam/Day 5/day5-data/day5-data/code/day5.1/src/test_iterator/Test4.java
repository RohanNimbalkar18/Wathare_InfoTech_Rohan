package test_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] data = { 10, 1, 4, 45, -20, 12, 3, 6, 7, 8 };
		for (int i : data)
			list.add(i);
		// display the list contents using ListIterator , in reverse order
		ListIterator<Integer> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious())
			System.out.print(listItr.previous() + " ");
		System.out.println();
		System.out.println("next " + listItr.next());
		System.out.println("prev" + listItr.previous());

	}

}
