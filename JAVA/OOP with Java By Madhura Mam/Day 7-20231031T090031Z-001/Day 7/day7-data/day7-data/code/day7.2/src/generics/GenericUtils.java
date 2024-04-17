package generics;

import java.util.Collection;
import java.util.List;

import com.app.core.Emp;
import com.app.core.Mgr;
import com.app.core.PermanentWorker;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;
import com.app.core.Worker;

public class GenericUtils {
//add a static method to display contents of ANY array
	public static void displayArrayElems(Object[] elems) {
		for (Object o : elems)
			System.out.println(o);
	}

	// add a static method to display contents of ANY Collection
	// Test cases : AL<String> , Vector<Integer> ,
	// HS<Fruit> , TS<Customer> , LL , LHS ....
//	public static void displayCollectionElems(Collection<Object> collection)
//	{
//		for(Object o : collection)
//			System.out.println(o);
//	}
	public static void displayCollectionElems(Collection<?> collection) {
		for (Object o : collection)
			System.out.println(o);
	}

	/*
	 * Add a method to return sum of salary of emps from any List Test cases :
	 * AL<Mgr> ,LL<TempWorker> , Vector<SM> ....
	 */
	public static double computeSumOfSalary(List<? extends Emp> list) {
		double sum = 0;
		for (Emp e : list)
			sum += e.computeSalary();
		// what will happen :
		/*
		 * list.add(new Mgr(..); list.add(new SM(..)); //worker, tempworker , ....Object
		 */
//		list.add(new Mgr(1234));
//		list.add(new SalesMgr(1234));
//		list.add(new PermanentWorker(1234));
//		list.add(new TempWorker(1234));
//		list.add(new Object());
		list.add(null);
		return sum;
	}
	/*
	 * Write a method to add ANY Mgr (SalesMgr/FinanceMgr/HrMgr ) 
	 * to ANY
	 * List(AL/LL/Vector)
	 */
	public static void addMgr(List<? super Mgr> mgrList,Mgr newMgr)
	{
		//List : acting as consumer : super
		//What all will you be able to add to such a list?
		//Mgr or it's sub type
		mgrList.add(newMgr);
		mgrList.add(new Mgr(100));
	//	mgrList.add(new Object());
	//	mgrList.add(new Worker(1234));
		
	}
}
