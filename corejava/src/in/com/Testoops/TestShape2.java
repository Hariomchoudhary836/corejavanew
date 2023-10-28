package in.com.Testoops;

public class TestShape2 {
public static void main(String[] args) {
	Shape2 s = new Shape2();
	s.setName("hariom");
	s.setId(13);
	
	System.out.println(s.getName());
	System.out.println(s.getId());
	
	Rectangle1 r = new Rectangle1();
	r.setLength(34);
	r.setWidth(12);
	r.setName("mohan");
	r.setId(230);
    
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	System.out.println(r.getName());
	System.out.println(r.getId());
}
}
class Shape2{
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
class Rectangle1 extends Shape2{
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
