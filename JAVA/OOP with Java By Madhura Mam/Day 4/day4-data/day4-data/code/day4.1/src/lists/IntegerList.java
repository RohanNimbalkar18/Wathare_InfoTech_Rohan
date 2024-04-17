package lists;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {

	public static void main(String[] args) {
		int[] data = { 1, 4, 10, 5, 12, -10, 45, 10, 12, 10, 100 };
		// Create empty AL to store Integer type of refs
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Def AL contents : ");
		for (int i : list) // auto un boxing
			System.out.println(i);
		// populate the AL from the sample data
		for (int i : data) // i=data[0] , i=data[1]....i=data[dat.length-1]
			list.add(i);// auto boxing (int --> Integer) list.add(Integer.valueOf(i))
		System.out.println("list via toString " + list);
		// can u iterate over the list using for-each : yes
		System.out.println("populated list using for-each");
		for (int i : list)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("populated list using for loop");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		list.add(0, 99);
		System.out.println("list again " + list);
		System.out.println(list.contains(10));// t
		System.out.println(list.indexOf(10) + " " + list.lastIndexOf(10));
		list.remove(list.size() - 1);
		System.out.println("list again " + list);
		System.out.println("replaced " + list.set(1, 555));
		System.out.println("list again " + list);
		//sort the list as per asc order
		Collections.sort(list);
		System.out.println("sorted list " + list);
	}

}
