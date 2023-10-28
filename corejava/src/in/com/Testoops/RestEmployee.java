package in.com.Testoops;

public class RestEmployee {
public static void main(String[] args) {
	Employee e = new Daveloper();
	e.ShowDatil();
	
	Daveloper d = new Daveloper();
	d.ShoeDatil();
}
}
class Employee{
	public void ShowDatil() {
		System.out.println("this is employee datil");
	}
}
class Daveloper extends Employee{
	public void ShoeDatil() {
		System.out.println("this is daveloper datel");
	}
}
