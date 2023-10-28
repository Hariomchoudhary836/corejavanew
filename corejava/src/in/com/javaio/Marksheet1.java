package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Marksheet1 {

public static void main(String[] args) throws IOException {
	FileOutputStream in = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\javzio\\Marksheet.txt");
	ObjectOutputStream out = new ObjectOutputStream(in);
	
	Marksheet n = new Marksheet();
	n.name = "hsjs";
	n.html = 32;
	n.id=33;
	n.java = 34;
	n.javascript = 23;
	n. totel = 3673;
	
	out.writeObject(n);
	in.close();
	out.close();
 
}
}