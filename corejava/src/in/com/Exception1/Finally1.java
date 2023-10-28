package in.com.Exception1;

public class Finally1 {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	String name = "Hariom";
	try {
		System.out.println(name.charAt(3));
	} catch (Exception e) {
		System.out.println(e);
	}
	
	try {
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
