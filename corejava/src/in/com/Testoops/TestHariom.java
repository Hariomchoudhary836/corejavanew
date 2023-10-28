package in.com.Testoops;

public abstract class TestHariom {
public static void main(String[] args) {
	Rectangle12 r = new Rectangle12() {
	};
	r.area();
	r.hello();
	
	Hariom h = new Hariom() {
		
		@Override
		public void area() {
		System.out.println("this is Hariom area");
			
		}
	};
	h.area();
	h.hello();
}
}

abstract class Hariom{
	public void hello() {
		System.out.println("hello avry one i an hariom");
	}
	public abstract void area();
}

 abstract class Rectangle12 extends Hariom{
	public void area() {
		System.out.println("this is rectengle area");
	}
}