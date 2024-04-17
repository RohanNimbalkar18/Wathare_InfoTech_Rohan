package tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test3 {

	public static void main(String[] args) {
		// create empty HS to store emp type of refs
		HashSet<Employee> emps=new HashSet<>();//size=0,initCapa=16,L.F=0.75f
		Employee e1=new Employee("BBBB", "abc1", 10000);
		Employee e2=new Employee("AaBB", "abc2", 11000);
		Employee e3=new Employee("AaAa", "abc1", 10000);
		Employee e4=new Employee("BBAa", "abc3", 30000);
		Employee e5=new Employee("BBAa", "abc6", 60000);
		
		System.out.println("Added "+emps.add(e1));//t , hc: 1
		System.out.println("Added "+emps.add(e2));//t , hc: 1 , eq : 1
		System.out.println("Added "+emps.add(e3));//t , hc: 1 , eq : 2
		System.out.println("Added "+emps.add(e4));// t, hc: 1 , eq : 3
		System.out.println("Added "+emps.add(e5));//f , hc: 1 , eq 3
		 
		System.out.println("size "+emps.size());
		for(Employee e : emps)
			System.out.println(e);
		System.out.println("------------------------");
		System.out.println("BBBB".hashCode()+" "+"BBAa".hashCode());

		

	}

}
