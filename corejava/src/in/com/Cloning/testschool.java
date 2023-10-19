package in.com.Cloning;

public class testschool {
  public static void main(String[] args) throws CloneNotSupportedException {
	School s = new School(234);
	School s1 = (School) s.clone();
	s1.fees = 456;
	
	System.out.println(s.fees);
	System.out.println(s1.fees);
	
}
}
