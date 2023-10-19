package in.com.Cloning;

public class testAcc {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c = new Customer("hari",101);
		Customer c1 = (Customer) c.clone();
		c1.name = "mohan";
		c1.a.balance = 10;
		
		System.out.println(c.name);
		System.out.println(c.a.balance);
		
		System.out.println(c1.name);
		System.out.println(c1.a.balance);
	}
}