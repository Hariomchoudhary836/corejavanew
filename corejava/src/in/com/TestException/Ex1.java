package in.com.TestException;

public class Ex1 {
  public static void main(String[] args) {
	int a = 10;
	int b = 5;
	
	try {
		String name = "hariom";
		System.out.println(name.charAt(2));
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		int c = a+b;
		int d = a-b;
		System.out.println("add = "+c+"\nsub = "+d);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
