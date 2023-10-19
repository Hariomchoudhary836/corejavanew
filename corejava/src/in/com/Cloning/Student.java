package in.com.Cloning;

public class Student implements Cloneable{
   String name;
   
   
   Rays r = new Rays();

public Student(String name, int fees) {
	this.name = name;
	this.r.fees = fees;
}
   @Override
	protected Object clone() throws CloneNotSupportedException {
	  Student st1 = (Student) super.clone();
		st1.r = (Rays) r.clone();
		return st1;
	}  
}