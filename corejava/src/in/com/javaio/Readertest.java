package in.com.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readertest {
     public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\javzio\\hr1.txt");
		int ch = fr.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}
		fr.close();
	}
}
