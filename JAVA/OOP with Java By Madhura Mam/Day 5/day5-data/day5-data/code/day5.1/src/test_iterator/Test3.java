package test_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] data= {10,1,4,45,-20,12,3,6,7,8};
		for(int i : data)
			list.add(i);
		Iterator<Integer> itr=list.iterator();
	//	list.add(1234);//structural modi
	//	list.remove(0);//structural modi
		list.set(0,101);
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");//concmodiexc
//			itr.remove();
		}
		System.out.println("list again "+list);

	}

}
