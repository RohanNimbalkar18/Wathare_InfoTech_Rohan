package test_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] data= {10,1,4,45,-20,12,3,6,7,8};
		for(int i : data)
			list.add(i);
		//display the list contents using explicit Iterator
		//1 attach Iterator
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");//itr : after the last elem
	//	System.out.println(itr.next());//NoSuchElemExc
	//	System.out.println(list.get(list.size()));//IndexOutOfBoundsExc

	}

}
