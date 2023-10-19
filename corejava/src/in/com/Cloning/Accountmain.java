package in.com.Cloning;

public class Accountmain {
	public static void main(String[] args) throws CloneNotSupportedException {
     Account a = new Account(134);
     Account a1 = (Account) a.clone();
     a1.balance = 145;
     
     System.out.println(a1.balance);
     System.out.println(a1.balance);
     
}
}