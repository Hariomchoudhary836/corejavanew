package Oops;

public class testRoom {
public static void main(String[] args) {
	   
	Room r = new Room();
	r.setColor("green");
	r.setLength(14);
	
	System.out.println(r.getColor());
	System.out.println(r.getLength());
	
	Student s = new Student();
	s.setSize(5);
	s.setName("mohit , mohan , hariom , soham");
	
	System.out.println(s.Size);
	System.out.println(s.name);
	System.out.println(s.color);
	System.out.println(s.length);
   }
}
   class Room{
	   String color = "hari";
	   int length = 12;
	   
	   public void setColor(String color) {
		   this.color = color;
	   }
	   public String getColor() {
		   return color;
	   }
	   public void setLength(int length) {
		   this.length = length;
	   }
	   public int getLength() {
		   return length;
	   }
   }
   
   class Student extends Room{
	   int Size = 8;
	   String name = null;
	   
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
