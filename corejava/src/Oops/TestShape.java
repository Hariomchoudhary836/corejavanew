package Oops;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setColor("blue");
	s.setBordrwidth(23);
	
	System.out.println(s.getColor());
	System.out.println(s.getBordrwidth());
}
}
