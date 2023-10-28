package in.com.Cloning;

public class AdharTest {
   public static void main(String[] args) throws CloneNotSupportedException {
	  CendidedName name = new CendidedName("hariom", "Rasgaon", 657843);
	  CendidedName name2 = (CendidedName) name.clone();
	  
	  name2.name = "Shyam";
	  name2.addres = "Lonara";
	  name2.a.adharno = 6574444;
	  
	  System.out.println(name.name);
	  System.out.println(name.addres);
	  System.out.println(name.a.adharno);
	  
	  System.out.println(name2.name);
	  System.out.println(name2.name);
	  System.out.println(name2.a.adharno);
}
}