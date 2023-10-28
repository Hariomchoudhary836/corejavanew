package in.com.TestException;

public class RaysTecnology {
  public static void main(String[] args) {
	  Rays rs = new Rays();
	String name = "hariom";
	if (name.equals("hariom")) {
		System.out.println("volid");
	}
	else {
	try {

		throw rs;
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
}