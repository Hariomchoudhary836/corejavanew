package in.com.Coparatorhari;

import java.util.Comparator;

public class Comparatorid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empId-o2.empId;
	}
}
