package in.com.Exception1;

public class prectice {
  public static void main(String[] args) {
	int a = 15;
	int b = 10;
	
	try {
		String name = "Hariom";
		System.out.println(name.charAt(1));
		//System.exit(0);
	}catch (Exception e) {
		System.out.println();
	}
	
		try {
			String name1 = "Mohanlal";
			System.out.println(name1.charAt(5));
	} catch (Exception e) {
        System.out.println(e);
	}
		
		try {
			int c = a/b;
			System.out.println("division = "+c);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int c = a+b;
			int d = a*b;
			int f = a-b;
			int g = a%b;
			System.out.println("add = "+c+"\nmul ="+d+"\nsub ="+f+"\nmodu ="+g);
		} catch (Exception e) {
		    System.out.println(e);
		} 
		finally {
			int e=20,d=40;
			int c=d+e;
			System.out.println(c);
		}
  }
}
