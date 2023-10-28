package in.com.Oops;

class Inheritens_car1 {
   String name = "Rays";
   int fees = 900000;
}

class car_soroom extends Inheritens_car1{
	String tayar = "MRF";
	int price = 30000;
}
   
 public class Inheritens_car{
	public static void main(String[] args) {
		Inheritens_car1 ic = new Inheritens_car1();
	 
		System.out.println(ic.name);
		System.out.println(ic.fees);
		
		car_soroom cs = new car_soroom();
		System.out.println(cs.tayar);
		System.out.println(cs.price);
		System.out.println(cs.name);
		System.out.println(cs.fees);
	}
}