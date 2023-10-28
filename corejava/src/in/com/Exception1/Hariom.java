package in.com.Exception1;

public class Hariom {
public static void main(String[] args) {
	Hari_check hari = new Hari_check();
	String name = "Hariom";
	if (name.equals("Hariom")) {
		System.out.println("it is volid");
	}
	else {
	try {
		throw hari;
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
}