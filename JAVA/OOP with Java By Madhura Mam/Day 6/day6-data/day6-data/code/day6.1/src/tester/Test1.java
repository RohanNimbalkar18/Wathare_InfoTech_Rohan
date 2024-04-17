package tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		// create empty HS to store emp type of refs
		HashSet<Employee> emps=new HashSet<>();//size=0,initCapa=16,L.F=0.75f
		Employee e1=new Employee("rnd-001", "abc1", 10000);
		Employee e2=new Employee("rnd-001", "abc1", 10000);
		Employee e3=new Employee("rnd-001", "abc1", 10000);
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//f
		System.out.println("Added "+emps.add(e3));//f
		System.out.println("size "+emps.size());//1
		for(Employee e : emps)
			System.out.println(e);
//		System.out.println(e1.equals(e2));//t
//		System.out.println(e1.equals(e3));//t
		

	}

}
