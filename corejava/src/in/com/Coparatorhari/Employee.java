package in.com.Coparatorhari;

public class Employee {
   int empId;
   String phone;
   String name;
  
public Employee(int empId, String phone, String name) {
	this.empId = empId;
	this.phone = phone;
	this.name = name;
}
 @Override
	public String toString() {
		return empId +" "+phone+" "+name;
	}
}
