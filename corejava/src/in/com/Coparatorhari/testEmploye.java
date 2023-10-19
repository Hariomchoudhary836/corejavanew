package in.com.Coparatorhari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class testEmploye {
     public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"9098737836","Hariom"));
		emp.add(new Employee(102, "6376590969", "sagar"));
		emp.add(new Employee(100, "9285273781", "Narayan ji"));
		
		System.out.println(emp);
		
		Collections.sort(emp, new Comparatorid());
		System.out.println(emp);
		
		
	}
}
