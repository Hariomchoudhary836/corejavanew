package in.com.Cloning;

public class Raystest {
   public static void main(String[] args) throws CloneNotSupportedException {
	Student st = new Student("hari", 3678);
	Student st2= (Student) st.clone();
	
	st2.r.fees = 6000;
	st2.name = "sagar";
	
	System.out.println(st.r.fees);
	System.out.println(st.name);
	
	System.out.println(st2.r.fees);
	System.out.println(st2.name);
}
}
