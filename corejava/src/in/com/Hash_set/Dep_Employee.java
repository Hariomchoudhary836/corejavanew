package in.com.Hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Dep_Employee {

public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<>();
	Department dep = new Department(10, 11000, "hariom");
	Department dep1 = new Department(11, 18000, "hari");
	Department dep2 = new Department(14, 12000, "mohan");
	Department dep3 = new Department(16, 15000, "sohan");

	Employee em = new Employee(12, "Shyam", dep1);
	Employee em1 = new Employee(13, "Shyad", dep1);
	Employee em2 = new Employee(14, "Shyaf", dep1);
	Employee em3 = new Employee(15, "Shyag", dep1);
	
	hs.add(em);
	hs.add(em1);
	hs.add(em2);
	hs.add(em3);
	
	System.out.println("employee id shot");
	TreeSet<Employee> ts = new TreeSet<>();
	Iterator<Employee> it = ts.iterator();
	while (it.hasNext()) {
		Employee employee = (Employee) it.next();
		
	}
}
}