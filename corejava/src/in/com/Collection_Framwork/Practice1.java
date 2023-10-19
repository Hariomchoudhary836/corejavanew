package in.com.Collection_Framwork;

public class Practice1 {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(a); //autoBoxing
		System.out.println(a);
		System.out.println(b);
		
		Integer c = new Integer (100); //unboxing
		int d = c;
		System.out.println(c);
		System.out.println(d);
	}
}
