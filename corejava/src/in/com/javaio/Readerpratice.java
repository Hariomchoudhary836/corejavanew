package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readerpratice {
   public static void main(String[] args) throws IOException {
	FileReader r = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
	int ch = r.read();
	while (ch != -1) {
		System.out.print((char)ch);
		ch = r.read();
	}
	r.close();
}
}
