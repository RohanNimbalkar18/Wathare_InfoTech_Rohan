package tester;

import java.util.HashSet;

import com.app.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		// create empty HS to store emp type of refs
		HashSet<Employee> emps=new HashSet<>();//size=0,initCapa=16,L.F=0.75f
		Employee e1=new Employee("rnd-001", "abc1", 10000);
		Employee e2=new Employee("rnd-001", "abc1", 10000);
		Employee e3=new Employee("rnd-001", "abc1", 10000);
		Employee e4=new Employee("rnd-003", "abc3", 30000);
		Employee e5=new Employee("rnd-006", "abc6", 60000);
		Employee e6=new Employee("rnd-004", "abc4", 40000);
		System.out.println("Added "+emps.add(e1));//t , hc: 1
		System.out.println("Added "+emps.add(e2));//f , hc: 1 , eq : 1
		System.out.println("Added "+emps.add(e3));//f , hc: 1 , eq : 1
		System.out.println("Added "+emps.add(e4));//t , hc: 1 , 
		System.out.println("Added "+emps.add(e5));//t , hc: 1 , 
		System.out.println("Added "+emps.add(e6));//t , hc: 1 
		System.out.println("size "+emps.size());//4
		for(Employee e : emps)
			System.out.println(e);

		

	}

}
