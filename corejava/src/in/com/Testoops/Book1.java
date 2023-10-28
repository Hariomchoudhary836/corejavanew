package in.com.Testoops;

public class Book1 {
	public static void main(String[] args) {
		Book b = new Book();
		b.read();
		b.read("self learn");
		b.read("mohit", 200);
	}
}

class Book{
public void read() {
	System.out.println("i am reading book");
}
public void read(String bookname) {
	System.out.println("i an reading book"+bookname);
}
public void read(String writer,int rate) {
	System.out.println(writer);
	System.out.println(rate);
}
}
