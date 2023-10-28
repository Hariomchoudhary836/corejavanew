package Oops;

public class TestShape_Inheritens {
public static void main(String[] args) {
	Inheritens_Shape is = new Inheritens_Shape();
	is.setColor("blue");
	is.setBw(13);
	
	System.out.println(is.getColor());
	System.out.println(is.getBw());
	
	Rectangle r = new Rectangle();
	r.setWidth(12);
	r.setLength(20);
	r.setColor("green");
	r.setBw(15);
	
	System.out.println(r.getWidth());
	System.out.println(r.getLength());
	System.out.println(r.getColor());
	System.out.println(r.getBw());
}
}