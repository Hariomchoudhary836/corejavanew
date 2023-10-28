package in.com.Exception1;

public class prectice1 {
public static void main(String[] args) {
	int a = 10;
	int b = 5;
	
	try {
		String name ="Mohit";
		System.out.println(name.charAt(3));
	} catch (Exception e) {
		System.out.println(e);
	}
	
	try {
		int id = 20;
		System.out.println(id);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
